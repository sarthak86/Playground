import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=n;
      for(int row=1;row<=n;row++){
        for(int space=1;space<=num-1;space++)
          System.out.print(" ");
        num--;
      	for(int col=1;col<=2*row-1;col++){
        	System.out.print("*");
      	}  
        System.out.println();
      }
	}
}