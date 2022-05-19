// Prepare bill with the given format using calculate method from interface.




import java.util.* ;

interface BillGen{
	int calculate( ) ;
}
class ProductB implements BillGen {
	String name ;
	int prodid , quantity , unitprice , total ;
	ProductB ( ){}
	ProductB( String n , int p , int q , int u){
		name = n ; 
		prodid = p ;
		quantity = q ;
		unitprice = u ;
	}
	public int calculate ( ) {
		total = quantity * unitprice ;
		return total ;
	}
}
public class bill {
	public static void main ( String [ ] args ) {
		ProductB[][] order ;
		System.out.println ("\n\nEnter no. of orders : " ) ;
		Scanner in = new Scanner ( System.in ) ;
		int n = in.nextInt ( ) ;
		order = new ProductB[n][] ;
		for ( int i = 0 ; i < n ; i++){
			System.out.print("\nEnter no. of Products : " ) ;
			int m = in.nextInt();
			order[i] = new ProductB[m] ;
			for (int j = 0 ; j < m; j++ ){
				System.out.print ("\nEnter Product " + (j+1) + " Name : " ) ;
				String a = in.next() ;
				System.out.print("Enter Product ID: " ) ;
				int b = in.nextInt() ;
				System.out.print ("Enter Product Quantity : " ) ;
				int c = in. nextInt() ;
				System.out.print("Enter Product Unit Price : " ) ;
				int d = in.nextInt() ;
				ProductB pb = new ProductB ( a , b , c , d ) ;   //constructor for product details
				order[i][j] = pb ;
				order[i][j].total = order[i][j].calculate( ) ;//method for calculating sum
			}
		}
		for(int i = 0 ; i < n ; i++){
			int sum = 0 ;
			System.out.println("\n\nOrder No : " + ( i +1) ) ;
			Date date=java.util.Calendar.getInstance() . getTime ( ) ; //for getting date and time
			System.out.println( date ) ;
			System.out.println("__________________________________________________________________________________________");
			System.out.printf ("%5s %20s %25s %10s %10s " ,"ProdId " ,"Name" , "Quantity " , " Unit Price " ," Total " ) ;
			System.out.println ( ) ;
			System.out.println("__________________________________________________________________________________________");
			for( int j =0; j<order[i].length ; j++){
				System.out.printf ("%5s %20s %25s %10s%10s " ,order[i][j].prodid ,order[i][j] . name ,	order[i][j] . quantity ,
				order[i][j].unitprice ,order[i][j].total) ;
				System.out.println( ) ;
			}
			System.out.println("___________________________________________________________________________________________");
			for ( int k=0; k<order[i].length ; k++)
				sum = sum + order[i][k].total ;
			System.out.println (" Net Amount : " + sum) ;
			System.out.println("___________________________________________________________________________________________");
			}
		}
}



/*  OUTPUT

Enter no. of orders : 
2

Enter no. of Products : 2

Enter Product 1 Name : pen
Enter Product ID: 1
Enter Product Quantity : 5
Enter Product Unit Price : 10

Enter Product 2 Name : pencil
Enter Product ID: 2
Enter Product Quantity : 5
Enter Product Unit Price : 5 

Enter no. of Products : 2

Enter Product 1 Name : bag
Enter Product ID: 3
Enter Product Quantity : 1
Enter Product Unit Price : 700

Enter Product 2 Name : book
Enter Product ID: 4
Enter Product Quantity : 5
Enter Product Unit Price : 50


Order No : 1
Fri May 06 12:18:33 IST 2022
__________________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
__________________________________________________________________________________________
    1                  pen                         5         10        50 
    2               pencil                         5          5        25 
___________________________________________________________________________________________
 Net Amount : 75
___________________________________________________________________________________________


Order No : 2
Fri May 06 12:18:33 IST 2022
__________________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
__________________________________________________________________________________________
    3                  bag                         1        700       700 
    4                 book                         5         50       250 
___________________________________________________________________________________________
 Net Amount : 950
___________________________________________________________________________________________


*/
