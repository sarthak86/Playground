import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt(),b=a%10,c;
      while(a>9){
        a=a/10;
      }
      c=a;
      System.out.println(c+b);
	}
}