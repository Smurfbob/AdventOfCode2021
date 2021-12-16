package advent_2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day_15Test
{
    @Test
    public void test()
    {
        System.out.println(Day_15.countRiskLevel(testInput));

    }

    private static final String testInput =
            "1163751742\n" +
            "1381373672\n" +
            "2136511328\n" +
            "3694931569\n" +
            "7463417111\n" +
            "1319128137\n" +
            "1359912421\n" +
            "3125421639\n" +
            "1293138521\n" +
            "2311944581";
}