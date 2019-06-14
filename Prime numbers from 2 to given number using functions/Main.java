import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<=n;i++)
      {
        prime(i);
      }
	}
  public static void prime(int n){
    int flag=0;
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0){
        flag=1;
        break;
      }
    }
    if(flag==0)
    	System.out.println(n);
  }
}