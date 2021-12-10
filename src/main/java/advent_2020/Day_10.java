package advent_2020;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day_10
{
    public static int calcPoints(String input)
    {
        List<Line> list = Arrays.stream(input.split("\n")).map(Line::new).collect(Collectors.toList());

        for(Line line : list)
        {
            System.out.println("Valid: " + line.points + " -> " + line.input);
        }

        return 0;
    }


    public static class Line
    {
        public enum BraceTyp
        {
            SPIKE('<', '>', 25137),
            ROUND('(',')', 3),
            RECT('[', ']', 57),
            ROUND_SPIKE('{', '}', 1197),

            NO_BRACE('#','#',0);

            public final char open, close;
            public final int points;
            BraceTyp (char open, char close, int points)
            {
                this.open = open;
                this.close = close;
                this.points = points;
            }
        }

        public final String input;
        public final int points;

        public Line(String input)
        {
            this.input = input;
            this.points = calcPoints(input);
        }

        public static BraceTyp getBraceTyp(char c)
        {
            for(BraceTyp el : BraceTyp.values())
            {
                if(c == el.open || c == el.close)
                {
                    return el;
                }
            }

            return BraceTyp.NO_BRACE;
        }

        private static int calcPoints (String input)
        {
            for(int i=0 ; i < input.length() ; i++)
            {
                char el = input.charAt(i);
                BraceTyp type = getBraceTyp(el);
                if(!checkBraceLine(type, i, input))
                {
                    return type.points;
                }
            }

            return 0;
        }

        public static boolean checkBraceLine(BraceTyp brace , int start , String input)
        {
            int open = 0;
            int closed = 0;
            for(int i=start ; i < input.length() ; i++)
            {
                char el = input.charAt(i);

                if(el == brace.open)
                {
                    open++;
                }
                else if (el == brace.close)
                {
                    closed++;
                }
            }

            return (open==closed);
        }

    }
}
