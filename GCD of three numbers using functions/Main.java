import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int s=gcd(n1,n2);
      int ss=gcd(s,n3);
      System.out.print(ss);
	}
  public static int gcd(int n,int m){
    int ss;
    if(n>m)
      ss=m;
    else
      ss=n;
    int mm=0;
    for(int i=1;i<=ss;i++){
      if(n%i==0 &&m%i==0)
        mm=i;
    }return mm;
  }
}