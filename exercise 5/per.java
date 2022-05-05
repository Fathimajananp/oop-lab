/* Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.*/


import java.util.*;
class person    //super class
{
	
	String name;
	String gender;
	String address;
	int age;
		//constructor of person to initialize the values
	person(String na,String g,String addr,int a)
	{
		name=na;	
		gender=g;
		address=addr;
		age=a;
	}
}

class employee extends person           //sub class
{
	int empid;
	String company_name,qualification;
	float salary;
		//constructor of emplpyee to initialize the values
	employee(String na,String g,String addr,int a,int id,String company,String quali,float sal)
	{
		super(na,g,addr,a);
		empid=id;
		company_name=company;
		qualification=quali;
		
		salary=sal;
	}
}

class teacher extends employee           //sub class
{
	int teacherid;
	String subject,department;
	
	
		//constructor of emplpyee to initialize the values
	teacher(String na,String g,String addr,int a,int id,String company,String quali,float sal,int tid,String sub,String dept)
	{
		super(na,g,addr,a,id,company,quali,sal);
		
		teacherid=tid;
		subject=sub;
		department=dept;
	}

void display(int i)   //method to display teacher information
{
	System.out.println("---------------TEACHER INFORMATION----------------");
	System.out.println("Person name  :"+name);
	System.out.println("Gender:"+gender);
	System.out.println("Address :"+address);
	System.out.println("Age :"+age);
	System.out.println(" Employeeid :"+empid);
	System.out.println("company name :"+company_name);
	System.out.println(" Qualification :"+qualification);
	System.out.println(" Salary :"+salary);
	System.out.println(" Teacherid :"+teacherid);
	System.out.println(" Subject :"+subject);
	System.out.println(" Department :"+department);
	

}
}
class per
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
		System.out.println("Enter person name :");
		String na = in.next();
		System.out.println("Enter gender :");
		String g = in.next();
		System.out.println("Enter address :");
		String addr = in.next();
		System.out.println("Enter age :");
		int a = in.nextInt();
		System.out.println("Enter employeeid :");
		int id = in.nextInt();
		System.out.println("Enter company name :");
		String company = in.next();
		System.out.println("Enter qualification :");
		String quali = in.next();
		System.out.println("Enter salary :");
		Float sal = in.nextFloat();
		System.out.println("Enter teacherid :");
		int tid = in.nextInt();
		System.out.println("Enter subject :");
		String sub = in.next();
		System.out.println("Enter department :");
		String dept = in.next();
		
		
		
		obj[i] = new teacher(na,g,addr,a,id,company,quali,sal,tid,sub,dept);
	     }
	for(int i=0;i<n;i++)
	{
		
		obj[i].display(i);     //display the information of teachers
		
	}
  }
}


/*  OUTPUT

Enter the no of teachers :
2
-----------INFORMATION OF TEACHERS ----------- 
Enter person name :
saji
Enter gender :
female
Enter address :
calicut
Enter age :
28
Enter employeeid :
1111
Enter company name :
tata
Enter qualification :
mca
Enter salary :
40000
Enter teacherid :
111
Enter subject :
java
Enter department :
cs
-----------INFORMATION OF TEACHERS ----------- 
Enter person name :
shaji
Enter gender :
male
Enter address :
kunnamangalam
Enter age :
30
Enter employeeid :
1112
Enter company name :
tcs
Enter qualification :
mtech
Enter salary :
50000
Enter teacherid :
112
Enter subject :
python
Enter department :
bca

---------------TEACHER INFORMATION----------------
Person name  :saji
Gender:female
Address :calicut
Age :28
 Employeeid :1111
company name :tata
 Qualification :mca
 Salary :40000.0
 Teacherid :111
 Subject :java
 Department :cs

---------------TEACHER INFORMATION----------------
Person name  :shaji
Gender:male
Address :kunnamangalam
Age :30
 Employeeid :1112
company name :tcs
 Qualification :mtech
 Salary :50000.0
 Teacherid :112
 Subject :python
 Department :bca

*/

