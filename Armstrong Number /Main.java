import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;
      int s=0;
      for(int i=1;i<=3;i++)
      {
        s=s+(n1%10)*(n1%10)*(n1%10);
        n1=n1/10;
        
      }
      if(n==s)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}