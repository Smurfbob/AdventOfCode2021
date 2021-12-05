package advent_2021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day_5 {
    public static int lineOverlap(String input) {
        Field field = new Field(input);

        System.out.println(field);

        return 0;
    }


    public static class Field {

        private int[][] cells;
        private List<Position> positions;

        public Field(String input) {
            this.positions = Arrays.stream(input.split("\n")).map(Field::genPosition).toList();
            this.markPositions(this.positions);
        }
        {
            this.cells = new int[10][10];
            for (int i = 0; i < this.cells.length; i++) {
                for (int k = 0; k < this.cells[i].length; k++) {
                    this.cells[i][k] = 0;
                }
            }
        }

        private void markPositions(List<Position> list) {

            for (Position el : list)
            {
                this.addUp(el);
                while (!Position.positionsEqual(el))
                {
                    if(el.x1 != el.x2)
                    {
                        if(el.x1 < el.x2)
                        {
                            el.x1++;
                        }
                        else
                        {
                            el.x1--;
                        }
                    }
                    else if(el.y1 != el.y2)
                    {
                        if(el.y2 < el.y1)
                        {
                            el.y2++;
                        }
                        else
                        {
                            el.y2--;
                        }
                    }
                    this.addUp(el);
                }
            }
        }

        private void addUp(Position position)
        {
            this.cells[position.x1][position.y1]++;
        }

        @Override
        public String toString()
        {
            String out = new String();

            for(int i=0 ; i < this.cells.length ; i++)
            {
                for(int k=0 ; k < this.cells[i].length ; k++)
                {
                    if(k == this.cells[i].length-1)
                    {
                        out = out + this.cells[i][k] + "\n";
                    }
                    else
                    {
                        out = out + this.cells[i][k] + " ";
                    }
                }
            }

            return out;
        }

        private static Position genPosition(String command) {
            List<String> list = Arrays.stream(command.split(" ")).toList();
            String a = list.get(0);
            String b = list.get(2);

            List<Integer> listA = Arrays.stream(a.split(",")).map(el -> new Scanner(el).nextInt()).toList();
            List<Integer> listB = Arrays.stream(b.split(",")).map(el -> new Scanner(el).nextInt()).toList();

            return new Position(listA.get(0), listA.get(1), listB.get(0), listB.get(1));
        }

        private static class Position {
            public int x1, x2;
            public int y1, y2;

            public Position(int x1, int y1, int x2, int y2) {
                this.x1 = x1;
                this.y1 = y1;
                this.x2 = x2;
                this.y2 = y2;
            }

            public static boolean positionsEqual(Position position)
            {
                return (position.x1 == position.x2 && position.y1 == position.y2);
            }

            public boolean equals(Position position)
            {
                return (this.x1 == position.x1 && this.x2 == position.x2 && this.y1 == position.y1 && this.y2 == position.y2);
            }
        }


    }
}
