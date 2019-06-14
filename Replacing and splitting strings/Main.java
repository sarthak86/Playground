import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int parts=sc.nextInt();
      String c[]=s2.split(" ",parts);
      for(String a:c){
      	System.out.println(a);
      }
    }
}