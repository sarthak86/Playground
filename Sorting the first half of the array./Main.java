import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    	arr[i]=sc.nextInt();
    }
    int a=n/2,temp;
    for(int i=0;i<(a-1);i++){
      for(int j=i;j<a;j++)
    	if(arr[i]>arr[j])
        {
        	temp=arr[i];arr[i]=arr[j];arr[j]=temp;
        }
    }
    for(int i=0;i<n;i++){
    	System.out.print(arr[i]+" ");
    }
  }
}