package advent_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day_2
{


    public static int calcResult (String string)
    {
        List<Integer> list = parseIntegers(string);
        list.set(1, Integer.valueOf(12));
        list.set(2, Integer.valueOf(2));

        List<OpCode> codes = findOpCodes(list);

        for(OpCode code : codes)
        {
            list = code.doOpCode(list);
        }

        return list.get(0);
    }


    public static List<OpCode> findOpCodes(List<Integer> list)
    {
        List<List<Integer>> listOfIntegerList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            List<Integer> listOfInts = new ArrayList<>();
            if (list.get(i) == 99)
            {
                break;
            } else if (list.get(i) == 1 || list.get(i) == 2)
            {
                List<Integer> now = new ArrayList<>();
                now.add(list.get(i));
                i++;
                for (int k = 0; k < 3; k++)
                {
                    if (i < list.size())
                    {
                        now.add(list.get(i));
                    }
                    i++;
                }

                listOfIntegerList.add(now);
                i--;
            }

        }

        return listOfIntegerList.stream().map(OpCode::new).collect(Collectors.toList());
    }


    public static class OpCode
    {
        public interface Calculation
        {
            int calc (int a, int b);
        }

        public enum Type
        {
            ONE(1, (a, b) -> a + b),
            TWO(2, (a, b) -> a * b);

            public final int id;
            public final Calculation calculation;

            Type (int id, Calculation calc)
            {
                this.calculation = calc;
                this.id = id;
            }
        }

        public final int a, b, c;
        public final Type type;

        public OpCode (List<Integer> list)
        {
            if (list.size() == 4)
            {
                this.type = (list.get(0) == 1) ? Type.ONE : Type.TWO;
                this.a = list.get(1);
                this.b = list.get(2);
                this.c = list.get(3);

            } else
            {
                throw new RuntimeException("Die Groesse der Liste ist nicht valide!");
            }
        }

        public List<Integer> doOpCode (List<Integer> list)
        {
            int n1 = list.get(this.a);
            int n2 = list.get(this.b);
            int value = type.calculation.calc(n1, n2);
            list.set(this.c, value);

            return list;
        }
    }

    private static List<Integer> parseIntegers (String string)
    {
        String number = new String();
        List<String> list = new ArrayList<>();
        for (char el : string.toCharArray())
        {
            if (el >= '0' && el <= '9')
            {
                number = number + el;
            } else
            {
                if (!number.equals(""))
                {
                    list.add(number);
                    number = "";
                }
            }
        }
        list.add(number);

        return list.stream().map(el -> {
            if(!el.equals("0"))
            {
                return new Scanner(el).nextInt();
            }
            return 0;
        }).collect(Collectors.toList());
    }

}
