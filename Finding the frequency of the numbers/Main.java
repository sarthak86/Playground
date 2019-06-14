import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=0;
      int arr[]=new int[n];
      int k=sc.nextInt();
      int arr1[]=new int[k+1];
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=1;i<=k;i++)
        arr1[i]=0;
      for(i=0;i<n;i++){
        arr1[arr[i]]++;
      }
      for(i=1;i<=k;i++)
        System.out.println(i+" "+arr1[i]);
    }
}