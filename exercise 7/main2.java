/* Find the average of N positive integers, raising a user defined exception for each negative input.*/


import java.util.*;

class myException extends Exception
{
    public myException(String s)
    {
        super(s);
    }
}

class main2
{
       public static void main(String ar[])
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of limit:");
        int n=in.nextInt();
       
        int a,b=0,total=0;
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++)
        {
            a=in.nextInt();
            try
            {
                if(a>=0)
                {
                    b++;
                    total=total+a;
                }
                else
                {
                    throw new myException("Negative numbers are not allowed");
                }
            }
            catch(myException ex)
               {
                    System.out.print(ex.getMessage()+"\n");
               }
            if(a<0)
            {
                i--;
            }
        }
           
        System.out.println("Average of "+ n + " positive number:" + (double)total/b);
    }
}


/* OUTPUT

Enter the number of limit:
3
Enter numbers:
2
-3
Negative numbers are not allowed
5
7
Average of 3 positive number:4.666666666666667

*/
