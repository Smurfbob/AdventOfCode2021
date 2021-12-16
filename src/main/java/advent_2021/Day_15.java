package advent_2021;

import java.util.*;
import java.util.stream.Collectors;

public class Day_15
{
    public static record Position(int value, int x, int y)
    {
        public boolean equals(Position position)
        {
            return (this.x == position.x && this.y == position.y && this.value == position.value);
        }
    }


    public static int countRiskLevel (String input)
    {
        Position[][] numbers = convertStringToNumberArray(input);


        return 0;
    }

    public static List<Integer> getOnePath(Position[][] positions)
    {
        List<Integer> path = new LinkedList<>();
        Position startPoint = positions[0][0];
        Position endPoint = positions[positions.length-1][positions[0].length-1];

        while (!startPoint.equals(endPoint))
        {
            List<Position> points = getSurroundingPositions(positions, startPoint);

        }

        return path;
    }

    public static List<Position> getSurroundingPositions(Position[][] array, Position position)
    {
        List<Position> positions = new ArrayList<>();

        if(checkPosition(array, position.x+1, position.y))
        {
            positions.add(array[position.x+1][position.y]);
        }
        if(checkPosition(array, position.x-1, position.y))
        {
            positions.add(array[position.x-1][position.y]);
        }

        if(checkPosition(array, position.x, position.y+1))
        {
            positions.add(array[position.x][position.y+1]);
        }

        if(checkPosition(array, position.x, position.y-1))
        {
            positions.add(array[position.x][position.y-1]);
        }
        return positions;
    }

    public static <T> boolean checkPosition(T[][] array , int x, int y)
    {
        return ( (y >= 0 && y < array.length) && (x >= 0 && x < array[y].length) );
    }



    public static Position[][] convertStringToNumberArray (String input)
    {
        List<String> listOfStrings = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        Position[][] array = new Position[listOfStrings.size()][listOfStrings.get(0).length()];
        for (int i = 0; i < array.length; i++)
        {
            for (int k = 0; k < array[i].length; k++)
            {
                int value = new Scanner("" + listOfStrings.get(i).charAt(k)).nextInt();
                array[i][k] = new Position(value, i, k);
            }
        }
        return array;
    }
}
