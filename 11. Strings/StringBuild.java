
import java.util.*;
public class StringBuild 
{
	  public static void main(String args[])                       
      {
              StringBuilder sb = new StringBuilder("");         //String Builder

              for(char ch='a'; ch<='z'; ch++)
              {
                      sb.append(ch);
              }

              System.out.println(sb);
              System.out.println(sb.length());

      }

}
