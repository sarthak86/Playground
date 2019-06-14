import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int arr[]=new int[26];
      int i=0;
      for(i=0;i<26;i++)
        arr[i]=0;
      int offset=0;
	  for(i=0;i<s.length();i++){
          if(s.charAt(i)>='a' && s.charAt(i)<='z')
          {
          	offset=s.charAt(i)-'a';
            arr[offset]++;
          }
        if(s.charAt(i)>='A' && s.charAt(i)<='Z')
          {
          	offset=s.charAt(i)-'A';
            arr[offset]++;
          }
      }      
      for(i=0;i<26;i++)
      {
        
      	if(arr[i]==0)
        {
          char z=(char)('a'+i);
        	System.out.print(z+" ");
        }
      }
    }
}