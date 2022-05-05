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
	person(String n,String g,String addr,int a)
	{
		name=n;	
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
	employee(String n,String g,String addr,int a,int id,String company,String quali,float sal)
	{
		super(n,g,addr,a);
		empid=id;
		company_name=company;
		qualification=quali;
		
		salary=sal;
	}
}

class teacher extends employee           //sub class
{
	
	String subject,department;
	int teacherid;
	
		//constructor of emplpyee to initialize the values
	teacher(String n,String g,String addr,int a,int id,String company,String quali,float sal,int tid,String sub,String dept)
	{
		super(n,g,addr,a,id,company,quali,sal);
		
		teacherid=tid;
		subject=sub;
		department=dept;
	}
}
void display(int i)   //method to display teacher information
{
	System.out.println("Person name  :"+name);
	System.out.println("Gender:"+gender);
	System.out.println("Address :"+address);
	System.out.println("Age :"+age);
	System.out.println("company name :"+company_name);
	System.out.println(" Qualification :"+qualification);
	System.out.println(" Salary :"+salary);
	System.out.println(" Subject :"+subject);
	System.out.println(" Department :"+department);
	System.out.println(" Teacherid :"+teacherid);

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
		String n = in.next();
		System.out.println("Enter gender :");
		String g = in.next();
		System.out.println("Enter address :");
		String addr = in.next();
		System.out.println("Enter age :");
		int a = in.nextInt();
		System.out.println("Enter company name :");
		String company = in.next();
		System.out.println("Enter qualification :");
		String quali = in.next();
		System.out.println("Enter salary :");
		Float sal = in.nextFloat();
		System.out.println("Enter subject :");
		String sub = in.next();
		System.out.println("Enter department :");
		String dept = in.next();
		System.out.println("Enter teacherid :");
		int tid = in.nextInt();
		
		
		
		obj[i] = new teacher(n,g,addr,a,id,company,quali,sal,sub,dept,tid);
	     }
	for(int i=0;i<n;i++)
	{
		System.out.println("-----------INFORMATION OF TEACHERS ----------- ");
		obj[i].display(i);     //display the information of teachers
		
	}
  }
}

