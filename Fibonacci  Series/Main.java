import java.io.*;
class Fibonacci extends Thread
{
  // type your code here
  public void run(){
  	try{
    	int x=0,y=1,z=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the limit for Fibonacci: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        if(n <= 0)
        {
            throw new Exception("Exception");
        }
        else
        {
           System.out.print("The Fibonacci series is :");
        	while(n>0)
            {
                System.out.print(z+" ");
                x=y;
                y=z;
                z=x+y;
                n=n-1;
            }
         }
       }
       catch (Exception e)
          {
               System.out.println("Exception occurred");
          }
    }
  }

public class Main
{
     public static void main(String[] args) 
     {
        // type your code here
       Fibonacci f = new Fibonacci();
       f.start();
     }
}