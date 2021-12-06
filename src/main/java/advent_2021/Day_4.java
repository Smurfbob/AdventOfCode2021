package advent_2021;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day_4 {



    public static int getGameSum(List<String> boards, String numbers)
    {
        List<Integer> drawNumbers = Arrays.stream(numbers.split(",")).map(el -> new Scanner(el).nextInt()).collect(Collectors.toList());
        List<BingoGame> bingoGames = boards.stream().map(BingoGame::new).collect(Collectors.toList());

        Winner winner = getLoser(bingoGames, drawNumbers);

        System.out.println(winner.gameField);
        System.out.println("BoardSum: " + winner.gameField.getFieldSum());
        System.out.println("Nummer: " + winner.winingNumber);

        return winner.winingNumber*winner.gameField.getFieldSum();

    }

    public static Winner getLoser(List<BingoGame> games, List<Integer> draws)
    {
        for(int i =0 ; i < draws.size() ; i++)
        {
            int draw = draws.get(i);
            for(BingoGame game : games)
            {
                game.activateCell(draw);
                int leftGames = games.stream().filter(el -> !el.isVictory()).collect(Collectors.toList()).size();
                if(leftGames == 1)
                {
                    BingoGame loser = games.stream().filter(el -> !el.isVictory()).collect(Collectors.toList()).get(0);
                    while (!loser.isVictory())
                    {
                        loser.activateCell(draws.get(i));
                        i++;
                    }
                    return new Winner(loser, draws.get(i-1));

                }
            }
        }

        throw  new RuntimeException("No loser found!");
    }


    public static Winner getWinner(List<BingoGame> games , List<Integer> draws)
    {
        for(int draw : draws)
        {
            for(BingoGame game : games)
            {
                game.activateCell(draw);
                if(game.isVictory())
                {
                    return new Winner(game, draw);
                }

            }
        }

        throw new RuntimeException("No winner found");
    }

    public static class Winner
    {
        public int winingNumber;
        public BingoGame gameField;

        public Winner(BingoGame field, int winingNumber)
        {
            this.gameField = field;
            this.winingNumber = winingNumber;
        }
    }


    public static class BingoGame
    {
        private static int boardCounter = 1;

        private final Cell[][] fieldOfBingo;
        private final int id;

        public BingoGame(String numbers)
        {
            fieldOfBingo = genBingoField(numbers);
            this.id = boardCounter;
            boardCounter++;
        }

        public boolean isVictory()
        {
            for(int i = 0; i < this.fieldOfBingo.length ; i++)
            {
                int counter = 0;
                for(int k = 0; k < this.fieldOfBingo[i].length ; k++)
                {
                    if(this.fieldOfBingo[i][k].active)
                    {
                        counter++;
                    }
                }

                if(counter == 5)
                {
                    return true;
                }
            }

            for(int i = 0; i < this.fieldOfBingo.length ; i++)
            {
                int counter = 0;
                for(int k = 0; k < this.fieldOfBingo[i].length ; k++)
                {
                    if(this.fieldOfBingo[k][i].active)
                    {
                        counter++;
                    }
                }

                if(counter == 5)
                {
                    return true;
                }
            }

            return false;
        }

        public static Cell[][] genBingoField(String input)
        {
            Cell[][] cells = new Cell[5][5];
            List<String> lines = Arrays.stream(input.split("\n")).collect(Collectors.toList());
            for(int i=0 ; i < lines.size() ; i++)
            {
                List<Integer> numbers = Arrays.stream(lines.get(i).split(" ")).filter(el -> !el.equals("") ).map(el -> new Scanner(el).nextInt()).collect(Collectors.toList());
                for(int k = 0 ; k < numbers.size() ; k++)
                {
                    cells[i][k] = new Cell(numbers.get(k));
                }
            }

            return cells;
        }

        public void setCellStatus(int x, int y, boolean status)
        {
            this.fieldOfBingo[x][y].active = status;
        }

        public int getFieldSum()
        {
            return flatMap(this.fieldOfBingo).stream().filter(el -> !el.active).mapToInt(el -> el.number).sum();
        }

        public void activateCell(int number)
        {
            for(Cell cell : flatMap(this.fieldOfBingo))
            {
                if(cell.number == number)
                {
                    cell.active = true;
                }
            }
        }

        public static List<Cell> flatMap(Cell[][] cells)
        {
            List<Cell> list = new ArrayList<>();
            for(Cell[] cells1 : cells)
            {
                for(Cell cell : cells1)
                {
                    list.add(cell);
                }
            }
            return list;
        }

        public static class Cell
        {
            private final int number;
            private boolean active;

            public Cell(int number)
            {
                this.number = number;
                this.active = false;
            }

            public int getNumber() {
                return number;
            }

            public boolean isActive() {
                return active;
            }

            public void setActive(boolean active) {
                this.active = active;
            }
        }

        @Override
        public String toString()
        {
            String out = new String();
            out = out + this.id + "\n";

            for(int i = 0; i < this.fieldOfBingo.length ; i++)
            {
                for(int k = 0; k < this.fieldOfBingo[i].length ; k++)
                {
                    Cell cell = this.fieldOfBingo[i][k];
                    if(cell.active)
                    {
                        out = out + "T";
                    }
                    else
                    {
                        out = out + "F";
                    }
                }
                out = out + "\n";
            }

            return out;
        }
    }
}
