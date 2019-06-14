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
      int left=0,right=arr_size-1,c=1;
      while(left<right){
      	if(arr[left]!=arr[right]){
        	c=0;
          break;
        }
        left++;
        right--;
      }
      if(c==0)
        System.out.print("No");
      else
        System.out.print("Yes");
    }
}