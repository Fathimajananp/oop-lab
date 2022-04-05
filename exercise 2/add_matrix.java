/*Read 2 matrices from the console and perform matrix
addition.*/


import java.util.Scanner;
public class add_matrix
{
    public static void main(String[] args) 
    {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        n = s.nextInt();
        if (p == m && q == n) 
        {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
						//input the elements of first matrix
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
					//input the elements of second matrix
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }
            	//matrix addition
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
				//	Matrix after addition
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }

			// the 2 matrix have different order
        else
        {
            System.out.println("Addition would not be possible");
        }
    }
}




/* output 1


Enter number of rows in first matrix:3
Enter number of columns in first matrix:3
Enter number of rows in second matrix:3
Enter number of columns in second matrix:3
Enter all the elements of first matrix:
1 2 3
4 5 6
7 8 9
Enter all the elements of second matrix:
9 8 7
6 5 4
3 2 1
Matrix after addition:
10 10 10 
10 10 10 
10 10 10 


output 2

Enter number of rows in first matrix:3
Enter number of columns in first matrix:2
Enter number of rows in second matrix:5
Enter number of columns in second matrix:4
Addition would not be possible

*/
