import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int nz=0,z=0,j=0;
      int nzero[]=new int[n];
      for(int i=0;i<n;i++)
      {
      	arr[i]=sc.nextInt();
        if(arr[i]==0){
        	z++;
        }
        else{
        	nzero[j]=arr[i];
          j++;
          nz++;
        }
      }
      for(int i=nz+1;i<n;i++)
        nzero[i]=0;
      for(int i=0;i<n;i++){
      	System.out.print(nzero[i]+" ");
      }
    }
}