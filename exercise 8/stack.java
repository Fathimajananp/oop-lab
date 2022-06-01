// Program to remove an object from the Stack when the position is passed as parameter 

import java.util.*;
public class stack{

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Stack<String> stack = new Stack<String>();  ////delcaring a stack
		System.out.println("Enter the number of elements to the stack :"); 
		int n=in.nextInt();
		System.out.println("push the elements to the stack :");   //add elements to the list
		for(int i=0;i<n;i++){
			String str=in.next();
			stack.push(str);
		}
		System.out.println("Display the stack:" +stack);
		System.out.println("Enter the position to be removed :");
		int r=in.nextInt();
		stack.removeElementAt(r);
		System.out.println("Element removed from the position "+r+": ");
		

		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());

		}
	} 
}





/*  OUTPUT

Enter the number of elements to the stack :
5
push the elements to the stack :
java
dbms
c
android
python
Display the stack:[java, dbms, c, android, python]
Enter the position to be removed :
3
Element removed from the position 3: 
java
dbms
c
python


*/
