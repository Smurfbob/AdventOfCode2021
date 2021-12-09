package advent_2020.day_9.gui;

import advent_2020.day_9.Day_9;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gui extends JFrame
{
    // Standardfarben für die Visualisierung der Points
    private static final Color UNFOUND = Color.black;       // Zahlen die nicht markiert werden bleiben schwarz
    private static final Color STARTPOINT = Color.green;    // Die "Lowpoints" werden grün markiert

    // Die panels entsprechen den points von der Größe her und dienen nur der Visualisierung eben dieser.
    private JPanel[][] panels;
    private final Day_9.Point[][] points;

    private JPanel mainPane;    // Ein panel, in welchen die Zahlen farblich visualisiert werden
    private JPanel topPane;     // Obere leiste zur Visualisierung von Parametern

    private final int sumB;

    private Map<Day_9.Point, List<Day_9.Point>> pointMap = new HashMap<>();


    /**
     *
     * @param name      Name des JFrames
     * @param width     Breite des JFrames
     * @param height    Höhe des JFrames
     * @param array     Ein zweidimensionales Array, in denen die "LowPoints" markiert sind
     * @param pointMap  Eine Map, die für jeden "LowPoint" die zugehörigen "basins" enthält
     * @param sumB      Das ergebnis des Aufgabenteils zwei. (Wird extern berechnet und dient nur der Visualisierung)
     */
    public Gui(String name , int width, int height, Day_9.Point[][] array,Map<Day_9.Point,List<Day_9.Point>> pointMap , int sumB)
    {
        this.sumB = sumB;
        this.pointMap = pointMap;
        this.points = array;
        int x = array.length;
        int y = array[0].length;
        this.setSize(width,height);
        this.setTitle(name);

        this.genPanels(x,y);
        this.markPoints();
        this.add(this.mainPane , BorderLayout.CENTER);
        this.add(this.topPane, BorderLayout.NORTH);
        this.setVisible(true);
    }
    {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Berechnet die Summe der keys+1 für den ersten Aufgabenteil.
     * Die Map enthält die "Lowpoints" als key, mit deren zugehörigen "basins",
     * welche hier aber nicht verwendet werden.
     * @param list
     * @return
     */
    public static int sumMap(Map<Day_9.Point,List<Day_9.Point>> list)
    {
        int out = 0;

        for(Day_9.Point key : list.keySet())
        {
            out += key.number+1;
        }

        return out;
    }


    /**
     * Generiert das Feld, in welchen die Points als JPanel angeordnet werden.
     * @param x
     * @param y
     */
    private void genPanels(int x , int y)
    {
        this.panels = new JPanel[x][y];
        this.mainPane = SwingUtils.genComponent(new JPanel(), 100, 100 , 0 ,0 , Color.white);
        this.mainPane.setLayout(new GridLayout(this.panels.length,this.panels[0].length));
        this.topPane = SwingUtils.genComponent(new JPanel(), 100, 50 , 0, 0 ,Color.white);
        this.topPane.add(SwingUtils.genComponent(new JLabel("Lows: " + this.pointMap.size()), 100 , 20 , 0 , 0 , Color.white));
        this.topPane.add(SwingUtils.genComponent(new JLabel("Answer a: " + sumMap(this.pointMap)), 100 , 20 , 0 , 0 , Color.white));
        this.topPane.add(SwingUtils.genComponent(new JLabel("Answer b: " + this.sumB), 150 , 20 , 0 , 0 , Color.white));

        for(int i=0 ; i < this.panels.length ; i++)
        {
            for (int k = 0; k < this.panels[i].length; k++)
            {
                this.panels[i][k] = SwingUtils.genComponent(new JPanel(), 25, 25, 0, 0, UNFOUND);
                JLabel label = SwingUtils.genComponent(new JLabel(/*this.points[i][k].number + ""*/), 10, 10, 0, 0, UNFOUND);
                label.setForeground(Color.red);
                label.setFont(new Font(null, 0, 3));
                this.panels[i][k].add(label);
                this.mainPane.add(this.panels[i][k]);
            }

        }
    }

    /**
     * Verwendet die pointMap, um die "basins" der größe nach farblich zu markieren.
     * Der Key ist der "Lowpoint" und wird immer grün markiert.
     * Die basins werden nach größe des Klusters farblich markiert, um diese besser zu unterscheiden.
     */
    private void markPoints()
    {
        for(Day_9.Point el : this.pointMap.keySet())
        {
            this.panels[el.i][el.k].setBackground(STARTPOINT);
            for(Day_9.Point el1 : pointMap.get(el))
            {
                int size = pointMap.get(el).size();
                Color c;
                if(size < 10)
                {
                    c = Color.pink;
                }
                else if(size >= 10 && size <= 20)
                {
                    c = Color.WHITE;
                }
                else if(size >= 20 && size <= 30)
                {
                    c = Color.red;
                }
                else if(size >= 30 && size <= 40)
                {
                    c = Color.CYAN;
                }
                else if(size >= 40 && size <= 50)
                {
                    c = Color.yellow;
                }
                else if(size >= 50 && size <= 60)
                {
                    c = Color.MAGENTA;
                }
                else if(size >= 60 && size <= 70)
                {
                    c = Color.gray;
                }
                else
                {
                    c = Color.lightGray;
                }

                this.panels[el1.i][el1.k].setBackground(c);

            }
        }
        this.setVisible(true);
    }

}
