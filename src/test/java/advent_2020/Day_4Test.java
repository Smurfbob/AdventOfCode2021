package advent_2020;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Day_4Test
{
    @Test
    public void test()
    {
        List<String> list = genList(testInput);

        Day_4.countPassports(list);
    }

    public static List<String> genList(String input)
    {
        List<String> list = new ArrayList<>();
        List<String> arrayInput = Arrays.stream(input.split("\n")).filter(el -> !el.equals("")).collect(Collectors.toList());

        String next = new String();
        for(int i = 0 ; i  < arrayInput.size() ; i++)
        {

            if(i % 3 != 0 || i == 0)
            {
                next = next + arrayInput.get(i) + "\n";
            }
            else
            {
                list.add(next);
                next = "";
            }
        }

        return list.stream().filter(el -> !el.equals("")).collect(Collectors.toList());
    }


    public static String testInput =
            "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
            "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
            "\n" +
            "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
            "hcl:#cfa07d byr:1929\n" +
            "\n" +
            "hcl:#ae17e1 iyr:2013\n" +
            "eyr:2024\n" +
            "ecl:brn pid:760753108 byr:1931\n" +
            "hgt:179cm\n" +
            "\n" +
            "hcl:#cfa07d eyr:2025 pid:166559648\n" +
            "iyr:2011 ecl:brn hgt:59in";
}
































