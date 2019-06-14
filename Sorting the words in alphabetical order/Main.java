import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String arr[]=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.next();
      arr[i].toLowerCase();
    }
    String min=arr[0];
    String temp;
   
    
    for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i].compareTo(arr[j])>0) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    
    for(int i=0;i<n;i++)
      System.out.println(arr[i].toLowerCase());
  }
}