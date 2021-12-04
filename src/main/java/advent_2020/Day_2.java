package advent_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day_2 {
    public static int getValidPasswordCount(String input) {

        List<Password> passwords = Arrays.stream(input.split("\n")).map(Password::new).collect(Collectors.toList());


        return passwords.stream().filter(el -> el.isValid2()).collect(Collectors.toList()).size();
    }


    public static class Password {

        private final char wantedChar;
        private final int min, max;
        private final String pass;

        public Password(String data) {
            List<String> list = Arrays.stream(data.split(" ")).collect(Collectors.toList());
            List<Integer> minMax = Arrays.stream(list.get(0).split("-")).map(el -> new Scanner(el).nextInt()).collect(Collectors.toList());

            this.min = minMax.get(0);
            this.max = minMax.get(1);
            this.wantedChar = removeChar(list.get(1), ':').charAt(0);
            this.pass = list.get(2);

        }

        public boolean isCharAtIndex(int position) {
            return this.pass.charAt(position) == this.wantedChar;
        }

        public boolean isValid2() {
            if (this.max-1 < this.pass.length() && this.min-1 < this.pass.length()) {
                return ((this.isCharAtIndex(max-1) || this.isCharAtIndex(min-1)) && !(this.isCharAtIndex(min-1) && this.isCharAtIndex(max-1)));
            }

            throw new RuntimeException("Der Index ist nicht vorhanden!");
        }

        public boolean isValid() {
            int counter = 0;
            for (char el : this.pass.toCharArray()) {
                if (el == this.wantedChar) {
                    counter++;
                }
            }
            return (counter >= this.min && counter <= this.max);
        }

        public static String removeChar(String input, char el) {
            String out = new String();
            for (char c : input.toCharArray()) {
                if (el != c) {
                    out = out + c;
                }
            }
            return out;
        }
    }
}
