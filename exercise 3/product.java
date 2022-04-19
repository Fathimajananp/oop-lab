/* Define a class ‘product’ with data members pcode, pname and price.
Create 3 objects of the class and find the product having the lowest
price.*/


import java.util.*;
class product
{
	int pcode;
	String pname;
	double price;
 
	void dis(int a,String b,double c)
	{
	pcode=a;	
	pname=b;
	price=c;

	}

	public static void main(String args[])
	{
	Scanner in =new Scanner(System.in);
	int a1,a2,a3;
	String b1,b2,b3;
	double c1,c2,c3;
	product obj1=new product();
	product obj2=new product();
	product obj3=new product();
	
	System.out.print("Enter product 1 pcode,pname,price :");
	a1=in.nextInt();
	b1=in.next();
	c1=in.nextDouble();
	obj1.dis(a1,b1,c1);
	
	System.out.print("Enter product 2 pcode,pname,price :");
	a2=in.nextInt();
	b2=in.next();
	c2=in.nextDouble();
	obj2.dis(a2,b2,c2);
	
	System.out.print("Enter product 3 pcode,pname,price :");
	a3=in.nextInt();
	b3=in.next();
	c3=in.nextDouble();
	obj3.dis(a3,b3,c3);
	
	System.out.print("\n Lowest price product is ");
	

	if(obj1.price<obj2.price && obj1.price<obj3.price)

	System.out.println("\n Product code = " +obj1.pcode +"\nProduct name="+obj1.pname +"\n 	Price="+obj1.price);

	if(obj2.price<obj1.price && obj2.price<obj3.price)

	System.out.println("\n Product code =" +obj2.pcode +"\nProduct name="+obj2.pname +"\n Price="+obj2.price);

	if(obj3.price<obj1.price && obj3.price<obj2.price)

	System.out.println("\n Product code=" +obj3.pcode +"\n Product name="+obj3.pname +"\n Price="+obj3.price);
	}
}



/*output  


Enter product 1 pcode,pname,price :0101 mobile 15000
Enter product 2 pcode,pname,price :0102 lap 50000
Enter product 3 pcode,pname,price :0103 printer 20000

 Lowest price product is 
 Product code = 101
Product name=mobile
 	Price=15000.0


*/
