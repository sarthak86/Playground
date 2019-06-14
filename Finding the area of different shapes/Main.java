import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch(n){
        case 1:
          int side=sc.nextInt();
          System.out.print(side*side);
          break;
        case 2:
          int length=sc.nextInt();
          int breadth=sc.nextInt();
          System.out.print(length*breadth);
          break;
        case 3:
          int base=sc.nextInt();
          int height=sc.nextInt();
          System.out.print(.5*base*height);
          break;
        case 4:
          int radius=sc.nextInt();
          System.out.print(3.14*radius*radius);
          break;
      }
    }
}
