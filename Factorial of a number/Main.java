import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int ss=1;
      for(int i=1;i<=n;i++)
      {
        ss=ss*i;
      }
      System.out.println(ss);
	}
}