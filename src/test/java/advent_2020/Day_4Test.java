package advent_2020;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Day_4Test
{
    @Test
    public void test ()
    {
        List<String> list = genList(realInput);

        // Assert.assertEquals(2, Day_4.countPassports(list));
        System.out.println("Valid: " + Day_4.countPassports(list));

    }

    public static List<String> genList (String input)
    {
        List<String> list = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        List<String> out = new ArrayList<>();

        for(int i=0 ; i < list.size() ; i++)
        {
            String next = new String();
            while (!list.get(i).equals(""))
            {
                next = next + list.get(i) + "\n";
                i++;
                if(i >= list.size())
                {
                    break;
                }
            }
            out.add(next);
        }
        return out;
    }


    public static final String realInput = "byr:1971\n" +
            "ecl:hzl pid:112040163\n" +
            "eyr:2023 iyr:2019\n" +
            "hcl:#b6652a hgt:167cm\n" +
            "\n" +
            "pid:108667812 eyr:2023 hcl:#623a2f hgt:171cm iyr:2018 ecl:amb byr:1993\n" +
            "\n" +
            "hcl:#cfa07d iyr:2014 ecl:blu eyr:2023 cid:304 hgt:70in byr:1961\n" +
            "\n" +
            "byr:1977\n" +
            "hcl:#b6652a\n" +
            "iyr:2017 ecl:oth pid:703877876 hgt:185cm\n" +
            "\n" +
            "byr:1972\n" +
            "cid:271\n" +
            "iyr:2016 pid:876104259 hgt:173cm eyr:2028 ecl:brn hcl:#733820\n" +
            "\n" +
            "hgt:174cm ecl:gry iyr:2014 eyr:2029 hcl:#c0946f\n" +
            "byr:1967 pid:406306240\n" +
            "\n" +
            "hcl:#6b5442\n" +
            "iyr:2011\n" +
            "pid:040592028 eyr:2026\n" +
            "ecl:amb\n" +
            "byr:1923\n" +
            "\n" +
            "pid:293598838 byr:1960 cid:87\n" +
            "iyr:2018\n" +
            "ecl:blu eyr:2029\n" +
            "hcl:#7d3b0c\n" +
            "hgt:62in\n" +
            "\n" +
            "iyr:2018 cid:137\n" +
            "hcl:1c7db1 ecl:#38812e byr:2006 eyr:2038 pid:1239811353 hgt:84\n" +
            "\n" +
            "hcl:#888785 pid:308480529\n" +
            "iyr:2010 byr:1988\n" +
            "eyr:2025 hgt:176cm ecl:amb\n" +
            "\n" +
            "cid:79 ecl:lzr\n" +
            "iyr:2013 byr:1991 hcl:2f49ef\n" +
            "hgt:191cm\n" +
            "pid:378428551\n" +
            "\n" +
            "iyr:2005\n" +
            "hgt:64in hcl:89c369\n" +
            "ecl:gry byr:1932\n" +
            "eyr:2029 pid:753055776\n" +
            "\n" +
            "ecl:amb iyr:2017\n" +
            "byr:1969 hcl:#fffffd\n" +
            "pid:305746470\n" +
            "hgt:173cm\n" +
            "\n" +
            "pid:081972188 iyr:2011\n" +
            "hcl:9bb154\n" +
            "eyr:2024 byr:1966 ecl:oth cid:185 hgt:171cm\n" +
            "\n" +
            "pid:522553186 hgt:171cm ecl:grn hcl:#7d3b0c\n" +
            "byr:1955\n" +
            "eyr:2025 iyr:1999\n" +
            "\n" +
            "iyr:2015\n" +
            "byr:1941 pid:140123640 ecl:amb hgt:153cm hcl:#ceb3a1 eyr:2020\n" +
            "\n" +
            "ecl:grn\n" +
            "cid:202 hcl:#602927\n" +
            "eyr:2029\n" +
            "hgt:180cm byr:1974\n" +
            "pid:658341964\n" +
            "iyr:2017\n" +
            "\n" +
            "pid:2037156813 eyr:1978 ecl:grn hcl:519b45 iyr:2011 byr:2017\n" +
            "\n" +
            "hcl:#fffffd ecl:hzl\n" +
            "pid:658716289 byr:2001 hgt:154cm cid:234 eyr:2031 iyr:2010\n" +
            "\n" +
            "byr:2013 pid:#eb519e eyr:2026\n" +
            "hgt:157cm iyr:2030 hcl:7e9d5a ecl:oth\n" +
            "\n" +
            "byr:2002\n" +
            "ecl:brn iyr:1998 hgt:60cm\n" +
            "hcl:#7d3b0c pid:#90286d\n" +
            "eyr:1938\n" +
            "\n" +
            "byr:1956 hcl:#efcc98\n" +
            "hgt:190cm\n" +
            "iyr:2010 eyr:2023\n" +
            "ecl:amb\n" +
            "cid:342 pid:278521396\n" +
            "\n" +
            "hgt:67cm\n" +
            "cid:98 eyr:2036 byr:2028 ecl:grt hcl:08b5ad iyr:2029 pid:187cm\n" +
            "\n" +
            "ecl:dne hcl:fca461 hgt:129 iyr:2020 eyr:2027 byr:2022 pid:5014208295\n" +
            "\n" +
            "hgt:169cm ecl:gry iyr:2015 eyr:2025 hcl:#733820 pid:240085824 byr:1920\n" +
            "\n" +
            "iyr:2020 eyr:2033\n" +
            "pid:#3f8e9d hgt:190in ecl:brn hcl:#efcc98 byr:2004\n" +
            "\n" +
            "iyr:2018 hcl:#18171d ecl:brn byr:1933\n" +
            "pid:514517439 hgt:171cm eyr:2028\n" +
            "\n" +
            "eyr:2030 pid:053251865\n" +
            "byr:2028 hgt:174cm iyr:2015 hcl:5a0da9 ecl:hzl\n" +
            "\n" +
            "hgt:169cm iyr:2014 ecl:oth eyr:2029 pid:348737413 hcl:#b6652a byr:1997\n" +
            "\n" +
            "hgt:181cm cid:315\n" +
            "eyr:2021 iyr:2016 byr:1966 ecl:oth pid:779435812 hcl:#733820\n" +
            "\n" +
            "pid:5052579 cid:268 hgt:193in\n" +
            "hcl:z\n" +
            "iyr:1942 eyr:1977\n" +
            "\n" +
            "eyr:2039 hgt:69cm cid:337\n" +
            "iyr:2023 pid:568948965\n" +
            "byr:2018 hcl:z ecl:amb\n" +
            "\n" +
            "byr:2014 eyr:2028\n" +
            "cid:311\n" +
            "pid:158cm ecl:#946399 hgt:99\n" +
            "hcl:z\n" +
            "iyr:1978\n" +
            "\n" +
            "pid:474742310 iyr:2015 eyr:2021 hcl:#14f5da\n" +
            "hgt:163cm ecl:oth\n" +
            "\n" +
            "hcl:#efcc98\n" +
            "ecl:blu\n" +
            "hgt:178cm pid:815309025 byr:2024\n" +
            "iyr:2008 eyr:1922\n" +
            "\n" +
            "byr:1946 eyr:2028 pid:364439229 iyr:2011 hgt:186cm cid:79 ecl:blu\n" +
            "\n" +
            "eyr:2028 hgt:157cm\n" +
            "cid:59 iyr:2010 byr:1927\n" +
            "ecl:brn\n" +
            "pid:893074368\n" +
            "\n" +
            "hcl:#18171d ecl:#2defe4 hgt:128 byr:1940\n" +
            "pid:181904523 iyr:2022 eyr:1937\n" +
            "\n" +
            "eyr:2023 hgt:172cm iyr:2012 hcl:#a97842 ecl:hzl byr:1982 pid:638759541\n" +
            "\n" +
            "cid:91 hcl:#623a2f\n" +
            "byr:1996 eyr:2028 pid:181384347 hgt:175cm\n" +
            "iyr:2020\n" +
            "\n" +
            "iyr:2017 eyr:2021 ecl:gry\n" +
            "byr:1979 hgt:168cm hcl:#6b5442 pid:950995084\n" +
            "\n" +
            "ecl:blu iyr:2012 byr:1972\n" +
            "hcl:#888785 eyr:2022 hgt:179cm pid:293827532\n" +
            "\n" +
            "hgt:179cm\n" +
            "ecl:hzl iyr:2011\n" +
            "byr:1982 eyr:2020 hcl:#efcc98 cid:209 pid:626732917\n" +
            "\n" +
            "byr:1989\n" +
            "hcl:#6b5442 pid:679850983 iyr:2020\n" +
            "hgt:192cm ecl:blu\n" +
            "\n" +
            "pid:333485773 hgt:167in ecl:zzz iyr:1945\n" +
            "eyr:2035 cid:319 hcl:#341e13\n" +
            "\n" +
            "hgt:64in\n" +
            "cid:202 eyr:2023 ecl:gry hcl:#c0946f pid:212611149 byr:1928 iyr:2010\n" +
            "\n" +
            "hgt:183cm hcl:#e8fa30 ecl:oth eyr:2021\n" +
            "byr:1943 pid:667658434\n" +
            "iyr:2010\n" +
            "\n" +
            "cid:117\n" +
            "byr:2022 hcl:z ecl:#c6ae1f iyr:2028\n" +
            "hgt:188cm\n" +
            "pid:0883366415\n" +
            "eyr:2030\n" +
            "\n" +
            "hcl:z\n" +
            "pid:99347800 iyr:2030 eyr:2032 ecl:#cd1fd7 hgt:192cm byr:2019\n" +
            "\n" +
            "hgt:178cm byr:2013\n" +
            "iyr:2026 hcl:ad3da1\n" +
            "eyr:2020 pid:1626818790\n" +
            "\n" +
            "hgt:63cm\n" +
            "iyr:1964\n" +
            "eyr:2032\n" +
            "cid:135 byr:2017 hcl:#a97842 pid:#1b83f5 ecl:gmt\n" +
            "\n" +
            "hcl:c352d2 byr:1927 ecl:gmt hgt:187cm\n" +
            "eyr:2031 pid:170cm\n" +
            "\n" +
            "byr:2022 eyr:1958 ecl:zzz pid:3692521800 hcl:8b2b50 iyr:1946 hgt:155in\n" +
            "\n" +
            "ecl:#43f305 hcl:z byr:2028\n" +
            "pid:63518738 cid:243 eyr:2037\n" +
            "hgt:67cm iyr:1929\n" +
            "\n" +
            "ecl:brn hcl:#888785\n" +
            "pid:495215177 byr:1962 eyr:2021\n" +
            "cid:192\n" +
            "hgt:151cm iyr:2012\n" +
            "\n" +
            "ecl:#dcca8e cid:64 eyr:2030 pid:380057616\n" +
            "hcl:z iyr:2026 byr:1962\n" +
            "\n" +
            "hcl:z\n" +
            "ecl:hzl eyr:2027 byr:2015 pid:302526406 hgt:175cm iyr:2017\n" +
            "\n" +
            "byr:1966\n" +
            "cid:133 pid:9953651821 ecl:gry iyr:2020 hgt:152cm\n" +
            "hcl:#fffffd eyr:2026\n" +
            "\n" +
            "hgt:191cm byr:1960 pid:752655640 hcl:#888785\n" +
            "cid:249 ecl:blu\n" +
            "iyr:2012 eyr:2028\n" +
            "\n" +
            "pid:#c8c988 eyr:2027 hgt:157in hcl:z iyr:2025 byr:2019 ecl:zzz cid:195\n" +
            "\n" +
            "hgt:96 pid:95381813 iyr:1950\n" +
            "hcl:#fffffd eyr:2026\n" +
            "byr:2010 cid:318\n" +
            "ecl:#48a819\n" +
            "\n" +
            "eyr:2020\n" +
            "ecl:oth byr:1951 pid:080392492\n" +
            "iyr:2015 hcl:#6b5442 hgt:176cm\n" +
            "\n" +
            "hgt:162cm pid:897792747 byr:1968\n" +
            "hcl:#ceb3a1 ecl:grn eyr:2026 iyr:2014\n" +
            "\n" +
            "eyr:2038 hcl:cc324a byr:1983 ecl:brn\n" +
            "hgt:161 pid:#adf47f cid:208\n" +
            "\n" +
            "iyr:2013 ecl:blu hcl:#866857 byr:1981 hgt:157cm eyr:2025 pid:216910202\n" +
            "\n" +
            "hgt:152in byr:1990\n" +
            "iyr:2027 hcl:a4a3ae\n" +
            "ecl:#058ae2 eyr:2037 pid:646420120\n" +
            "\n" +
            "ecl:oth byr:1982 eyr:2027 hgt:65in iyr:2019\n" +
            "hcl:#efcc98 cid:224\n" +
            "pid:854228141\n" +
            "\n" +
            "pid:772612093\n" +
            "iyr:2027\n" +
            "hgt:175in byr:1981 hcl:c0b5a9 ecl:utc\n" +
            "\n" +
            "hcl:#888785 iyr:2014 byr:1975\n" +
            "ecl:blu\n" +
            "pid:461319017 cid:229 eyr:2030 hgt:154cm\n" +
            "\n" +
            "hgt:179cm eyr:2024\n" +
            "pid:192cm\n" +
            "iyr:2017 ecl:grt byr:1934 hcl:z cid:92\n" +
            "\n" +
            "hcl:9c9409 iyr:2020 eyr:2030 hgt:156in\n" +
            "cid:189 pid:732321495\n" +
            "byr:1937 ecl:xry\n" +
            "\n" +
            "eyr:2026 pid:092259220 byr:1943\n" +
            "iyr:2010 hgt:153cm hcl:#602927\n" +
            "\n" +
            "byr:1925 hgt:180cm hcl:#888785 iyr:2014\n" +
            "pid:402548656 eyr:2023 ecl:hzl\n" +
            "cid:188\n" +
            "\n" +
            "eyr:2020 pid:874307939 hcl:#3f85a4\n" +
            "ecl:gry hgt:167cm byr:1959 iyr:2014\n" +
            "\n" +
            "eyr:2026 hgt:183cm iyr:2011 byr:1940 ecl:blu pid:810026000\n" +
            "cid:226 hcl:#866857\n" +
            "\n" +
            "cid:292 ecl:grt hgt:72cm\n" +
            "byr:2009\n" +
            "iyr:2000 eyr:1946 hcl:7be409 pid:996363336\n" +
            "\n" +
            "eyr:2027\n" +
            "iyr:2021\n" +
            "pid:632405666\n" +
            "byr:2027\n" +
            "ecl:#d83a36 hcl:z hgt:190in\n" +
            "\n" +
            "cid:80\n" +
            "hgt:173cm\n" +
            "pid:735853952 ecl:gry hcl:#fffffd eyr:2025 iyr:2020 byr:1923\n" +
            "\n" +
            "byr:1977\n" +
            "hcl:#733820\n" +
            "iyr:2020 ecl:#698d72 hgt:186cm pid:678869986 cid:67\n" +
            "eyr:2021\n" +
            "\n" +
            "hgt:61cm iyr:2022 eyr:1972 hcl:979bcf byr:2023 pid:44037388 ecl:xry\n" +
            "\n" +
            "eyr:2032 pid:193cm hcl:z\n" +
            "hgt:68cm byr:2016\n" +
            "\n" +
            "byr:2008 cid:239\n" +
            "hcl:ddc745 eyr:2033 ecl:#6858b5 hgt:64cm iyr:2023\n" +
            "pid:89867524\n" +
            "\n" +
            "iyr:2016 hgt:74in hcl:#18171d\n" +
            "byr:1959\n" +
            "ecl:blu\n" +
            "pid:848487392\n" +
            "eyr:2027\n" +
            "\n" +
            "hgt:165in ecl:grn\n" +
            "byr:1960 eyr:2029\n" +
            "iyr:2017\n" +
            "hcl:#b6652a pid:096349067\n" +
            "\n" +
            "eyr:2025 ecl:brn\n" +
            "pid:634481064 iyr:2015\n" +
            "hcl:#7d3b0c\n" +
            "byr:1943\n" +
            "\n" +
            "ecl:grn eyr:2021\n" +
            "pid:34753212 cid:51 hgt:184 iyr:1970 byr:2012\n" +
            "\n" +
            "eyr:1973 iyr:2014 cid:225\n" +
            "byr:2028 ecl:gmt\n" +
            "hgt:158cm\n" +
            "pid:#74f9b8 hcl:f6932a\n" +
            "\n" +
            "hgt:168cm\n" +
            "hcl:#602927\n" +
            "pid:622067991 ecl:amb eyr:2025 iyr:2018\n" +
            "\n" +
            "pid:791399958 byr:1956 eyr:2027 hcl:#602927\n" +
            "ecl:brn\n" +
            "iyr:2016 hgt:192cm\n" +
            "\n" +
            "hgt:168cm iyr:2015 cid:115 ecl:#3fa48b eyr:2037 hcl:#1bf77b byr:1980 pid:947370470\n" +
            "\n" +
            "iyr:2008\n" +
            "byr:2021 ecl:zzz\n" +
            "hcl:z hgt:109 pid:#fc2a91 cid:268 eyr:1957\n" +
            "\n" +
            "byr:2018 hcl:fef19c iyr:2014 ecl:blu eyr:2023 cid:259 pid:193cm hgt:156\n" +
            "\n" +
            "hcl:#b6652a\n" +
            "iyr:2023 byr:2021 hgt:153cm pid:934391984 eyr:2021 ecl:brn\n" +
            "\n" +
            "pid:168cm hcl:b13f1e eyr:2038 iyr:2020 ecl:#7c0a6d hgt:169in\n" +
            "\n" +
            "ecl:amb cid:170\n" +
            "pid:300188824 eyr:2024 byr:1954 hcl:#b6652a hgt:166cm\n" +
            "iyr:2013\n" +
            "\n" +
            "ecl:brn\n" +
            "eyr:2023\n" +
            "hcl:#b6652a byr:1948 hgt:71in iyr:2015\n" +
            "pid:575973478\n" +
            "\n" +
            "eyr:2026 hgt:180cm hcl:#866857 ecl:grn iyr:2013\n" +
            "byr:1997 pid:864648034\n" +
            "\n" +
            "ecl:hzl\n" +
            "iyr:2013 eyr:2024 hcl:#02e17f byr:1960\n" +
            "hgt:163cm cid:338 pid:972201795\n" +
            "\n" +
            "iyr:1994 eyr:2035 ecl:xry\n" +
            "hcl:z hgt:167in pid:159cm\n" +
            "\n" +
            "ecl:hzl\n" +
            "byr:1952\n" +
            "eyr:2024 hgt:191cm pid:229400637 iyr:2011 hcl:#122db6\n" +
            "\n" +
            "eyr:2022\n" +
            "pid:467667316 iyr:2019 hcl:#623a2f\n" +
            "hgt:161cm\n" +
            "ecl:oth\n" +
            "\n" +
            "ecl:hzl eyr:2030 hcl:#733820 byr:1944\n" +
            "hgt:193cm pid:819137596\n" +
            "\n" +
            "cid:321 hgt:184in ecl:hzl iyr:2018 byr:2010 eyr:2020 pid:171cm\n" +
            "\n" +
            "ecl:amb eyr:2025 hcl:#c0946f pid:360891963 byr:1925\n" +
            "iyr:2017\n" +
            "hgt:180cm\n" +
            "\n" +
            "hcl:#cfa07d byr:1949\n" +
            "eyr:1931 cid:350\n" +
            "ecl:#ff9943\n" +
            "pid:7550350393 hgt:75\n" +
            "\n" +
            "eyr:2026 ecl:amb hcl:z pid:746919391 iyr:2014 hgt:179cm byr:1997\n" +
            "\n" +
            "pid:157cm iyr:2030\n" +
            "hgt:152cm\n" +
            "hcl:ce8aa7 eyr:1976 ecl:grt cid:160 byr:2011\n" +
            "\n" +
            "eyr:2022\n" +
            "hgt:183cm\n" +
            "byr:2000 iyr:2016 hcl:#a97842 ecl:blu pid:500935725\n" +
            "\n" +
            "cid:245 eyr:2026 iyr:2015 ecl:gry hcl:#cfa07d\n" +
            "byr:1946\n" +
            "\n" +
            "eyr:2022 hgt:168cm\n" +
            "pid:786361311 iyr:2013 hcl:#c0946f byr:1988 cid:244 ecl:hzl\n" +
            "\n" +
            "byr:2014 hgt:176in iyr:2021\n" +
            "hcl:z pid:6361650130\n" +
            "eyr:2039 cid:300\n" +
            "ecl:#76310d\n" +
            "\n" +
            "ecl:amb hgt:170in byr:2013\n" +
            "iyr:2024 eyr:2033 hcl:#888785\n" +
            "\n" +
            "eyr:2025\n" +
            "iyr:1957 cid:182\n" +
            "ecl:blu pid:253552114\n" +
            "hgt:188cm hcl:z\n" +
            "\n" +
            "cid:83 ecl:amb\n" +
            "eyr:2022 byr:1947\n" +
            "iyr:2013 hcl:#cfa07d\n" +
            "hgt:188cm pid:447734900\n" +
            "\n" +
            "iyr:2013 hcl:#602927 byr:1979 hgt:167cm cid:321 pid:978238277 eyr:2020\n" +
            "ecl:grn\n" +
            "\n" +
            "hgt:73cm\n" +
            "cid:199 ecl:amb iyr:2019\n" +
            "hcl:#733820 eyr:2021\n" +
            "byr:1939 pid:364966395\n" +
            "\n" +
            "hgt:168in ecl:lzr eyr:2031\n" +
            "pid:#ff10ac byr:2014 iyr:2006\n" +
            "\n" +
            "hgt:164cm eyr:1994 iyr:2010\n" +
            "ecl:amb hcl:#7d3b0c cid:240 pid:191cm\n" +
            "byr:2025\n" +
            "\n" +
            "ecl:grn\n" +
            "eyr:2029\n" +
            "hcl:#7d3b0c hgt:158cm\n" +
            "byr:1939 iyr:2012 pid:855145518\n" +
            "\n" +
            "iyr:2013 hcl:#ceb3a1\n" +
            "hgt:163cm eyr:2023 pid:761215570\n" +
            "\n" +
            "hgt:154cm ecl:grn\n" +
            "iyr:2019 byr:1981 eyr:2021 hcl:#602927\n" +
            "cid:80 pid:427938374\n" +
            "\n" +
            "eyr:2026 hgt:154cm cid:102 iyr:2012 pid:6632346648 ecl:amb\n" +
            "byr:2010 hcl:z\n" +
            "\n" +
            "cid:302 iyr:2014\n" +
            "pid:161cm eyr:2037 byr:2026 ecl:gry hgt:60 hcl:9fb9e0\n" +
            "\n" +
            "ecl:brn iyr:2015 pid:041582949 cid:180 byr:1938\n" +
            "hgt:158cm\n" +
            "hcl:#602927 eyr:2026\n" +
            "\n" +
            "ecl:xry pid:#546891 hcl:#18171d hgt:71cm byr:1974\n" +
            "iyr:2018 eyr:2026\n" +
            "\n" +
            "iyr:2015 eyr:2025 ecl:brn hgt:180cm hcl:#b6652a\n" +
            "byr:1938\n" +
            "pid:752379523\n" +
            "\n" +
            "iyr:2020 ecl:grn hgt:179cm byr:1929\n" +
            "cid:103 hcl:#602927\n" +
            "pid:212212232\n" +
            "\n" +
            "pid:262917603 ecl:gry iyr:2012 hcl:#fffffd hgt:165cm eyr:2022 byr:1965\n" +
            "\n" +
            "byr:1960\n" +
            "eyr:2031 hgt:184in\n" +
            "pid:#ac1606 iyr:2013 hcl:#888785\n" +
            "cid:260 ecl:#7b2c3b\n" +
            "\n" +
            "byr:1987\n" +
            "eyr:2025 cid:102\n" +
            "hgt:74in ecl:brn hcl:#4a6c75 pid:20220733 iyr:2028\n" +
            "\n" +
            "eyr:2031 pid:823539963\n" +
            "iyr:1957\n" +
            "hgt:159cm byr:1953 ecl:oth cid:186 hcl:26d85f\n" +
            "\n" +
            "ecl:gry iyr:2011\n" +
            "hgt:167cm hcl:#fffffd pid:001642707 eyr:2030 byr:1952\n" +
            "\n" +
            "iyr:2029 ecl:grt\n" +
            "hcl:z byr:2011 hgt:64cm pid:37027672\n" +
            "eyr:1923\n" +
            "\n" +
            "pid:021102096\n" +
            "eyr:2024 hgt:66 hcl:#a97842 byr:1922 ecl:gry iyr:2013\n" +
            "\n" +
            "pid:166477382 ecl:oth byr:1982 iyr:2010 eyr:2020\n" +
            "hcl:#866857 hgt:60in\n" +
            "\n" +
            "hcl:#7d3b0c\n" +
            "iyr:2018 pid:065652921 byr:1939\n" +
            "ecl:blu\n" +
            "hgt:180cm eyr:2028\n" +
            "\n" +
            "ecl:amb iyr:2020 byr:1967 hcl:#fffffd eyr:2028 hgt:157cm\n" +
            "\n" +
            "eyr:2029 hgt:185cm cid:85 hcl:z iyr:2014 pid:#1f4787 ecl:grn byr:2010\n" +
            "\n" +
            "byr:1987 hcl:d397d9 iyr:2028\n" +
            "hgt:158cm pid:686994921 ecl:hzl\n" +
            "\n" +
            "ecl:oth\n" +
            "byr:2008\n" +
            "pid:#db73d9 hgt:174cm hcl:#6b5442 iyr:1955 eyr:2028\n" +
            "\n" +
            "eyr:2020 ecl:amb pid:490866828 hcl:#cfa07d cid:113\n" +
            "hgt:165cm\n" +
            "\n" +
            "iyr:2011\n" +
            "pid:320518492\n" +
            "eyr:2028 byr:1940 hgt:164cm cid:84\n" +
            "hcl:#341e13 ecl:grn\n" +
            "\n" +
            "hgt:142\n" +
            "hcl:z pid:152cm iyr:1953 eyr:2040 ecl:#e44f11 byr:2024\n" +
            "\n" +
            "ecl:gmt hcl:be7483 eyr:2027\n" +
            "iyr:2026\n" +
            "pid:396722617 hgt:153cm\n" +
            "\n" +
            "ecl:dne byr:2015\n" +
            "pid:330208482\n" +
            "hcl:#7d3b0c iyr:2014 eyr:2022 hgt:95\n" +
            "\n" +
            "byr:1925 hcl:#7d3b0c\n" +
            "ecl:gry\n" +
            "eyr:2024\n" +
            "pid:694714722 hgt:158cm iyr:2015 cid:283\n" +
            "\n" +
            "eyr:2023\n" +
            "hgt:183cm cid:345\n" +
            "hcl:#6b5442 ecl:hzl iyr:2019 byr:1971 pid:458416257\n" +
            "\n" +
            "ecl:#dcae8b\n" +
            "iyr:2027 eyr:1940 byr:2009 hcl:f024de pid:20713584\n" +
            "hgt:169in\n" +
            "\n" +
            "hcl:#888785 eyr:2026\n" +
            "byr:1984 iyr:2013 pid:935837461\n" +
            "hgt:193cm\n" +
            "ecl:gry\n" +
            "\n" +
            "pid:7343429 byr:2002\n" +
            "hgt:191cm\n" +
            "ecl:lzr iyr:1983\n" +
            "eyr:1966 hcl:#623a2f\n" +
            "cid:302\n" +
            "\n" +
            "hcl:#888785 iyr:2014 hgt:173cm\n" +
            "byr:2002 pid:005350165 eyr:2022\n" +
            "\n" +
            "byr:2013 iyr:2028\n" +
            "ecl:lzr pid:5426915565 eyr:2018 hcl:z hgt:70cm cid:142\n" +
            "\n" +
            "eyr:2021 hgt:157cm ecl:utc iyr:2014\n" +
            "byr:1934 cid:348 hcl:#623a2f pid:607329117\n" +
            "\n" +
            "iyr:2015 hgt:167cm ecl:hzl\n" +
            "pid:088516395 hcl:#efcc98 byr:1968 eyr:2029\n" +
            "\n" +
            "eyr:2028\n" +
            "iyr:2019\n" +
            "cid:199\n" +
            "ecl:amb\n" +
            "hgt:152cm byr:1928 pid:547112666 hcl:#623a2f\n" +
            "\n" +
            "pid:406202463\n" +
            "byr:1950 cid:214\n" +
            "eyr:2021 hcl:#fffffd hgt:177cm\n" +
            "ecl:brn\n" +
            "\n" +
            "eyr:2029\n" +
            "cid:210 byr:1982 pid:578085789 ecl:brn\n" +
            "hgt:187cm iyr:2010 hcl:#c0946f\n" +
            "\n" +
            "byr:1980 hcl:#c0946f hgt:159cm pid:177650318 eyr:2024 ecl:amb iyr:2019\n" +
            "\n" +
            "pid:923359071 byr:1997 ecl:#faa530\n" +
            "eyr:2028 iyr:2013 hcl:e6c902 hgt:177cm\n" +
            "\n" +
            "eyr:2040\n" +
            "cid:98 hgt:156in\n" +
            "ecl:oth\n" +
            "iyr:1996 pid:81500971\n" +
            "hcl:#6b5442\n" +
            "byr:2017\n" +
            "\n" +
            "byr:2004 iyr:1941\n" +
            "hcl:e1e4bb hgt:67cm pid:1143915351 ecl:#0d3e5d eyr:1972\n" +
            "\n" +
            "hgt:184cm hcl:#623a2f\n" +
            "eyr:2028 pid:680951513 ecl:grn iyr:2014 byr:2001\n" +
            "\n" +
            "hcl:#866857 hgt:156cm\n" +
            "eyr:2020\n" +
            "ecl:grn iyr:2010 pid:589945116\n" +
            "\n" +
            "pid:599795227 iyr:2016 ecl:grn\n" +
            "hcl:#cfa07d hgt:157cm byr:1967 eyr:2029\n" +
            "\n" +
            "hcl:#b6652a\n" +
            "byr:1966 iyr:2017 pid:117232314 ecl:oth hgt:186cm eyr:2029\n" +
            "\n" +
            "pid:605019880\n" +
            "iyr:2020\n" +
            "hgt:169cm byr:1980 hcl:#623a2f\n" +
            "ecl:hzl eyr:2030\n" +
            "\n" +
            "eyr:2019 hcl:#ceb3a1 pid:988269284\n" +
            "iyr:2015 byr:1989 hgt:171cm ecl:oth\n" +
            "\n" +
            "cid:311 byr:1998 ecl:hzl\n" +
            "eyr:2027 hgt:152cm pid:734870801 hcl:#7d3b0c\n" +
            "iyr:2013\n" +
            "\n" +
            "hcl:#efcc98\n" +
            "hgt:180cm iyr:2020\n" +
            "pid:202682423 byr:2027 ecl:grn eyr:2030\n" +
            "\n" +
            "hcl:f0701f pid:161cm cid:291 hgt:160in iyr:2030\n" +
            "ecl:#e12345\n" +
            "\n" +
            "cid:248 byr:1943 eyr:2024 hgt:181cm ecl:brn iyr:2010 hcl:#bf813e\n" +
            "\n" +
            "byr:2005 hgt:187in eyr:2034 iyr:2025 hcl:z ecl:gmt\n" +
            "pid:78691465\n" +
            "\n" +
            "byr:2000\n" +
            "hcl:#574f4e eyr:2024 iyr:2017 pid:#fec795 hgt:185cm ecl:gry\n" +
            "\n" +
            "hcl:#a97842 byr:1959\n" +
            "iyr:2019 pid:690444949\n" +
            "hgt:160in eyr:1978\n" +
            "\n" +
            "cid:236\n" +
            "iyr:2010 eyr:2025 byr:1976 pid:398376853\n" +
            "hcl:#341e13\n" +
            "hgt:150cm\n" +
            "\n" +
            "hgt:182cm iyr:2019 hcl:#866857\n" +
            "ecl:grn\n" +
            "byr:1926 eyr:2029 pid:307880154 cid:94\n" +
            "\n" +
            "ecl:blu\n" +
            "hgt:182cm pid:178cm byr:2019 eyr:2025\n" +
            "iyr:2022 hcl:#a2117d\n" +
            "\n" +
            "eyr:2020 hcl:#c0946f ecl:amb pid:135511825 byr:1954 hgt:68in iyr:2017\n" +
            "\n" +
            "hgt:188cm ecl:amb iyr:2011\n" +
            "pid:949021029 eyr:2028 hcl:#fffffd byr:1986\n" +
            "\n" +
            "iyr:1949 pid:#8a8d94 ecl:#922a92 byr:1925 hcl:#63c4a5\n" +
            "\n" +
            "hcl:#c0946f\n" +
            "ecl:grn iyr:2013 eyr:2024 pid:420295283 hgt:181cm\n" +
            "byr:1977\n" +
            "\n" +
            "byr:1941 pid:299186098 hcl:#f1fa72\n" +
            "iyr:2013 ecl:amb eyr:2022 hgt:152cm\n" +
            "cid:150\n" +
            "\n" +
            "ecl:blu eyr:2021 hgt:60in hcl:#623a2f\n" +
            "byr:1930 iyr:2018\n" +
            "\n" +
            "eyr:2028 pid:663108638\n" +
            "hgt:75in cid:217\n" +
            "byr:1962 ecl:brn hcl:#733820\n" +
            "\n" +
            "hcl:#341e13 hgt:188cm ecl:blu\n" +
            "pid:868930517\n" +
            "eyr:2029\n" +
            "iyr:2010 byr:1938\n" +
            "\n" +
            "pid:194376910 byr:1956\n" +
            "hcl:#cd4ab4\n" +
            "eyr:1940 iyr:2012 ecl:#396cc3\n" +
            "\n" +
            "pid:#c5da2a hgt:162cm\n" +
            "hcl:#866857\n" +
            "cid:95 ecl:#fa1f85\n" +
            "iyr:1965 byr:1963 eyr:2039\n" +
            "\n" +
            "pid:44063430 hcl:289b20\n" +
            "ecl:#77ddd9 eyr:1953\n" +
            "iyr:1924 byr:2026 cid:267 hgt:180in\n" +
            "\n" +
            "ecl:brn pid:990171473\n" +
            "eyr:2028 byr:1937\n" +
            "hgt:165cm iyr:2015\n" +
            "hcl:#fffffd cid:68\n" +
            "\n" +
            "iyr:1968 ecl:lzr pid:#05a4ab eyr:1944 hcl:z\n" +
            "\n" +
            "hgt:185cm hcl:#7d3b0c eyr:2029 ecl:oth\n" +
            "iyr:2016 byr:1997 pid:349316183\n" +
            "\n" +
            "hcl:z\n" +
            "ecl:gry\n" +
            "hgt:192in pid:542996841 iyr:2019 cid:144 eyr:2028\n" +
            "byr:2026\n" +
            "\n" +
            "eyr:2024\n" +
            "hcl:#18171d\n" +
            "ecl:grn hgt:160cm pid:399767457 byr:1979 iyr:2015\n" +
            "\n" +
            "ecl:#924147 pid:665314 cid:216 iyr:2026 hcl:z\n" +
            "byr:2023 hgt:157\n" +
            "eyr:1987\n" +
            "\n" +
            "eyr:1989 hcl:4f8779 ecl:#05ff52 iyr:1943 pid:3693010880 hgt:72cm\n" +
            "byr:2009\n" +
            "\n" +
            "hcl:#c0946f eyr:2022\n" +
            "iyr:2015 hgt:157cm byr:1928 ecl:grn pid:243566446\n" +
            "\n" +
            "eyr:2030\n" +
            "hcl:#733820 byr:1988 iyr:2017 cid:125 hgt:193cm ecl:amb pid:939550667\n" +
            "\n" +
            "cid:161 hgt:157in\n" +
            "hcl:#cfa07d eyr:2036 ecl:#4efa35\n" +
            "iyr:2012 pid:3943280550 byr:1979\n" +
            "\n" +
            "ecl:lzr hcl:#341e13 hgt:69cm eyr:2026 cid:322 byr:2006 pid:827964469\n" +
            "\n" +
            "ecl:amb iyr:2012\n" +
            "eyr:2020 hgt:178cm pid:590705772 cid:218\n" +
            "hcl:#c0946f byr:1922\n" +
            "\n" +
            "hcl:632b01 cid:252 byr:1933 ecl:hzl\n" +
            "iyr:2025 eyr:2040 hgt:191cm\n" +
            "pid:406010613\n" +
            "\n" +
            "pid:711656819 ecl:blu eyr:2030 hgt:151cm\n" +
            "byr:1999 cid:319\n" +
            "hcl:#efcc98\n" +
            "\n" +
            "pid:294223216 iyr:2012\n" +
            "hgt:171cm\n" +
            "eyr:2027\n" +
            "hcl:#ceb3a1 ecl:oth\n" +
            "byr:1952 cid:58\n" +
            "\n" +
            "hcl:#888785 pid:457433756 eyr:2022 hgt:186cm\n" +
            "cid:336\n" +
            "byr:1923 iyr:2013 ecl:oth\n" +
            "\n" +
            "byr:2014 hcl:6ce7d6 eyr:2030 pid:190cm iyr:2018 hgt:63cm ecl:#5063b9\n" +
            "\n" +
            "cid:267 hgt:189cm\n" +
            "eyr:2020 hcl:#ffeffd iyr:2014 byr:1989\n" +
            "ecl:grn\n" +
            "pid:571696542\n" +
            "\n" +
            "iyr:1953 hgt:160in\n" +
            "ecl:grt cid:188 eyr:2034\n" +
            "pid:179cm byr:2007\n" +
            "hcl:6895eb\n" +
            "\n" +
            "hgt:165cm ecl:oth\n" +
            "iyr:2020\n" +
            "eyr:2028\n" +
            "hcl:#18171d pid:111506895\n" +
            "\n" +
            "eyr:1957 cid:133 ecl:hzl pid:#e56ca2 byr:2003 hcl:8a9d65\n" +
            "\n" +
            "hcl:6c4ecd byr:1930 hgt:179cm\n" +
            "eyr:2007 iyr:2028 ecl:#3d8705\n" +
            "pid:#dbfeec\n" +
            "\n" +
            "eyr:2036\n" +
            "byr:1991 ecl:#2202d0 hcl:#341e13 pid:85636989 hgt:61cm\n" +
            "iyr:1930\n" +
            "\n" +
            "byr:1996 iyr:2027 hcl:z\n" +
            "pid:780164868 ecl:zzz eyr:2026 hgt:73cm\n" +
            "\n" +
            "byr:1940\n" +
            "iyr:1992 pid:132016954 eyr:2021\n" +
            "cid:147 hcl:#d78bfd ecl:xry\n" +
            "\n" +
            "hgt:174cm\n" +
            "byr:1970\n" +
            "eyr:2021 hcl:#341e13 pid:086579106 iyr:2017 ecl:oth\n" +
            "\n" +
            "ecl:oth cid:207 byr:1998 pid:479696359\n" +
            "hgt:174cm iyr:2017 eyr:2020 hcl:#6b5442\n" +
            "\n" +
            "ecl:hzl iyr:2014\n" +
            "hcl:#cfa07d hgt:163cm eyr:2025\n" +
            "byr:1951 pid:563337128\n" +
            "\n" +
            "ecl:gry hgt:172cm iyr:2013 hcl:#efcc98\n" +
            "byr:1970\n" +
            "pid:848996674\n" +
            "eyr:2027\n" +
            "\n" +
            "hgt:163cm pid:583600660 iyr:2015 hcl:#18171d byr:1959 ecl:brn\n" +
            "\n" +
            "hcl:#efcc98 pid:353178375 cid:145\n" +
            "iyr:2018 byr:1988 ecl:oth eyr:2029\n" +
            "\n" +
            "hgt:62in\n" +
            "byr:1921 pid:125944934 hcl:#b6652a\n" +
            "eyr:2025 cid:71 iyr:2018 ecl:blu\n" +
            "\n" +
            "iyr:2017 ecl:brn hcl:#602927 hgt:172cm pid:932690969 byr:1957 eyr:2026\n" +
            "\n" +
            "hcl:#efcc98 pid:709772213 cid:146 ecl:oth byr:1998 iyr:2010 hgt:74in\n" +
            "eyr:2029\n" +
            "\n" +
            "byr:1965\n" +
            "iyr:2011 hcl:#6b5442 cid:325 hgt:68in eyr:2028 pid:813272708 ecl:hzl\n" +
            "\n" +
            "pid:57223084 hcl:#602927 ecl:grn\n" +
            "hgt:156cm eyr:1972 iyr:2017\n" +
            "\n" +
            "pid:21573000 byr:2030 cid:168\n" +
            "hcl:baee61 eyr:2021 hgt:150cm\n" +
            "iyr:1950 ecl:#acdd7e\n" +
            "\n" +
            "ecl:gry hgt:150cm hcl:#6b5442\n" +
            "byr:1927\n" +
            "iyr:2018 pid:161cm eyr:2021\n" +
            "\n" +
            "hgt:153cm\n" +
            "iyr:2030 ecl:grn pid:575037626 byr:1921 eyr:2021 hcl:#866857\n" +
            "\n" +
            "hgt:175cm iyr:2014\n" +
            "byr:1946 eyr:2025\n" +
            "cid:159 hcl:#18171d\n" +
            "ecl:oth pid:129913905\n" +
            "\n" +
            "pid:566885568\n" +
            "hgt:157cm eyr:2021 ecl:gry byr:1933\n" +
            "hcl:#623a2f cid:223\n" +
            "\n" +
            "ecl:blu byr:1981 cid:160\n" +
            "iyr:2014\n" +
            "hcl:#a97842 eyr:2021 hgt:172cm pid:714902414\n" +
            "\n" +
            "hcl:#b6652a eyr:2021\n" +
            "hgt:168cm byr:1921 iyr:2018 ecl:oth pid:021318713\n" +
            "\n" +
            "hgt:168 pid:222439573\n" +
            "cid:209\n" +
            "hcl:z byr:2016 ecl:#26a0fb\n" +
            "eyr:2031\n" +
            "\n" +
            "hgt:181cm\n" +
            "byr:1970 eyr:2024\n" +
            "pid:476171876 ecl:hzl\n" +
            "hcl:#efcc98\n" +
            "iyr:2019\n" +
            "\n" +
            "hcl:#18171d ecl:oth iyr:2018 byr:1949 hgt:165cm\n" +
            "eyr:2029 pid:078204562\n" +
            "\n" +
            "byr:2021 ecl:blu iyr:1963\n" +
            "pid:2911597977 hcl:#ceb3a1 eyr:2020\n" +
            "hgt:154cm\n" +
            "\n" +
            "pid:159642237\n" +
            "hcl:#81e94d ecl:gry eyr:2028 byr:1958\n" +
            "\n" +
            "hgt:90 hcl:#a97842 pid:#db1158\n" +
            "iyr:1928 ecl:#c82a43 byr:1971 eyr:2036\n" +
            "\n" +
            "eyr:2020\n" +
            "hgt:177cm iyr:2013\n" +
            "cid:347 ecl:grn\n" +
            "byr:1998 pid:455369144\n" +
            "\n" +
            "byr:1936\n" +
            "pid:444305229 iyr:2013 eyr:2025 hcl:#733820\n" +
            "ecl:gry\n" +
            "hgt:175cm\n" +
            "\n" +
            "byr:2027 hcl:z\n" +
            "hgt:61cm ecl:brn pid:836686228 eyr:2023 iyr:2030\n" +
            "\n" +
            "byr:1931\n" +
            "ecl:hzl hgt:168cm eyr:2023 pid:956562488 hcl:#fffffd\n" +
            "\n" +
            "ecl:#4126e5 pid:182cm iyr:2021\n" +
            "hgt:144 eyr:2039 hcl:z\n" +
            "\n" +
            "pid:321400085 hcl:#733820 hgt:189cm\n" +
            "ecl:hzl byr:1923 eyr:2023 iyr:2016\n" +
            "\n" +
            "iyr:2011 hgt:192cm hcl:#b6652a byr:1988 pid:998875769\n" +
            "ecl:#e612d9 eyr:2015\n" +
            "\n" +
            "eyr:2021 iyr:2011 pid:265966660\n" +
            "byr:1934 hgt:180cm\n" +
            "hcl:#7d3b0c\n" +
            "ecl:gry cid:225\n" +
            "\n" +
            "pid:550612542 ecl:oth byr:1931\n" +
            "iyr:2014 cid:99\n" +
            "hcl:#cfa07d hgt:163cm eyr:2026\n" +
            "\n" +
            "ecl:gry hgt:156cm iyr:2018 hcl:#5d9d64 pid:295386055 byr:1996\n" +
            "eyr:2025\n" +
            "\n" +
            "ecl:gry iyr:2013 pid:855457285 cid:309 eyr:2030\n" +
            "hcl:#733820 byr:1973\n" +
            "\n" +
            "eyr:2030 pid:86472746 ecl:blu\n" +
            "hgt:192cm\n" +
            "iyr:2013 byr:1939 hcl:#b6652a\n" +
            "\n" +
            "hcl:#888785\n" +
            "byr:1935\n" +
            "iyr:2018\n" +
            "hgt:155cm ecl:grn\n" +
            "pid:612879095 cid:108 eyr:2027\n" +
            "\n" +
            "eyr:2016 hcl:z pid:025915371 iyr:2010 hgt:183cm ecl:gry\n" +
            "byr:2010\n" +
            "cid:228\n" +
            "\n" +
            "hcl:#38dbf4\n" +
            "byr:1925 ecl:amb eyr:2020 pid:065102805 iyr:2018\n" +
            "\n" +
            "cid:244 hgt:171cm\n" +
            "hcl:#cfa07d pid:466737179 eyr:2025\n" +
            "byr:1937 iyr:2020 ecl:oth\n" +
            "\n" +
            "ecl:brn byr:1993 hgt:179cm hcl:#341e13 pid:855375268 eyr:2028\n" +
            "iyr:2018\n" +
            "\n" +
            "pid:809135189 iyr:2020 hgt:162cm eyr:2027\n" +
            "hcl:#888785 byr:1988 ecl:grn\n" +
            "\n" +
            "byr:2003 pid:4446708453\n" +
            "hgt:188cm iyr:2013 hcl:#888785 ecl:blu eyr:2008\n" +
            "\n" +
            "hgt:165in ecl:#db642f iyr:2014\n" +
            "eyr:2020\n" +
            "byr:1955 hcl:371f72 pid:756089060\n" +
            "\n" +
            "ecl:lzr\n" +
            "hgt:177in eyr:2037 pid:175cm\n" +
            "byr:2023 hcl:03b398 iyr:2026\n" +
            "\n" +
            "iyr:2017 ecl:blu byr:1942 hcl:#733820 eyr:2023 hgt:151cm pid:289923625";


    public static final String testInput =
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
































