package advent_2020;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day_4
{


    public static int countPassports(List<String> passports)
    {
        List<Passport> passportList = passports.stream().map(Passport::new).collect(Collectors.toList());
        return passportList.stream().filter(Passport::isValid).filter(Passport::isValid2).collect(Collectors.toList()).size();
    }


    public static class Passport
    {
        public enum DataKeys
        {
            ECL("ecl", "^(amb|blu|brn|gry|grn|hzl|oth)$"),
            PID("pid", "^\\d{9}$"),
            EYR("eyr", "20((?=2)2\\d|(?=3)30)"),
            HCL("hcl", "^#(\\d|[a-f]){6}$"),
            BYR("byr", "^(?=2)|200[0-2]$|(?=1)19[2-9]\\d$"),
            IYR("iyr", "^20((?=1)1\\d$|^(?=2)20)$"),
            CID("cid", ""),
            HGT("hgt", "^1((?=[5-8])[5-8]\\d|(?=9)9[0-3])cm|^((?=5)59|(?=6)6\\d|(?=7)7[0-6])in$"),
            INVALID("invalid" , "");

            public final String name;
            public final String regex;

            DataKeys(String name, String regex)
            {
                this.regex = regex;
                this.name = name;
            }



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



        }

        public Map<DataKeys, String> dataMap;

        public Passport(String input)
        {
            List<String> list = Arrays.stream(input.split("\n")).collect(Collectors.toList());
            for(String el : list)
            {
                List<String> listOfKeys = Arrays.stream(el.split(" ")).collect(Collectors.toList());
                mapData(listOfKeys);
            }


        }
        {
            this.dataMap = new HashMap<>();
        }

        public static boolean isValid(Passport passport)
        {
            int  A = 5;

            for(DataKeys key : DataKeys.values())
            {
                if( !(passport.dataMap.containsKey(key)) && key != DataKeys.CID && key != DataKeys.INVALID)
                {
                    return false;
                }
            }
            return true;
        }


        public static boolean isValid2(Passport passport)
        {

            // TODO Test Listen
            List<String> listValid = new ArrayList<>();
            List<String> listInvalid = new ArrayList<>();

            for(DataKeys key : DataKeys.values())
            {
                if(key != DataKeys.INVALID && key != DataKeys.CID)
                {
                    DataKeys matcher = key;



                    String input = passport.dataMap.get(key);


                    if(!passport.dataMap.get(key).matches(key.regex))
                    {
                        listInvalid.add(key.name+ ": " + input + "\nMatcher: " + key.regex);
                        return false;
                    }
                    listValid.add(key.name+ ": " + input + "\nMatcher: " + key.regex);
                }
            }
            return true;
        }

        public static boolean isValid(String input , int min, int max)
        {
            Scanner scanner = new Scanner(input);
            if(scanner.hasNextInt())
            {
                int value = scanner.nextInt();
                return (value >= min && value <= max);
            }

            return false;
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
