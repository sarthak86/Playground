import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String aa[])throws IOException
    {
       // type your code here
      LinkedHashSet a= new LinkedHashSet();
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      String s=b.readLine();
      String[] word=s.split(",");
      for(int i=0;i<word.length;i++)
        a.add(word[i]);
      System.out.println(a);
      System.out.print("Enter the value to be deleted: ");
      s=b.readLine();
      System.out.println(s);
      word=s.split(",");
      for(int i=0;i<word.length;i++)
        a.remove(word[i]);
      System.out.println(a);
      System.out.print("Enter the value to be added: ");
      s=b.readLine();
      System.out.println(s);
      word=s.split(",");
      for(int i=0;i<word.length;i++)
        a.add(word[i]);
      System.out.println(a);
    }
}