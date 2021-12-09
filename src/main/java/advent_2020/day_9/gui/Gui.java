package advent_2020.day_9.gui;

import advent_2020.day_9.Day_9;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Gui extends JFrame
{
    private static final Color FOUND = Color.BLUE;
    private static final Color UNFOUND = Color.black;
    private static final Color STARTPOINT = Color.green;

    private JPanel[][] panels;
    private final Day_9.Point[][] points;

    private JPanel mainPane;
    private JPanel topPane;

    private Map<Day_9.Point, List<Day_9.Point>> pointMap = new HashMap<>();

    public Gui(String name , int width, int height, Day_9.Point[][] array,Map<Day_9.Point,List<Day_9.Point>> pointMap)
    {
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

    public static int sumMap(Map<Day_9.Point,List<Day_9.Point>> list)
    {
        int out = 0;

        for(Day_9.Point key : list.keySet())
        {
            out += key.number+1;
        }

        return out;
    }


    private void genPanels(int x , int y)
    {
        this.panels = new JPanel[x][y];
        this.mainPane = SwingUtils.genComponent(new JPanel(), 100, 100 , 0 ,0 , Color.white);
        this.mainPane.setLayout(new GridLayout(this.panels.length,this.panels[0].length));
        this.topPane = SwingUtils.genComponent(new JPanel(), 100, 50 , 0, 0 ,Color.white);
        this.topPane.add(SwingUtils.genComponent(new JLabel("Lows: " + this.pointMap.size()), 100 , 20 , 0 , 0 , Color.white));
        this.topPane.add(SwingUtils.genComponent(new JLabel("Answer a: " + sumMap(this.pointMap)), 100 , 20 , 0 , 0 , Color.white));

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

    private void markPoints()
    {
        for(Day_9.Point el : this.pointMap.keySet())
        {
            this.panels[el.i][el.k].setBackground(STARTPOINT);
            for(Day_9.Point el1 : pointMap.get(el))
            {
                this.panels[el1.i][el1.k].setBackground(FOUND);
            }
        }
        this.setVisible(true);
    }

    private static Color genRandomColor(int start)
    {
        int r1 = ThreadLocalRandom.current().nextInt(start);
        int r2 = ThreadLocalRandom.current().nextInt(start);
        int r3 = ThreadLocalRandom.current().nextInt(start);
        return new Color(r1,r2,r3);
    }
}
