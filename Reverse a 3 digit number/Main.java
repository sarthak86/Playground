import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int a1=a%10;a=a/10;
       int a2=a%10;a=a/10;
    System.out.print(a1+""+a2+""+a);
  }
}