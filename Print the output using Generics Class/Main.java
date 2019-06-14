import java.util.*;
public class Main<T> 
{ 
  // type your code here
  T t;
  public void insert(T t){
  	this.t=t;
  }
   public T get() 
   {
     return t;
   }
  public static void main(String[] args) 
     { 
       // type your code here
       Scanner sc = new Scanner(System.in);
       Main<Integer> a = new Main<Integer>();
       int num = sc.nextInt();
       a.insert(num);
       Main<String> b = new Main<String>();
       String str = sc.next();
       b.insert(str);
       Main<Float> flo = new Main<Float>();
       float flo1 = sc.nextFloat();
       flo.insert(flo1);
       
         System.out.println("Integer Value: " + a.get());
         System.out.println("String Value: " + b.get());
         System.out.println("Float value: " + flo.get());
       }
 }