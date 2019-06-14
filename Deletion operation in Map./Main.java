import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      TreeMap<String,String> map =  new TreeMap<String,String>();
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the number of values to be inserted in map:");
      int s=Integer.parseInt(b.readLine());
      System.out.println(s);
      int i=0;
      while(i<s){
       String key=b.readLine();
       String value=(b.readLine());
        map.put(key,value);
       i++;
      }
      System.out.println(map);
      
      System.out.print("Enter the index to be removed:");
      String ss=(b.readLine());
      System.out.println(ss);
      map.remove(ss);
      System.out.println(map);
      System.out.print("Enter the index to insert:");
      String key=b.readLine();
      System.out.println(key);
      System.out.print("Enter the value to be inserted:");
      String value=b.readLine();
      System.out.println(value);
      map.put(key,value);
      System.out.println(map);
      
    }
}