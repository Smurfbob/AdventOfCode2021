package advent_2018;

import java.util.*;
import java.util.stream.Collectors;

public class Day_2 {

    public static record intPair(int two, int three) {
        public int getValue() {
            return two * three;
        }
    }

    public static record CharPair(char x, char y) {
    }

    public static String countValues(String input) {
        List<Map<Character, Integer>> list = Arrays.stream(input.split("\n")).map(Day_2::genMapForString).collect(Collectors.toList());

        return getPair(input);
    }

    public static String getPair(String input) {

        List<String> list = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            String el1 = list.get(i);
            for (int k = 0; k < list.size(); k++) {
                String el2 = list.get(k);
                if (!el1.equals(el2)) {
                    Optional<CharPair> optionalPair = getCharPair(el1, el2);
                    if (optionalPair.isPresent()) {
                        CharPair pair = optionalPair.get();
                        return removeChar(el1, pair.x);
                    }
                }
            }
        }

        throw new RuntimeException("My Error!");
    }

    public static String removeChar(String string , char c)
    {
        String out = new String();
        for(char el : string.toCharArray())
        {
            if(el != c)
            {
                out = out + el;
            }
        }
        return out;
    }

    public static Optional<CharPair> getCharPair(String string1, String string2) {
        List<CharPair> list = new ArrayList<>();
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                list.add(new CharPair(string1.charAt(i), string2.charAt(i)));
            }
        }
        if (list.size() == 1) {
            return Optional.of(list.get(0));
        }

        return Optional.empty();
    }

    public static intPair getPair(List<Map<Character, Integer>> list) {
        int a = 0;
        int b = 0;
        for (Map<Character, Integer> el : list) {
            a += containsNumberOf(el, 2);
            b += containsNumberOf(el, 3);
        }
        return new intPair(a, b);
    }

    public static int containsNumberOf(Map<Character, Integer> map, int number) {
        for (Character key : map.keySet()) {
            if (map.get(key) == number) {
                return 1;
            }
        }
        return 0;
    }

    public static Map<Character, Integer> genMapForString(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char el : input.toCharArray()) {
            if (!map.containsKey(el)) {
                map.put(el, Integer.valueOf(1));
            } else {
                map.put(el, map.get(el) + 1);
            }
        }
        return map;
    }
}
