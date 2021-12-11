package advent_2018;

import java.util.*;
import java.util.stream.Collectors;


public class Day_1
{

    public static int calcSum(String input) {

        Map<Integer, Boolean> map = new HashMap<>();

        List<Integer> list =  Arrays.stream(input.split("\n")).mapToInt(el -> new Scanner(el).nextInt()).boxed().collect(Collectors.toList());
        int value = 0;
        for(int el : list)
        {
            if(el >= 0)
            {
                for(int i=0 ; i < el ; i++)
                {
                    value++;
                    if(!map.containsKey(value))
                    {
                        map.put(value, true);
                    }
                    else
                    {
                        return value;
                    }
                }
            }
            else
            {
                el *= (-1);
                for(int i=0 ; i < el ; i++)
                {
                    value--;
                    if(!map.containsKey(value))
                    {
                        map.put(value, true);
                    }
                    else
                    {
                        return value;
                    }
                }
            }
        }

        throw new RuntimeException("No value found twice!");
    }

}
