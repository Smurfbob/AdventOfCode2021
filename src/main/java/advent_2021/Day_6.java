package advent_2021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day_6 {

    public static long getNumbersOfFish(String input, long days)
    {
        List<Long> listOfFish = Arrays.stream(input.split(",")).map(el -> new Scanner(el).nextLong()).collect(Collectors.toList());

        listOfFish = Day_6.calcDays(listOfFish, days);

        return listOfFish.size();
    }

    public static List<Long> calcDays(List<Long> listOfFish, long days)
    {

        for(long i=0 ; i < days ; i++)
        {
            long found = 0;

            for(long k=0 ; k < listOfFish.size() ; k++)
            {
                if(listOfFish.get((int)k) != 0)
                {
                    listOfFish.set((int)k, listOfFish.get((int)k)-1);
                }
                else
                {
                    listOfFish.set((int)k,(long)6);
                    found++;
                }
            }

            for(long k=0 ; k < found ; k++)
            {
                listOfFish.add((long)8);
            }

        }

        return listOfFish;
    }

}
