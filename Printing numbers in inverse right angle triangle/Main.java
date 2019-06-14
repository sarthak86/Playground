import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=n;
      for(int row=n;row>=1;row--){
        for(int col=1;col<=row;col++){
        	System.out.print(num);
          num--;
      	}  
        num=row-1;
        System.out.println();
      }
	}
}