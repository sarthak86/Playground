import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int num=1;
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++){
          if(num%2==0){
            System.out.print("#");
            num+=1;
          }
          else
          { System.out.print("*");
           num+=1;
          }
        }
        System.out.println();
            
      }
    }
}