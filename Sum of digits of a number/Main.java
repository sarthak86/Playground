import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int sum=0,n=sc.nextInt();
      while(n!=0)
      {
        sum+=n%10;
        n=n/10;
      }
      System.out.println(sum);
	}
}