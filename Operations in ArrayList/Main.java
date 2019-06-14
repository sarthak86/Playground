import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
      ArrayList list = new ArrayList();
      int i=Integer.parseInt(b.readLine());
      while(i!=4){
      	switch(i){
          case 1:
            String list1=b.readLine();
      		String word[]=list1.split(",");
      		for(int j=0;j<word.length;j++)
      		{
          		list.add(word[j]);
      		}
            System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
      		i=Integer.parseInt(b.readLine());
            break;
          case 2:
            System.out.print("Enter the index value to be deleted:");
            int value=Integer.parseInt(b.readLine());
            System.out.println(value);
            list.remove(value);
            System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
      		i=Integer.parseInt(b.readLine());
            break;
          case 3:
            System.out.println(list);
            System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
      		i=Integer.parseInt(b.readLine());
            break; 
          
        }      
      }
    }
}



