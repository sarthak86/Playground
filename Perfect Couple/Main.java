import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int s=sc.nextInt();
      for(int i=0;i<(n-1);i++){
      	for(int j=i+1;j<n;j++){
        	if(a[i]+a[j]==s)
              System.out.println(a[i]+", "+a[j]);
        }
      }
    }
}