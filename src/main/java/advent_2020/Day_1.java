package advent_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day_1
{


    public static long calcValue(String numbers)
    {
        List<Integer> list = Arrays.stream(numbers.split("\n")).map(el -> new Scanner(el).nextInt()).collect(Collectors.toList());

        for(int i=0 ; i < list.size() ; i++)
        {
            for(int k=0 ; k < list.size() ; k++)
            {
                for(int z = 0; z < list.size() ; z++)
                {
                    if(list.get(z) + list.get(k) + list.get(i) == 2020)
                    {
                        System.out.println("I: " + list.get(i));
                        System.out.println("K: " + list.get(k));
                        System.out.println("Z: " + list.get(z));
                        return list.get(i)*list.get(k)*list.get(z);
                    }
                }
            }
        }

        throw new RuntimeException("No pairs add up to 2020!");
    }
}
