import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      while(a>99){
        a=a/10;
      }
    
      System.out.println(a%10);
	}
}