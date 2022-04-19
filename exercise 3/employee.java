//Program to create a class for Employee having attributes eNo,eName,eSalary.Read n employ information and search for an employee given eNo,using the concept of Arrat of Objects

import java.util.Scanner;
class employee 
{
    int eNo;
    String eName;
    double eSalary;

    void GetData() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Employee No : ");
        eNo = in.nextInt();
        System.out.print("Enter the Employee Name : ");
        eName = in.next();
        System.out.print("Enter the Employee salary : ");
        eSalary = in.nextDouble();
    }

    void PutData() 
    {
        System.out.println("Employee Number is : " + eNo);
        System.out.println("Employee Name is : " + eName);
        System.out.println("Employee Salary is : " + eSalary);
        System.exit(0);
    }

    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int i,n,s;
        System.out.print("\nEnter the Number of Employees ");
        n = in.nextInt();
        employee[] arr = new employee[n];
        for (i = 0; i < n; i++) 
        {
            arr[i] = new employee();
        }

        for (i = 0; i < n; i++) 
        {
            System.out.println("\nEnter the Detais of Employee ");
            arr[i].GetData();
        }


        System.out.print("\nEnter the Employee Number to Search : ");
        s = in.nextInt();

        for (i = 0; i < n; i++)
        {
            if (arr[i].eNo == s) 
            {
                System.out.print("The Employee Found...!");
                System.out.println("\nDetails of the Employee is :");
                arr[i].PutData();
            }
        }
        System.out.println("\nEmployee not found...");

    }

}




/*  OUTPUT

Enter the Number of Employees 3

Enter the Detais of Employee 
Enter the Employee No : 1
Enter the Employee Name : sanam
Enter the Employee salary : 1500

Enter the Detais of Employee 
Enter the Employee No : 2
Enter the Employee Name : jan
Enter the Employee salary : 5000 

Enter the Detais of Employee 
Enter the Employee No : 3
Enter the Employee Name : emir
Enter the Employee salary : 3000

Enter the Employee Number to Search : 2
The Employee Found...!
Details of the Employee is :
Employee Number is : 2
Employee Name is : jan
Employee Salary is : 5000.0




Enter the Number of Employees 2

Enter the Detais of Employee 
Enter the Employee No : 1
Enter the Employee Name : jan
Enter the Employee salary : 2000

Enter the Detais of Employee 
Enter the Employee No : 2
Enter the Employee Name : sana
Enter the Employee salary : 3000

Enter the Employee Number to Search : 3

Employee not found...

*/
