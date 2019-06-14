import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=s.split(" ");
    for(int i=0;i<arr.length;i++)	
		{
			if(arr[i]!="")
			{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i].equals(arr[j]))
			{
					arr[j]="";
				}
			}
			}
		}
		for(int k=0;k<arr.length;k++)		
		{
			if(arr[k]!="")
			{
				System.out.print(arr[k]+" ");
			}
			
	     }
  }
}