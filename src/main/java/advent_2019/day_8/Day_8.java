package advent_2019.day_8;

import java.util.ArrayList;
import java.util.List;

public class Day_8
{

    public static record LayerContainer(String input, int width, int height){}
    public static record Position(List<String> value, int index){}


    public static int getLayerWithFewestZeroDigits (String input , int width, int height)
    {
        LayerContainer container = new LayerContainer(input, width, height);
        List<List<String>> listOfLayers = genStringList(container);

        int counter = 0;
        Position first = new Position(listOfLayers.get(0), 0);
        for(int i=0 ; i < listOfLayers.size() ; i++)
        {
            if(countChar(first.value , '0') > countChar(listOfLayers.get(i) , '0'))
            {
                first = new Position(listOfLayers.get(i), i);
            }
        }


        return 0;
    }

    private static int countChar (List<String> list, char character)
    {
        int zeros = 0;
        for(String el : list)
        {
            for(char c : el.toCharArray())
            {
                if(c == character)
                {
                    zeros++;
                }
            }
        }
        return zeros;
    }

    private static List<List<String>> genStringList(LayerContainer container)
    {
        List<List<String>> layerList = new ArrayList<>();

        List<String> layer = new ArrayList<>();
        String next = new String();

        if(container.input.length() % container.height == 0)
        {
            for(int i=0 ; i < container.input.length() ; i++)
            {
                char el = container.input.charAt(i);

                if(i % container.width != 0 || i == 0)
                {
                    next = next + el;
                }
                else
                {
                    layer.add(next);
                    next = "" + el;
                    if(layer.size() == container.height)
                    {
                        layerList.add(layer);
                        layer = new ArrayList<>();
                    }
                }
            }
            layer.add(next);
            layerList.add(layer);
        }

        return layerList;
    }


}
