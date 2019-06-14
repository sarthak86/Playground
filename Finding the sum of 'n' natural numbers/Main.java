import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=summ(n);
      System.out.print(s);
    }
  public static int summ(int n){
  	if(n==0)
      return 0;
    else
      return n+summ(n-1);
  }
}