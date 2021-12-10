package advent_2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day_1
{
    public static int calcValue(String input)
    {
        List<Integer> list = Arrays.stream(input.split("\n")).map(el -> new Scanner(el).nextInt()).collect(Collectors.toList());

        int sum = 0;
        for(int el : list)
        {
            while (el > 0)
            {
                int value = (el/3)-2;
                if(value <= 0)
                {
                    break;
                }
                sum += value;
                el = value;
            }
        }

        return sum;
    }
}
