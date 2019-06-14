import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int af=0,bf=0;
      for(int i=0;i<n;i++){
        if(arr[i]==a)
        {
          af=i;
          break;
        }
    }
      for(int i=0;i<n;i++){
        if(arr[i]==b)
        {
          bf=i;
          break;
        }
    }
      if(af!=0)
        System.out.println(af);
      else
        System.out.println("-1");
      if(bf!=0)
        System.out.println(bf);
      else
        System.out.println("-1");
}}