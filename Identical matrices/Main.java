import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int mat[][]=new int[row][col];
    int mat1[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<col;j++){
        	mat[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<col;j++){
        	mat1[i][j]=sc.nextInt();
        }
    }
    int flag=0;
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++)
        {
        	if(mat[i][j]!=mat1[i][j]){
              flag=1;
              break;
            }
        }
      
    }
    if(flag==1)
      System.out.print("No");
    else
      System.out.print("Yes");
  }
}