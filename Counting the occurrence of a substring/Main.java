import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
      int count=0;
      String sss="";
      for (int i=0;i<(s.length()-s1.length()+1);i++)
    {
      boolean is_matching = true;
      for(int j=0;j<s1.length();j++)
      {
        if(s.charAt(i + j)!=s1.charAt(j))
        {
          is_matching = false;
        }
      }
      if(is_matching == true)
      {
        count++;
      }
    }
    
      System.out.print(count);
    } 
}