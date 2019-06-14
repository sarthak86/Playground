import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc= new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
      int c=1;
      int s=1;
      while(c<=exponent){
        s=s*base;
        c++;
      }
      System.out.print(s);
    }
}
