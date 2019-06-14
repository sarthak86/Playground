import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int z,n1=1,n2=n,s=0;
      for(int i=1;i<4;i++)
      {
        z=n2%10;
        n2/=10;
        for(int j=1;j<=z;j++)
        {
          n1=n1*j;
        }
        s+=n1;
        n1=1;
      }
      if(s==n)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}