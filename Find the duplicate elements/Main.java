import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      TreeSet list = new TreeSet();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine();
      String word[]=s.split(",");
      System.out.println("Duplicate Entry is:");
      for(int i=0;i<word.length;i++)
      {
      	if(list.contains(word[i])){
        	System.out.println(word[i]);
        }
        else
           list.add(word[i]);
      }
           System.out.println("TreeSet is : "+list);
    }
}