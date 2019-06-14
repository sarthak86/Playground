import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=sc.nextInt();
    max_index(list,n);
  }
  public static void max_index(int list[],int n){
  	int max=list[0];
    int k=0;
    for(int i=0;i<n;i++)
    {
      	if(max<list[i])
        {
          max=list[i];
          k=i;
        }
    }
    
	System.out.print(k);
  }
}