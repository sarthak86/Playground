import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int arr_size=sc.nextInt();
    int arr[]=new int[arr_size];
    int i=0;
    for(i=0;i<arr_size;i++)
      arr[i]=sc.nextInt();
    int num[]=new int[10];
    for(i=0;i<arr_size;i++){
    	num[arr[i]]++;
    }
    int max_count=num[0];
      for(i=1;i<arr_size;i++){
      	if(max_count<num[i])
        { max_count=num[i];
          
        }
      }
    if(max_count!=1)
      System.out.print(max_count);
    else
      System.out.print(arr[0]);
  }
}