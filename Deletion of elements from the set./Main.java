import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String aa[])throws IOException
    {
       // type your code here
      TreeSet a= new TreeSet();
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      String s=b.readLine();
      String[] word=s.split(",");
      for(int i=0;i<word.length;i++)
        a.add(word[i]);
      System.out.println(a);
	  Object arr1[] = a.toArray();
      int n = arr1.length-1;

      while(a.isEmpty()!=true)
        {
            Object m = arr1[n];
            a.remove(m);
            System.out.println(a);
            --n;
        }
      
      
      
    }
}