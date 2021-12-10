package advent_2019;

import java.util.*;
import java.util.stream.Collectors;

public class Day_6
{
    public static int calcOrbits(String string)
    {
        List<String> list = Arrays.stream(string.split("\n")).collect(Collectors.toList());

        Orbit orbit = new Orbit(list);

        int counter = 0;
        for(String key : orbit.keys)
        {
            counter += orbit.countOrbits(key);
        }

        int shortestWay = orbit.findShortestWay("YOU", "SAN");

        return counter;
    }

    public static class Orbit
    {
        public final Map<String, List<String>> directOrbits;
        public final Map<String, List<String>> indirectOrbits;
        public final List<String> keys;


        public Orbit(List<String> list)
        {
            this.setOrbits(list);
        }
        {
            this.directOrbits = new HashMap<>();
            this.indirectOrbits = new HashMap<>();
            this.keys = new ArrayList<>();
        }

        public int countOrbits(String key)
        {
            int counter = 0;
            while (this.directOrbits.containsKey(key))
            {
                key = this.directOrbits.get(key).get(0);
                counter++;
            }

            return counter;
        }

        public int findShortestWay(String start, String goal)
        {
            
            return 0;
        }

        private void setOrbits(List<String> list)
        {
            for(String el : list)
            {
                String[] array = el.split("\\)");

                String a = array[0];
                String b = array[1];

                if(!this.keys.contains(a))
                {
                    this.keys.add(a);
                }
                if(!this.keys.contains(b))
                {
                    this.keys.add(b);
                }

                if(!directOrbits.containsKey(b))
                {
                    directOrbits.put(b, new ArrayList<>());
                }
                if(!indirectOrbits.containsKey(a))
                {
                    indirectOrbits.put(a, new ArrayList<>());
                }

                directOrbits.get(b).add(a);
                indirectOrbits.get(a).add(b);
            }
        }

    }
}
