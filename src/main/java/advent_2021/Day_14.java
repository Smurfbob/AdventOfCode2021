package advent_2021;

import java.util.*;
import java.util.stream.Collectors;

public class Day_14
{
    public static int getValue(String input)
    {
        Mapper mapper = new Mapper(input);
        String step1 = mapper.doSteps(3);

        return 0;
    }


    public static class Mapper
    {
        public final String code;
        public final Map<String,String> pairMap;

        public Mapper(String input)
        {
            List<String> list = Arrays.stream(input.split("\n")).collect(Collectors.toList());
            this.code = list.get(0);
            list.remove(0);
            list.remove(0);
            this.pairMap = genPairMap(list);

        }

        public Map<Character,Integer> getCountMap(int steps)
        {
            Map<Character,Integer> map = new HashMap<>();
            String code = this.doSteps(steps);
            for(char el : code.toCharArray())
            {
                if(map.containsKey(el))
                {
                    map.put(el, map.get(el)+1);
                }
                else
                {
                    map.put(el, Integer.valueOf(1));
                }
            }
            return map;
        }

        public String doSteps(int steps)
        {
            List<String> newPairs = new LinkedList<>();
            String start = this.code;

            for(int i=0 ; i < steps ; i++)
            {
                List<String> listOfPairs = genPairs(2, start);
                for(int k=0 ; k < listOfPairs.size() ; k++)
                {
                    String el = listOfPairs.get(k);

                    if(this.pairMap.containsKey(el))
                    {
                        if(k == 0)
                        {
                            newPairs.add("" + el.charAt(0) + this.pairMap.get(el) + el.charAt(1) );
                        }
                        else
                        {
                            newPairs.add("" + this.pairMap.get(el) + el.charAt(1));
                        }

                    }
                }
                start = String.join("", newPairs);
                newPairs = new LinkedList<>();
            }

            return start;
        }

        private static List<String> genPairs(int pairCout, String code)
        {
            List<String> list = new LinkedList<>();
            String next = new String();

            for(int i=0 ; i < code.length() ; i++)
            {

                for(int k = 0; k < pairCout ; k++)
                {
                    if(i+k < code.length())
                    {
                        next = next + code.charAt(i+k);
                    }
                }
                if(next.length() == pairCout && !next.isEmpty())
                {
                    list.add(next);
                }
                next = new String();
            }


            return list;
        }

        private static Map<String,String> genPairMap(List<String> list)
        {
            Map<String,String> map = new HashMap<>();

            for(String el : list)
            {
                String[] array = el.split("->");
                map.put( removeChar(array[0], ' '), removeChar(array[1], ' '));
            }
            return map;
        }

        private static String removeChar(String input , char c)
        {
            String out = new String();
            for(char el : input.toCharArray())
            {
                if(el != c)
                {
                    out = out + el;
                }
            }
            return out;
        }

        private static String removeCharAt(String input ,int index)
        {
            String out = new String();
            for(int i=0 ; i < input.length() ; i++)
            {
                if(i != index)
                {
                    out = out + input.charAt(i);
                }
            }
            return out;
        }
    }
}
