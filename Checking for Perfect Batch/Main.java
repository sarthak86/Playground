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
    int sum[]=new int[n/3];
   int count= perfect_batch(list,sum,n);
    
    if(count==sum.length-1)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
	public static int perfect_batch(int list[],int sum[],int n){ 
      int k=0,m;
    for(int i=0;i<(n/3);i++)
    {
      	m=i*3;
    	sum[i]=list[m]+list[m+1]+list[m+2];
    }
    int count=0;
    int ss=sum[0];
    for(int i=1;i<sum.length;i++){
    	if(sum[i]==ss)
          count++;
        else{
        	count=0;
          break;
        }
    }
      return count;
    }  
}
