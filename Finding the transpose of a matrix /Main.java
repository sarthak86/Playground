import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int row_size=sc.nextInt();
    int col_size=sc.nextInt();
    int matrix1[][]=new int[row_size][col_size];
    int matrix2[][]=new int[col_size][row_size];
    for(int i=0;i<row_size;i++){
    	for(int j=0;j<row_size;j++){
    		matrix1[i][j]=sc.nextInt();
    	}
    }
    for(int i=0;i<row_size;i++){
    	for(int j=0;j<row_size;j++){
    		matrix2[i][j]=matrix1[j][i];
    	}
    }
    
     for(int i=0;i<row_size;i++){
    	for(int j=0;j<row_size;j++){
    		System.out.print(matrix2[i][j]+" ");
    	}
       System.out.println();
    }
  }
}