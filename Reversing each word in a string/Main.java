import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder sb=new StringBuilder("");
    StringBuilder current=new StringBuilder("");
    int j=0;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)!=' ' ){
        	current.append(s.charAt(i));
        }
      	if(s.charAt(i)==' ' || i==s.length()-1) 
        {
          current=current.reverse();
          sb.append(current);
          sb.append(" ");
          current.setLength(0);
      
    }
    }
    System.out.print(sb);
  }
}