package advent_2021;

import java.util.*;
import java.util.stream.Collectors;

public class Day_13
{

    public static record NumberPair(int x, int y)
    {
    }

    public static record DataModel(int x, int y, List<NumberPair> pairs)
    {
    }

    public static int getResult (String input)
    {
        DataModel model = genDataModel(input);
        Optional<String[][]> sections = genSections(model);
        System.out.println(genSectionString(sections.get()));

        return 0;
    }

    public static String genSectionString (String[][] sections)
    {
        String out = new String();
        for (String[] el1 : sections)
        {
            for (String el2 : el1)
            {
                out = out + el2;
            }
            out = out + "\n";
        }

        return out;
    }

    public static Optional<String[][]> genSections (DataModel model)
    {
        OptionalInt xMax = model.pairs.stream().mapToInt(el -> el.x).max();
        OptionalInt yMax = model.pairs.stream().mapToInt(el -> el.y).max();

        if (xMax.isPresent() && yMax.isPresent())
        {
            int xM = xMax.getAsInt();
            int yM = yMax.getAsInt();
            xM++;
            yM++;

            String[][] sections = new String[yM][xM];
            for (int i = 0; i < sections.length; i++)
            {
                for (int k = 0; k < sections[i].length; k++)
                {
                    sections[i][k] = new String(".");
                }
            }
            for (NumberPair pair : model.pairs)
            {
                sections[pair.y][pair.x] = "#";
            }

            return Optional.of(sections);
        }

        return Optional.empty();
    }

    private static DataModel genDataModel (String input)
    {
        List<String> list = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        int orderX = new Scanner(list.get(list.size() - 1).split("=")[1]).nextInt();
        int orderY = new Scanner(list.get(list.size() - 2).split("=")[1]).nextInt();
        List<NumberPair> numberPairList = findNumberPairs(list).stream().map(Day_13::getNumberPair).collect(Collectors.toList());
        return new DataModel(orderX, orderY, numberPairList);
    }

    private static NumberPair getNumberPair (String string)
    {
        String[] array = string.split(",");
        return new NumberPair(new Scanner(array[0]).nextInt(), new Scanner(array[1]).nextInt());
    }

    private static List<String> findNumberPairs (List<String> list)
    {
        List<String> listOut = new ArrayList<>();
        int counter = 0;
        while (counter < list.size() && !list.get(counter).equals(""))
        {
            listOut.add(list.get(counter));
            counter++;
        }
        return listOut;
    }


}
