import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      pow(n,n1);
	}
  public static void pow(int n,int m){
    int t=1;
    for(int i=1;i<=m;i++)
    {
      t=t*n;
    }
    System.out.print(t);
  }
}