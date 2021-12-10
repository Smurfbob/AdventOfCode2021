package advent_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day_10Test
{
    @Test
    public void test ()
    {
        assertEquals(26397, Day_10.calcPoints(testInput));
        System.out.println(Day_10.calcPoints(testInput));
    }


    public static final String testInput =
            "[({(<(())[]>[[{[]{<()<>>\n" +
                    "[(()[<>])]({[<{<<[]>>(\n" +
                    "{([(<{}[<>[]}>{[]{[(<()>\n" +
                    "(((({<>}<{<{<>}{[]{[]{}\n" +
                    "[[<[([]))<([[{}[[()]]]\n" +
                    "[{[{({}]{}}([{[{{{}}([]\n" +
                    "{<[[]]>}<{[{[{[]{()[[[]\n" +
                    "[<(<(<(<{}))><([]([]()\n" +
                    "<{([([[(<>()){}]>(<<{{\n" +
                    "<{([{{}}[<[[[<>{}]]]>[]]";
}