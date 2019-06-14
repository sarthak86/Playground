import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1=sc.nextLine();
    StringBuffer ss=new StringBuffer("");
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      int flag=0;
    	for(int j=0;j<s1.length();j++){
    		if(ch==s1.charAt(j)){
            	flag=1;
              break;
            }
    	}
      if(flag!=1)
        ss.append(ch);
    }
    System.out.print(ss);
  }
}