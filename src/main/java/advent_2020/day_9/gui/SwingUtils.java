package advent_2020.day_9.gui;

import java.awt.*;

public abstract class SwingUtils
{

    public static <Typ extends Component> Typ genComponent(Typ el , int width, int height, int x, int y, Color color)
    {
        el.setPreferredSize(new Dimension(width,height));
        el.setBounds(x,y,width,height);
        el.setBackground(color);
        return el;
    }
}
