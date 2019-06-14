import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      StringBuilder s1=new StringBuilder(s);
      int arr[]=new int[26];
      for(int i=0;i<26;i++)
        arr[i]=0;
      int offset;
      for(int i=0;i<s1.length();i++){
      	if(s1.charAt(i)>='A' &&s1.charAt(i)<='Z' )
        {
        	offset=s1.charAt(i)-'A';
          char ch = (char)('a' + offset);
          s1.setCharAt(i,ch);
        }
        if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
        {
        	arr[s1.charAt(i)-'a']++;
        }
      }
      for(int i = 0; i < s1.length(); i++)
       {
            if(arr[s1.charAt(i) -'a'] != 0)
            {
                System.out.print(s1.charAt(i) +"" +arr[s1.charAt(i)-'a'] + " ");
                arr[s1.charAt(i) -'a'] = 0;
            }
        }
      
    }
}