import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      
      if((c>=97 && c<=99)|| (c>=65 && c<=67))
        System.out.print((char)(c+23));
      else
        System.out.print((char)(c-2));
    }
}