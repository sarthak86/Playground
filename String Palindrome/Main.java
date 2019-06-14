import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      String s=sc.next();
      StringBuilder ss=new StringBuilder(s);
      StringBuilder sss=new StringBuilder("");
      boolean is_palindrome=true;
      for(int i=ss.length()-1;i>=0;i--){
        sss.append(ss.charAt(i));
      }
      for(int i=0;i<s.length();i++){
      	if(ss.charAt(i)!=sss.charAt(i)){
        	is_palindrome=false;
          break;
        }
      }
      if(is_palindrome)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}