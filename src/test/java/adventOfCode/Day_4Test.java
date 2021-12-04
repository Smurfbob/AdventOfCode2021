package adventOfCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day_4Test {
    @Test
    public void test() {

        List<String> boards = genBoards(realBoards);

        List<String> testBoards = new ArrayList<>();
        testBoards.add(board1);
        testBoards.add(board2);
        testBoards.add(board3);

        System.out.println(Day_4.getGameSum(boards, realNumbers));

    }

    public static List<String> genBoards(String input) {
        List<String> boards = Arrays.stream(input.split("\n")).toList();
        List<String> out = new ArrayList<>();
        for (int i = 0; i < boards.size(); i++) {
            String next = new String();
            while (boards.get(i) != "") {
                next = next + boards.get(i) + "\n";
                i++;
                if (i >= boards.size()) {
                    break;
                }
            }

            out.add(next);

        }
        return out;
    }


    private static String realNumbers = "15,62,2,39,49,25,65,28,84,59,75,24,20,76,60,55,17,7,93,69,32,23,44,81,8,67,41,56,43,89,95,97,61,77,64,37,29,10,79,26,51,48,5,86,71,58,78,90,57,82,45,70,11,14,13,50,68,94,99,22,47,12,1,74,18,46,4,6,88,54,83,96,63,66,35,27,36,72,42,98,0,52,40,91,33,21,34,85,3,38,31,92,9,87,19,73,30,16,53,80";

    private static String realBoards =

            "92  3 88 13 50\n" +
                    "90 70 24 28 52\n" +
                    "15 98 10 26  5\n" +
                    "84 34 37 73 87\n" +
                    "25 36 74 33 63\n" +
                    "\n" +
                    "66 64 50 75 53\n" +
                    "73 24 80 84  5\n" +
                    "72 20 68  1 99\n" +
                    "83 57 44 60 52\n" +
                    "32 15 59 48 98\n" +
                    "\n" +
                    "33 51 85 92 89\n" +
                    "38 22 93 62 75\n" +
                    "24 76 50 90 25\n" +
                    "69  6 52 77  3\n" +
                    "47  9 88 53 63\n" +
                    "\n" +
                    "78 75 29 32 73\n" +
                    "22 85 42  1 23\n" +
                    "80 98 81 58  9\n" +
                    "61 76 69 83 53\n" +
                    "71  7 15 11 95\n" +
                    "\n" +
                    "33 57 76 73 26\n" +
                    " 6 71 35 39 85\n" +
                    "54 77 36 14 87\n" +
                    "66 79  8 64 32\n" +
                    " 2 84 98 34 13\n" +
                    "\n" +
                    "43 51 16 95 59\n" +
                    "22 53  6 49 94\n" +
                    "32 72 46 23 37\n" +
                    "40 85 39 45 74\n" +
                    "87 62 69 98  0\n" +
                    "\n" +
                    "84  5 73 32 23\n" +
                    "40 64 98 27  8\n" +
                    "80 71  1 31 69\n" +
                    "46 42  7  4 70\n" +
                    "88 90 48 33 29\n" +
                    "\n" +
                    " 3 91  8 98 50\n" +
                    "54 70 29 94 25\n" +
                    "17 77 33 46 12\n" +
                    "28 36 39 40  5\n" +
                    "22 38 51 69 45\n" +
                    "\n" +
                    "90 35 94 31 44\n" +
                    "11 13 74 38 49\n" +
                    "60 96 91 63 16\n" +
                    "23 26 84 41  7\n" +
                    "73 65 32 18 81\n" +
                    "\n" +
                    "62 42 35 21 87\n" +
                    "57 27 26 71 94\n" +
                    "73 92 77 53 86\n" +
                    " 1 60 38 75 43\n" +
                    "10 70 55 84  5\n" +
                    "\n" +
                    " 3 58 57 66 51\n" +
                    "67 94 37 86 25\n" +
                    "33 11  4 36 83\n" +
                    "64  2  0 13 59\n" +
                    "77 19 80 93 97\n" +
                    "\n" +
                    "99 13 24 49 90\n" +
                    "96 15 10 67  2\n" +
                    " 9 78  5 42 80\n" +
                    "28 75 51 58 82\n" +
                    "31 83 20 60 48\n" +
                    "\n" +
                    "91 38 65 34 58\n" +
                    "71 28 66 64 72\n" +
                    "63 10 83 37 56\n" +
                    "84 39 19 51 74\n" +
                    "23 90 81 85 13\n" +
                    "\n" +
                    "12 42 10 11 29\n" +
                    "99 60 24 94 25\n" +
                    " 9 40 76 33 97\n" +
                    "32 75 16 37 27\n" +
                    "15 69 54 52 22\n" +
                    "\n" +
                    "31 40 33 45 89\n" +
                    "61 82  9 32 75\n" +
                    "60 88 91 27 62\n" +
                    "79 94 36 83 25\n" +
                    "56 39  8 13 55\n" +
                    "\n" +
                    "39 95 92  2 56\n" +
                    "88 70 63 62 13\n" +
                    "49 43 46  0 47\n" +
                    "83 42 44  7 26\n" +
                    "60 27 69 73 29\n" +
                    "\n" +
                    "54 67 26 19 45\n" +
                    " 8 50 86 51 92\n" +
                    "60 98 31 95 53\n" +
                    "24 71 55 22 63\n" +
                    " 4 38 21 35 32\n" +
                    "\n" +
                    " 4 34 26 32 58\n" +
                    "16 67 76 78 46\n" +
                    "73 95 68 56 60\n" +
                    "35 40 42  6 87\n" +
                    " 7 97 54 92 24\n" +
                    "\n" +
                    "98 80 66 95 14\n" +
                    "73 19 94 63 60\n" +
                    "52 18 28 72 26\n" +
                    "33 93 56  4 21\n" +
                    "59 68 74 48  3\n" +
                    "\n" +
                    " 7 27 84 80 79\n" +
                    " 1 21 11 37 47\n" +
                    "88 38 30  8 72\n" +
                    " 4 52 13 19 26\n" +
                    "57  6 58  0 98\n" +
                    "\n" +
                    "62 50  0 37 77\n" +
                    "32 31  2 53  4\n" +
                    "74 56 41 23 59\n" +
                    "60 89 94 54 39\n" +
                    "76 98 20 61 82\n" +
                    "\n" +
                    "35 90  5 80 18\n" +
                    "45 20 60  8 77\n" +
                    "26 17 61 55 29\n" +
                    "24 76  3 41 64\n" +
                    " 4 74 85 10 82\n" +
                    "\n" +
                    "62 23 27 89 61\n" +
                    "45 65 30 14 66\n" +
                    "52 72 48 99  0\n" +
                    " 5 40 42 81 37\n" +
                    "93  4 67  2  9\n" +
                    "\n" +
                    "27 87 68 50 41\n" +
                    "18 60 12 45 48\n" +
                    "93 38  8  6 13\n" +
                    "99 37 59 94 64\n" +
                    "40 55 63 67 31\n" +
                    "\n" +
                    "70  4 34 49 71\n" +
                    "36 81 52 62 55\n" +
                    "18 64 63 85  5\n" +
                    "72 99 77 76 54\n" +
                    "22 23  0  1 37\n" +
                    "\n" +
                    "34 88 69 20 30\n" +
                    "73 11 93 68 56\n" +
                    "78 35 80 22 24\n" +
                    "15 95 32 51 25\n" +
                    "67 91 52  5 14\n" +
                    "\n" +
                    " 8 54 26 34 71\n" +
                    "16 47 39 96 58\n" +
                    " 4 95 38  6 45\n" +
                    "94 63 18 99 72\n" +
                    "19 91 80 73 30\n" +
                    "\n" +
                    "77  9 78 76 60\n" +
                    " 8 31 73 74 17\n" +
                    "22 25  7 64 47\n" +
                    "75 32 89 87 40\n" +
                    "13 44 10 95 49\n" +
                    "\n" +
                    "78  3 90 99  6\n" +
                    "22 52 25 53 72\n" +
                    "55 98 77 56 32\n" +
                    "85 86  0  7 12\n" +
                    "74 84 33 45  1\n" +
                    "\n" +
                    "57 53 26 54 69\n" +
                    "56  8 58 91 40\n" +
                    "65 97 44 51  2\n" +
                    "85 60 72 22 89\n" +
                    "66 16 67 90 93\n" +
                    "\n" +
                    " 9 93 65 94 29\n" +
                    " 2 80  7 16 79\n" +
                    "11  5 21 73 50\n" +
                    "20 70 37 48 85\n" +
                    "99  3 55 58  8\n" +
                    "\n" +
                    "26 37 60 63 47\n" +
                    "21 39 69 68 22\n" +
                    "83 94 55 91 80\n" +
                    "35 89  6 45 17\n" +
                    "23 85 84 73  7\n" +
                    "\n" +
                    "74 36 81 41  8\n" +
                    "14 22 30 86 90\n" +
                    "84 97 11 67 77\n" +
                    "42 47 55 76 64\n" +
                    "95 92 59 93 53\n" +
                    "\n" +
                    "64 16 19 68 50\n" +
                    "90 12 47 40 62\n" +
                    "86  1 48  2 58\n" +
                    "96 79 92 46 91\n" +
                    "14 85 59 45 30\n" +
                    "\n" +
                    " 3  1 55 13  5\n" +
                    "59 85 50 42 20\n" +
                    "67 99 17 29 39\n" +
                    "30 35 23 49 25\n" +
                    "89 53 21  9  6\n" +
                    "\n" +
                    "90 91 47 99 37\n" +
                    "82 24 56 27  2\n" +
                    "95 57 33  4 97\n" +
                    "51 26 29 67 98\n" +
                    "21 62 42 43  9\n" +
                    "\n" +
                    "92 16 89 24 96\n" +
                    "31 18  2 64 20\n" +
                    " 6 34 99 50 85\n" +
                    "13 32 19 43 37\n" +
                    "48 47 23 78 77\n" +
                    "\n" +
                    "95 16 87 61  6\n" +
                    "46 15 24 72 60\n" +
                    "43 56 80 35 53\n" +
                    "97 25 98 42 14\n" +
                    "51 11 10  3 45\n" +
                    "\n" +
                    "96 42  4 45 40\n" +
                    "65  8 17 58 23\n" +
                    "53 38 14 12 84\n" +
                    "68 92 11  6 51\n" +
                    "87 22  5 99  0\n" +
                    "\n" +
                    "45 51 26 18 91\n" +
                    " 7 31 95 37 74\n" +
                    "66 41 48 20 87\n" +
                    "99 96 64 53  0\n" +
                    " 3 28 15 46 79\n" +
                    "\n" +
                    "66 34 23 78 12\n" +
                    "65 72 33 14  5\n" +
                    " 4 59  3 62 64\n" +
                    " 7 60 31 52 87\n" +
                    "80 39 27 58 74\n" +
                    "\n" +
                    "91 94 64 46 28\n" +
                    "99 29 79 58  0\n" +
                    "18 19 24 59 16\n" +
                    " 3 73 52  9 86\n" +
                    "37 61  1 93 68\n" +
                    "\n" +
                    "37 98 80 41 53\n" +
                    "85 18 55 31 17\n" +
                    "39 61 63 97 52\n" +
                    "47 22 99 50 88\n" +
                    "48 14  9 93 96\n" +
                    "\n" +
                    "11 66 89 91 34\n" +
                    "98 25 53  7 65\n" +
                    "42 32  9 14 77\n" +
                    "85 87 26 12 64\n" +
                    "45 99 29 88  4\n" +
                    "\n" +
                    "63  3 16 13 33\n" +
                    "28 32 37 90 11\n" +
                    "94 44 18 38 68\n" +
                    "30 87 95 52 58\n" +
                    "79 43 53 70 19\n" +
                    "\n" +
                    "94 67 56 43 47\n" +
                    "77 37 93 90 92\n" +
                    "66 48 98 20 61\n" +
                    "51  2 85 57 11\n" +
                    "22 84 79 17 72\n" +
                    "\n" +
                    "86 59 15 85  5\n" +
                    "93 41 23 53 62\n" +
                    "46 48 70 57 49\n" +
                    "17 45 32 79 12\n" +
                    "64 73 26  6  9\n" +
                    "\n" +
                    "12 88 27 43 21\n" +
                    "66 42 84 82 62\n" +
                    "94 46 96 63 86\n" +
                    "69 79 40 39 92\n" +
                    "22 87 71 44 53\n" +
                    "\n" +
                    "89 26 45 78 25\n" +
                    "21 40 70 66 33\n" +
                    "97 80 94 18  1\n" +
                    "12 55 20 24 39\n" +
                    " 7 32 31 37 72\n" +
                    "\n" +
                    "15 56 39 57 40\n" +
                    "67 59 26 30 90\n" +
                    "84  2 41 25  7\n" +
                    "96 23 79 99 85\n" +
                    "13 10 86 51 53\n" +
                    "\n" +
                    "73  8 79 19 48\n" +
                    "29 36 89 62 22\n" +
                    "13 96 59 91 10\n" +
                    "90  9  1 78 65\n" +
                    "83 50 24 88 60\n" +
                    "\n" +
                    "20 61 63 82 53\n" +
                    "86 11 55 10 85\n" +
                    " 5 37 65 21 54\n" +
                    "89 75 59 73 48\n" +
                    "41 50 29 71 93\n" +
                    "\n" +
                    "81 13 46 17 47\n" +
                    "95 19 33 91 55\n" +
                    " 5 73 54 50 98\n" +
                    "63 77 30 40 58\n" +
                    " 9 57 94 92 20\n" +
                    "\n" +
                    "54 99 94 23 81\n" +
                    "32 86 50 28  8\n" +
                    "69 18 11 39 67\n" +
                    "10 79 91 15 43\n" +
                    "13 98 55 16 22\n" +
                    "\n" +
                    "83 99 54 12 80\n" +
                    "94 61 49 33 62\n" +
                    "16 23 68 87 10\n" +
                    " 1 76 25 89 71\n" +
                    " 8 45 74 28 27\n" +
                    "\n" +
                    "66 28 72 76 33\n" +
                    " 9 99 27 96 60\n" +
                    "84 67 35 50 79\n" +
                    "55 44 18 98 13\n" +
                    "94 70 42 21 65\n" +
                    "\n" +
                    "96 97 79 75 46\n" +
                    "11 65 41 72 92\n" +
                    "87 59 26 70 10\n" +
                    "37  8 68 73 63\n" +
                    "55 95 84 49 50\n" +
                    "\n" +
                    "51 27 63 31 24\n" +
                    "82 11 87  6  2\n" +
                    "75 57 85  1 46\n" +
                    "91 71 72 13 56\n" +
                    "10 64 65 49 69\n" +
                    "\n" +
                    "36 26 67 61 84\n" +
                    "99 10  2 24 47\n" +
                    "35 28 65 57 91\n" +
                    "30 27  1 78 14\n" +
                    "96 50 70 38 37\n" +
                    "\n" +
                    "62 33 41 98 35\n" +
                    "80 92  4 48 70\n" +
                    " 2 11 23 15 52\n" +
                    "83 39 79 81  1\n" +
                    "54 93 27 18 24\n" +
                    "\n" +
                    "12 75 20 81 23\n" +
                    "77 99 47 24 82\n" +
                    "92 29 85 30 21\n" +
                    "49 45 98  4 91\n" +
                    " 9 53 28  1 54\n" +
                    "\n" +
                    "72 46 53  3 19\n" +
                    "83 49 39 12 22\n" +
                    "47 62 58 14 79\n" +
                    "82 69 84 75  1\n" +
                    "67  7 21 45 65\n" +
                    "\n" +
                    "43 21 47 84 94\n" +
                    "93 53 37 44 15\n" +
                    "48 10 59 35 41\n" +
                    "91 78 98 34 66\n" +
                    "85 75 95 92 39\n" +
                    "\n" +
                    "94  6 17 16 12\n" +
                    "39 41 11 65 78\n" +
                    "97 85 49 64 72\n" +
                    "59 84 83 42 28\n" +
                    "32 96 46 89 44\n" +
                    "\n" +
                    "54 29 71 64 78\n" +
                    "32 13 52 58 28\n" +
                    "84 85 95 26 86\n" +
                    "23 41 70 53 87\n" +
                    "27 15 57 16  2\n" +
                    "\n" +
                    "92 99 45 81 32\n" +
                    "86 25 56 76 52\n" +
                    "95  3  6 88  1\n" +
                    "71 70 24 19 62\n" +
                    "59 16 11  2 34\n" +
                    "\n" +
                    "43 56 11  7 49\n" +
                    " 1 50 84 89  0\n" +
                    "97 18 60 95 25\n" +
                    "42 33 75 31 29\n" +
                    "35 62 78 99 76\n" +
                    "\n" +
                    "98 84 53  3 22\n" +
                    "54 87 41 76 83\n" +
                    "39 27 36 79 78\n" +
                    "55  1 89 48 81\n" +
                    "49 26 77 96 67\n" +
                    "\n" +
                    "99 79 98 84 47\n" +
                    "72 14 49  3 10\n" +
                    "30  9 12 61  1\n" +
                    "21 50 75 82  8\n" +
                    "86 44 13 83 88\n" +
                    "\n" +
                    "82 94 33 70 17\n" +
                    "97 22 45 53 55\n" +
                    "19 71 35 54 52\n" +
                    "41 42 63 65  3\n" +
                    "88 10 67 81 69\n" +
                    "\n" +
                    "50 90 18  2 22\n" +
                    "51 85 67 40 61\n" +
                    " 3 71 99 93 46\n" +
                    "65 29 45 60 75\n" +
                    " 5 74  6 66 98\n" +
                    "\n" +
                    "68 80 59 29  5\n" +
                    " 6 16 45 44 92\n" +
                    "74 13 64 30 25\n" +
                    "69 94 54 97  3\n" +
                    "42 47 26 19 17\n" +
                    "\n" +
                    "38 79 36 61 90\n" +
                    "19 59 18  3 71\n" +
                    "70 99 16 93 22\n" +
                    "68 34 88 76 17\n" +
                    "75 54 49 85 86\n" +
                    "\n" +
                    " 8 96 80 15 28\n" +
                    "23 98 58 84 69\n" +
                    "21  3 60 38 97\n" +
                    "43 56 34 25 64\n" +
                    "24  1 39 44 78\n" +
                    "\n" +
                    "21 60 14 55 29\n" +
                    "34 61 63 18  5\n" +
                    "19 28 54 72  7\n" +
                    "32 46 92 80 73\n" +
                    "40 68 75 67 98\n" +
                    "\n" +
                    "57 21 88 90 33\n" +
                    "63  5 25 24 49\n" +
                    "29  7 23 19 13\n" +
                    "85 93 75 41 68\n" +
                    "98 69 12 76 31\n" +
                    "\n" +
                    "74 88 75 81 51\n" +
                    "46 77 66 60 20\n" +
                    "47  0 23 64 43\n" +
                    "68 41 38 65 48\n" +
                    "53 26 54 17 83\n" +
                    "\n" +
                    "39 21 78 15 99\n" +
                    "25 97 24 70 56\n" +
                    "57 66 31 75 71\n" +
                    "47 91 30  4 65\n" +
                    "94 11 77 76 44\n" +
                    "\n" +
                    "35 42 72 38 51\n" +
                    "96 32  3 64 48\n" +
                    "81 50 37 55 79\n" +
                    "90 67 54  6 12\n" +
                    "31 45 71 25 76\n" +
                    "\n" +
                    "60 58 90  3 74\n" +
                    "48 16 49 30 46\n" +
                    "68 51  0 80 96\n" +
                    "26 71 36 27 28\n" +
                    "57 94 79 42 50\n" +
                    "\n" +
                    "96 27 94 74 89\n" +
                    "57 19 51  5 78\n" +
                    "20 59 14 73 69\n" +
                    " 8 41 79 76 32\n" +
                    "24 98 63 46 13\n" +
                    "\n" +
                    "20 53 42 70 86\n" +
                    "12 49 96  0 77\n" +
                    "31 26 38 22 87\n" +
                    "51 78 60 36 13\n" +
                    "57  8 73 94  7\n" +
                    "\n" +
                    "75 39 93 85 99\n" +
                    "78 50  3 96 68\n" +
                    "62 10 28 80 41\n" +
                    "89 40 46 69 19\n" +
                    "37 13 16  2 67\n" +
                    "\n" +
                    "85 24 99 70 20\n" +
                    "31 60 41 63 81\n" +
                    "34 87 93 39 37\n" +
                    "55 43 44 25 78\n" +
                    "97 21  3 28 40\n" +
                    "\n" +
                    "44 14 92 89 62\n" +
                    "90 76 84 52 33\n" +
                    "78 54 26 32  9\n" +
                    "85 99 25 10 55\n" +
                    "28 23 22 97 94\n" +
                    "\n" +
                    "13 38 37 98 15\n" +
                    "78 62  9 50  2\n" +
                    "77 68 65 18 74\n" +
                    "90 21 95 53 33\n" +
                    "60 25 17 64  1\n" +
                    "\n" +
                    "45 87 64 33 66\n" +
                    "31 85 19 90 48\n" +
                    "74  3 70 77  9\n" +
                    "44 46 61 91 32\n" +
                    " 0 15 94 65 22\n" +
                    "\n" +
                    "12  1 66 47  3\n" +
                    "63  7  2 42 21\n" +
                    " 6 75 44 26 82\n" +
                    "52 45 48 89 68\n" +
                    "96 92 25 15 76\n" +
                    "\n" +
                    "64 16 49 71 28\n" +
                    " 7 45 63 74 21\n" +
                    "87 25 46 23  9\n" +
                    " 0 31 92 24 77\n" +
                    "65 78 22 60 75\n" +
                    "\n" +
                    " 4 54 58 83 60\n" +
                    "25 12 82  0 73\n" +
                    "32 62  2 31 49\n" +
                    "64 18 35 19 10\n" +
                    "61 46 43 34 38\n" +
                    "\n" +
                    "84 48 30 77 79\n" +
                    "15 42  4 25 72\n" +
                    "28 78 22  7 70\n" +
                    "46  6 31 24 41\n" +
                    "98 93 34 37 71\n" +
                    "\n" +
                    "72  9 71  1 54\n" +
                    "97 98 91 90 92\n" +
                    "23 88 13 87 68\n" +
                    "45 36 86 41 56\n" +
                    "69 16 24 20 93\n" +
                    "\n" +
                    "35 34 60 67 52\n" +
                    "12 73 99 89 61\n" +
                    "33 94 27 16 15\n" +
                    " 4 64 47 22 74\n" +
                    "24 53 71 66 76\n" +
                    "\n" +
                    "32 62 51 58  1\n" +
                    "11 76 75 33 60\n" +
                    "55 54 39 52 48\n" +
                    " 6 87  3  8 99\n" +
                    "40 65 24 66 70\n" +
                    "\n" +
                    "61 23 22 12 74\n" +
                    "73 25 85 11  0\n" +
                    "20 38 26 88 33\n" +
                    "63 39 50 49 83\n" +
                    "71 18 56 37  7\n" +
                    "\n" +
                    "46 12 90 52 48\n" +
                    "73 24 78 34 94\n" +
                    "15 19 47 72 89\n" +
                    "60 35 74 67 30\n" +
                    "13 18 17 93  0\n" +
                    "\n" +
                    "37 87  0 94 27\n" +
                    "18 56 54  4 33\n" +
                    "84 20 12 86  6\n" +
                    " 5 40 52 97 74\n" +
                    "63 59 69 19 77\n" +
                    "\n" +
                    "15 53 20 35 14\n" +
                    "24 25 63 85 79\n" +
                    "65 96  2 60 50\n" +
                    "72 10 77 12 92\n" +
                    "32 94 95 16 71\n" +
                    "\n" +
                    "78 52 55 20 40\n" +
                    "33 66 81 48 18\n" +
                    "32 69 13  5 84\n" +
                    "23 67 68 61 34\n" +
                    "11 63  4 93 65\n" +
                    "\n" +
                    "51 89 37 46 29\n" +
                    "69 56 71  9 91\n" +
                    "28 54  7 16 31\n" +
                    "67  5 97 42 43\n" +
                    "98 32 65 34 30";


    private static String numbers = "7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1";

    private static String board1 =
            "22 13 17 11  0\n" +
                    " 8  2 23  4 24\n" +
                    "21  9 14 16  7\n" +
                    " 6 10  3 18  5\n" +
                    " 1 12 20 15 19";

    private static String board2 =
            "3 15  0  2 22\n" +
                    " 9 18 13 17  5\n" +
                    "19  8  7 25 23\n" +
                    "20 11 10 24  4\n" +
                    "14 21 16 12  6";

    private static String board3 =
            "14 21 17 24  4\n" +
                    "10 16 15  9 19\n" +
                    "18  8 23 26 20\n" +
                    "22 11 13  6  5\n" +
                    " 2  0 12  3  7";

}