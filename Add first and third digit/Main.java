import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int a=(num1%100)%10;
      int b=num1/100;
      System.out.println(a+b);
	}
}