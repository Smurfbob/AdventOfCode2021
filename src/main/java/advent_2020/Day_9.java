package advent_2020;

import java.util.*;
import java.util.stream.Collectors;

public class Day_9
{
    private static Point[][] array;

    public static int calcLowPointSum (String string)
    {
        array = genPointArray(string);
        List<Integer> listOfValues = genHighPointList();
        markBasins();
        // flatMap(array).stream().filter(el -> el.basin).mapToInt(el -> el.number).sum()
        return getSum(pointMap);
    }

    private static int getSum(Map<Point, List<Point>> pointMap)
    {
        List<Integer> list = new ArrayList<>();
        for(Point key : pointMap.keySet())
        {
            list.add(pointMap.get(key).size()+1);
        }
        int p = 1;

        list = lastThree(list);

        for(int el : list)
        {
            p *= el;
        }
        return p;

    }

    private static List<Integer> lastThree(List<Integer> list)
    {
        List<Integer> listOut = new ArrayList<>();

        for(int i=0 ; i < 3 ; i++)
        {
            int el = list.get(0);
            int p = 0;
            for(int k=0 ; k < list.size() ; k++)
            {
                if(el < list.get(k))
                {
                    el = list.get(k);
                    p = k;
                }
            }
            listOut.add(el);
            list.remove(p);
        }

        return listOut;
    }

    private static void printArray (Point[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int k = 0; k < array[i].length; k++)
            {
                if (array[i][k].basin)
                {
                    System.out.printf("%d ", array[i][k].number);
                } else
                {
                    System.out.printf("# ");
                }

            }
            System.out.printf("\n");
        }
    }

    private static <Typ> List<Typ> flatMap (Typ[][] array)
    {
        List<Typ> list = new ArrayList<>();
        for (Typ[] el1 : array)
        {
            for (Typ el2 : el1)
            {
                list.add(el2);
            }
        }
        return list;
    }

    private static void markBasins ()
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int k = 0; k < array[i].length; k++)
            {
                if (array[i][k].lowPoint)
                {
                    crawlThrowNumbers(array[i][k], array[i][k]);
                }
            }
        }


    }

    private static Map<Point,List<Point>> pointMap = new HashMap<>();

    private static void crawlThrowNumbers (Point now, Point start)
    {


        if(!pointMap.containsKey(start))
        {
            pointMap.put(start,new ArrayList<Point>());
        }

        array[now.i][now.k].basin = true;

        List<Point> adjacentNumbers = getAdjacentNumbers(now.i, now.k);
        for (Point el : adjacentNumbers)
        {
            if (el.number == now.number + 1 && el.number != 9 && !el.basin)
            {
                array[el.i][el.k].basin = true;
                if(!contains(pointMap.get(start), el))
                {
                    pointMap.get(start).add(el);
                }
                crawlThrowNumbers(el , start);
            }
        }

    }

    public static boolean contains(List<Point> points , Point point)
    {
        for(Point el : points)
        {
            if(el.i == point.i && el.k == point.k)
            {
                return true;
            }
        }
        return false;
    }



    private static List<Integer> genHighPointList ()
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
        {
            for (int k = 0; k < array[i].length; k++)
            {
                int now = array[i][k].number;
                List<Point> numbers = getAdjacentNumbers(i, k);
                if (isLowestNumber(numbers, now))
                {
                    list.add(now + 1);
                    array[i][k].lowPoint = true;
                }
            }
        }

        return list;
    }

    private static boolean isLowestNumber (List<Point> numbers, int now)
    {
        int lowCounter = 0;
        for (int z = 0; z < numbers.size(); z++)
        {
            Integer el = numbers.get(z).number;
            if (now < el)
            {
                lowCounter++;
            }
        }
        return (numbers.size() == lowCounter);
    }

    private static List<Point> getAdjacentNumbers (int i, int k)
    {
        List<Point> numbers = new ArrayList<>();
        if (validIndex(i + 1, k))
        {
            numbers.add(new Point(array[i + 1][k].number, i + 1, k));
        }
        if (validIndex(i - 1, k))
        {
            numbers.add(new Point(array[i - 1][k].number, i - 1, k));
        }
        if (validIndex(i, k + 1))
        {
            numbers.add(new Point(array[i][k + 1].number, i, k + 1));
        }
        if (validIndex(i, k - 1))
        {
            numbers.add(new Point(array[i][k - 1].number, i, k - 1));
        }

        return numbers;
    }

    public static boolean validIndex (int i, int k)
    {
        if (i < array.length && i >= 0)
        {
            return (k < array[i].length && k >= 0);
        }

        return false;
    }

    private static Point[][] genPointArray (String string)
    {
        List<String> list = Arrays.stream(string.split("\n")).collect(Collectors.toList());
        Point[][] numbers = new Point[list.size()][list.get(0).length()];
        for (int i = 0; i < list.size(); i++)
        {
            String el = list.get(i);
            for (int k = 0; k < el.length(); k++)
            {
                char c = el.charAt(k);
                numbers[i][k] = new Point(new Scanner(c + "").nextInt(), i, k);
            }
        }
        return numbers;
    }

    public static class Point
    {
        public final int number, i, k;
        public boolean lowPoint;
        public boolean basin;

        public Point (int number, int i, int k)
        {
            this.i = i;
            this.k = k;
            this.number = number;
            this.lowPoint = false;
            this.basin = false;
        }
    }
}