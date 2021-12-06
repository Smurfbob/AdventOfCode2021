package advent_2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_4
{


    public static int countPassports(List<String> passports)
    {
        List<Passport> passportList = passports.stream().map(Passport::new).collect(Collectors.toList());



        return 0;
    }


    public static class Passport
    {
        public enum DataKeys
        {
            ECL("ecl"),
            PID("pid"),
            EYR("eyr"),
            HCL("hcl"),
            BYR("byr"),
            IYR("iyr"),
            CID("cid"),
            HGT("hgt"),
            INVALID("invalid");

            public final String name;

            public static DataKeys findKey(String input)
            {
                for(DataKeys el : DataKeys.values())
                {
                    if(el.name.equals(input))
                    {
                        return el;
                    }
                }
                return INVALID;
            }


            DataKeys(String name)
            {
                this.name = name;
            }
        }

        public Map<DataKeys, String> dataMap;

        public Passport(String input)
        {
            List<String> list = Arrays.stream(input.split("\n")).collect(Collectors.toList());

            List<String> lineOne = Arrays.stream(list.get(0).split(" ")).collect(Collectors.toList());
            List<String> lineTwo = Arrays.stream(list.get(1).split(" ")).collect(Collectors.toList());


            this.mapData(lineOne);
            this.mapData(lineTwo);

        }
        {
            this.dataMap = new HashMap<>();
        }



        private void mapData(List<String> list)
        {
            for(String el : list)
            {
                String[] pair = el.split(":");
                this.dataMap.put(DataKeys.findKey(pair[0]), pair[1]);
            }
        }
    }
}
