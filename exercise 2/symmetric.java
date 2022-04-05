/*Read a matrix from the console and check whether it is
symmetric or not.*/



import java.util.Scanner;
public class symmetric
{
    public static void main(String[] args) 
    {
        int m,n,flag=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in matrix:");
        n = s.nextInt();
						//input the elements of matrix
        System.out.println("Enter all the elements of matrix:");
		int a[][] = new int[m] [n];
        for (int i = 0; i < m; i++) 
        {
        for (int j = 0; j < n; j++) 
        {
        a[i][j] = s.nextInt();
        }
        }

		//checking the matrix is stmmetric or not	
     	if(m != n)
     	{
		System.out.println("The given matrix is not a square matrix and this is not a symmetric matrix");
		}
		else
		{
       	for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
        if(a[i][j] != a[j][i])
        {
        flag=1;
 		} 
      	}
		}
 
		if(flag==0)
		{
		System.out.println("The given matrix is symmetric");                	
		}
		else
		{
		System.out.println("The given matrix is not symmetric");
		}
 		}
         
	}
}



/*  output


Enter number of rows in first matrix:2
Enter number of columns in first matrix:3
Enter all the elements of matrix:
2 3 4
3 4 5
The given matrix is not a square matrix and this is not a symmetric matrix


Enter number of rows in matrix:3
Enter number of columns in matrix:3
Enter all the elements of matrix:
1 2 3
2 4 5
3 5 6
The given matrix is symmetric



Enter number of rows in matrix:2 
Enter number of columns in matrix:2
Enter all the elements of matrix:
2 3 
4 5
The given matrix is not symmetric

*/
