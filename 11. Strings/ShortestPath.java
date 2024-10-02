package com.saisree.strings;

public class ShortestPath 
{

    public static float getShortestPath(String path)           //  Getting the Shortest Path of 
    {                                                         //    String path = "WNEENESENNN"
        int x=0, y=0;

        for(int i=0;i<path.length();i++)
        {
            char dir = path.charAt(i);

            //SOUTH
            if(dir == 'S')
            {
                y--;
            }
            //NORTH
            else if(dir =='N')
            {
                y++;
            }
            //WEST
            else if(dir == 'W')
            {
                x--;
            }
            else
            {
                x++;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);

    }

    public static void main(String args[])
    {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));

    }

}
