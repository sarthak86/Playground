import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code hereS
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int arr[]=new int[n];
    int odd_arr[]=new int[n];
    int even_arr[]=new int[n];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int o=0,e=0;
    int j=0;
    for(i=0;i<n;i+=2){
      odd_arr[j]=arr[i];
      j++;
      o++;
    }
    j=0;
    for(i=1;i<n;i+=2){
      even_arr[j]=arr[i];
      j++;
      e++;
    }
    int rot=sc.nextInt();
    //Right Rotate
    int temp;
    for(i=0;i<rot;i++){
      temp=odd_arr[o-1];
    	for(int k=o-1;k>0;k--){
  			odd_arr[k]=odd_arr[k-1];      
        }    
      odd_arr[0]=temp;
    }
    for(i=0;i<rot;i++){
      temp=even_arr[0];
    	for(int k=0;k<e;k++){
  			even_arr[k]=even_arr[k+1];      
        }    
      even_arr[e-1]=temp;
    }
   
  int m=0,nn=0;
  for(i=0;i<n;i+=1)
  {
    if(i%2==0){
      arr[i]=odd_arr[m];
      m++;
    }
    else{
    	arr[i]=even_arr[nn];
      nn++;
    }
  }
     for(i=0;i<n;i++){
      System.out.print(arr[i]+" ");
  	}
  }}
