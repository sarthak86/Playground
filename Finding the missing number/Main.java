import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      int i=0;
      for(i=0;i<arr_size;i++)
      {
      	arr[i]=sc.nextInt();
      }
      int mis_arr[]=new int[arr_size+1];
      for(i=1;i<=arr_size;i++)
        mis_arr[i]=0;
      for(i=0;i<arr_size;i++)
      {
        mis_arr[arr[i]]++;
      }
      for(i=1;i<=arr_size;i++){
        if(mis_arr[i]==0)
        	System.out.print(i);
      }
    }
  
}