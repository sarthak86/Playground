import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      square(n);
	} 
  public static void square(int n){
    System.out.print(n*n);
  }
}