import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int median=n/2+1;
      int ss=n-2;
      for(int row=1;row<median;row++)
      {
        for(int space=1;space<=row-1;space++)
          System.out.print(" ");
        System.out.print("*");
        for(int space1=1;space1<=ss;space1++)
        {
            System.out.print(" ");
            
        }ss=ss-2;
          System.out.println("*");    
      }
      for(int space1=1;space1<median;space1++)
        {
            System.out.print(" ");
        }
      System.out.println("*");
      int cc=median-2;
      ss=1;
      for(int row=1;row<median;row++)
      {
        for(int space1=1;space1<=cc;space1++)
        {
            System.out.print(" ");
        }cc=cc-1;
        System.out.print("*");
        for(int space=1;space<=ss;space++)
          System.out.print(" ");
        ss=ss+2;
        System.out.println("*");    
      }
 	}
}


