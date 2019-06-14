import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr_elements[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr_elements[i]=sc.nextInt();
     int count[]=new int[arr_size];
      int n=0,i=0;
      while(n!=arr_size)
      {
      		while(arr_elements[i]!=0)
            {
            	count[n]+=1;
                i++;
            }
        n+=1;
      }
      int max_count=count[0];
      for(i=1;i<arr_size;i++){
      	if(max_count<count[i])
          max_count=count[i];
      }
      System.out.print(max_count);
    }
}