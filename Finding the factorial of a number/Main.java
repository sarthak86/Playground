import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int s=factorial(n);
    System.out.print(s);
  }
  public static int factorial(int n){
  	if(n==0 || n==1)
      return 1;
    else
      return n*factorial((n-1));
  }
}