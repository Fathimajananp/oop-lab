/* Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the properties of class employee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display function to display all the data members. Use array of objects to display details of N teachers.*/
 
import java.util.*;
class employee    //super class
{
	int empid;
	String name;
	float salary;
	String address;
		//constructor of employee to initialize the values
	 void employee(int emp,String n,float sal,String addr)
	{
		empid=emp;	
		name=n;
		salary=sal;
		address=addr;
	}
}

class teacher extends employee           //sub class
{
	String department;
	String subject;
		//constructor of teacher to initialize the values
	teacher(int emp,String n,float sal,String addr,String dept,String sub)
	{
		empid=emp;
		name=n;
		salary=sal;
		address=addr;
		department=dept;
		subject=sub;
	}

void display(int i)   //method to display teacher information
{
	System.out.println("Employee id :"+empid);
	System.out.println("Employee name :"+name);
	System.out.println("Employee salary :"+salary);
	System.out.println("Employee address :"+address);
	System.out.println(" department :"+department);
	System.out.println(" subject :"+subject);

}
}
class emp
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of teachers :");
		int n = in.nextInt();
		teacher obj[] = new teacher[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("-----------INFORMATION OF TEACHERS ----------- ");
		System.out.println("Enter employee id :");
		int id = in.nextInt();
		System.out.println("Enter employee name :");
		String name = in.next();
		System.out.println("Enter employee salary :");
		float sal = in.nextFloat();
		System.out.println("Enter employee address :");
		String add = in.next();
		System.out.println("Enter department :");
		String dept = in.next();
		System.out.println("Enter subject :");
		String sub = in.next();
		obj[i] = new teacher(id,name,sal,add,dept,sub);
	     }
	for(int i=0;i<n;i++)
	{
		System.out.println("-----------INFORMATION OF TEACHERS ----------- ");
		obj[i].display(i);     //display the information of teachers
		
	}
  }
}

/* OUTPUT

Enter the no of teachers :
2
-----------INFORMATION OF TEACHERS ----------- 
Enter employee id :
111
Enter employee name :
Ranjini
Enter employee salary :
35000
Enter employee address :
calicut
Enter department :
commerce
Enter subject :
accounting
-----------INFORMATION OF TEACHERS ----------- 
Enter employee id :
112
Enter employee name :
Ramesh
Enter employee salary :
40000
Enter employee address :
kunnamangalam
Enter department :
cs
Enter subject :
java
Employee id :111
Employee name :Ranjini
Employee salary :35000.0
Employee address :calicut
 department :commerce
 subject :accounting
-----------INFORMATION OF TEACHERS ----------- 
Employee id :112
Employee name :Ramesh
Employee salary :40000.0
Employee address :kunnamangalam
 department :cs
 subject :java

*/
