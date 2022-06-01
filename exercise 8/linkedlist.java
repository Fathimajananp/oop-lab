//  Program to remove all the elements from a linked list 


import java.util.*;
class linkedlist{

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		LinkedList<String> ll=new LinkedList<String>();  //delcaring an linked list
		System.out.println("Enter the limit :");   //limit of the linked list
		int n=in.nextInt();
		System.out.println("Enter the elements in the linked list :");   //add elements to the list
		for(int i=0;i<n;i++){
			String str=in.next();
			ll.add(str);
		}
		System.out.println("Elements in the linked list :");  //display the elements
		System.out.println(ll);
		System.out.println("\nAll items are removed from the linked list");  //remove all elements
		ll.clear();
		System.out.println("\nNow the list is empty " +ll); //display after removing elements
	}
}



/*  OUTPUT

Enter the limit :
5
Enter the elements in the linked list :
java
python
dbms
c
ds
Elements in the linked list :
[java, python, dbms, c, ds]

All items are removed from the linked list

Now the list is empty []

*/



