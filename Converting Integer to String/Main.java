import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    StringBuilder s=new StringBuilder("");
    if(n<0){
      s.append("-");
      n=n*-1;
    }
    int temp=n,count=0;
    while(n!=0){
      count++;
      n/=10;
    }
    StringBuilder s1=new StringBuilder(s);
    StringBuilder ss=new StringBuilder("");
    for(int i=0;i<count;i++){
    	char ch=(char)((temp%10)+'0');
      ss.append(ch);
      temp/=10;
    }
    
    s1.append(ss.reverse());
    System.out.print(s1);
    
  }
}