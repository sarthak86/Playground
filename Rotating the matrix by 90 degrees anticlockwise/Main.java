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
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<col;j++){
        	mat[i][j]=sc.nextInt();
        }
    }
    for(int i=row-1;i>=0;i--){
    	for(int j=0;j<col;j++)
          System.out.print(mat[j][i]+" ");
      System.out.println();
    }
  }
}