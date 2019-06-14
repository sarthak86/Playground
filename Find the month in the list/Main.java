import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine();
      String month=br.readLine();
      String word[]=s.split(",");
      LinkedHashSet aa = new LinkedHashSet();
      for(int i=0;i<word.length;i++)
      {
          aa.add(word[i]);
      }
      System.out.println(aa);
      System.out.println("Size of the linked list: "+aa.size());
      System.out.println("Is LinkedList empty? "+aa.isEmpty());
      System.out.println("Does LinkedList contains "+month+"?");
      System.out.print(aa.contains(month));    
    }
}