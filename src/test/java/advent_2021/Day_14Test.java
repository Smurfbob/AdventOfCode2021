package advent_2021;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class Day_14Test
{
    @Test
    public void test()
    {
        Day_14.Mapper mapper = new Day_14.Mapper(realInput);
//        assertEquals("NCNBCHB" , mapper.doSteps(1));
//        assertEquals("NBCCNBBBCBHCB" , mapper.doSteps(2));
//        assertEquals("NBBBCNCCNBBNBNBBCHBHHBCHB" , mapper.doSteps(3));
//        assertEquals("NBBNBNBBCCNBCNCCNBBNBBNBBBNBBNBBCBHCBHHNHCBBCBHCB" , mapper.doSteps(4));

        Map<Character,Integer> countMap = mapper.getCountMap(40);

        OptionalInt max = countMap.entrySet().stream().mapToInt(el -> el.getValue()).max();
        OptionalInt min = countMap.entrySet().stream().mapToInt(el -> el.getValue()).min();
        if(max.isPresent() && min.isPresent())
        {
            System.out.println(max.getAsInt()-min.getAsInt());
        }
    }

    public static final String testInput =
            "NNCB\n" +
            "\n" +
            "CH -> B\n" +
            "HH -> N\n" +
            "CB -> H\n" +
            "NH -> C\n" +
            "HB -> C\n" +
            "HC -> B\n" +
            "HN -> C\n" +
            "NN -> C\n" +
            "BH -> H\n" +
            "NC -> B\n" +
            "NB -> B\n" +
            "BN -> B\n" +
            "BB -> N\n" +
            "BC -> B\n" +
            "CC -> N\n" +
            "CN -> C";

    public static final String realInput = "VPPHOPVVSFSVFOCOSBKF\n" +
            "\n" +
            "CO -> B\n" +
            "CV -> N\n" +
            "HV -> H\n" +
            "ON -> O\n" +
            "FS -> F\n" +
            "NS -> S\n" +
            "VK -> C\n" +
            "BV -> F\n" +
            "SC -> N\n" +
            "NV -> V\n" +
            "NC -> F\n" +
            "NH -> B\n" +
            "BO -> K\n" +
            "FC -> H\n" +
            "NB -> H\n" +
            "HO -> F\n" +
            "SB -> N\n" +
            "KP -> V\n" +
            "OS -> C\n" +
            "OB -> P\n" +
            "SH -> N\n" +
            "BC -> H\n" +
            "CK -> H\n" +
            "SO -> N\n" +
            "SP -> P\n" +
            "CF -> P\n" +
            "KV -> F\n" +
            "CS -> V\n" +
            "FF -> P\n" +
            "VS -> V\n" +
            "CP -> S\n" +
            "PH -> V\n" +
            "OP -> K\n" +
            "KH -> B\n" +
            "FB -> S\n" +
            "CN -> H\n" +
            "KS -> P\n" +
            "FN -> O\n" +
            "PV -> O\n" +
            "VC -> S\n" +
            "HF -> N\n" +
            "OC -> O\n" +
            "PK -> V\n" +
            "KC -> C\n" +
            "HK -> C\n" +
            "PO -> N\n" +
            "OO -> S\n" +
            "VH -> N\n" +
            "CC -> K\n" +
            "BP -> K\n" +
            "HC -> K\n" +
            "FV -> K\n" +
            "KF -> V\n" +
            "VF -> C\n" +
            "HN -> S\n" +
            "VP -> B\n" +
            "HH -> O\n" +
            "FO -> O\n" +
            "PC -> N\n" +
            "KK -> C\n" +
            "PN -> P\n" +
            "NN -> C\n" +
            "FH -> N\n" +
            "VV -> O\n" +
            "OK -> V\n" +
            "CB -> N\n" +
            "SN -> H\n" +
            "VO -> H\n" +
            "BB -> C\n" +
            "PB -> F\n" +
            "NF -> P\n" +
            "KO -> S\n" +
            "PP -> K\n" +
            "NO -> O\n" +
            "SF -> N\n" +
            "KN -> S\n" +
            "PS -> O\n" +
            "VN -> V\n" +
            "SS -> N\n" +
            "BF -> O\n" +
            "HP -> H\n" +
            "HS -> N\n" +
            "BS -> S\n" +
            "VB -> F\n" +
            "PF -> K\n" +
            "SV -> V\n" +
            "BH -> P\n" +
            "FP -> O\n" +
            "CH -> P\n" +
            "OH -> K\n" +
            "OF -> F\n" +
            "HB -> V\n" +
            "FK -> V\n" +
            "BN -> V\n" +
            "SK -> F\n" +
            "OV -> C\n" +
            "NP -> S\n" +
            "NK -> S\n" +
            "BK -> C\n" +
            "KB -> F";
}