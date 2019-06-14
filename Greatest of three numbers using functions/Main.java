import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int s=max(n1,n2);
      int ss=max(s,n3);
      System.out.print(ss);
	}
  public static int max(int n,int m){
    if(n>m)
      return n;
    else
      return m;
  }
}