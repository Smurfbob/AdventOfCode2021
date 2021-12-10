package advent_2019;

import advent_2019.day_8.Day_8;
import org.junit.jupiter.api.Test;

class Day_8Test
{
    @Test
    public void test()
    {
        System.out.println(Day_8.getLayerWithFewestZeroDigits(testInput,3,2));
    }


    private static final String testInput = "123456789012";
}