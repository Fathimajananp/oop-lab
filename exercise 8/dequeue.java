// Program to demonstrate the addition and deletion of elements in dequeue

import java.util.*;
public class dequeue{
	public static void main(String[] args) {
	//Creating Deque and adding elements
		Scanner in=new Scanner(System.in);
		Deque<String> deque = new ArrayDeque<String>();
		System.out.println("Enter the number of elements to the queue :"); 
		int n=in.nextInt();
		System.out.println("enqueue the elements to the queue :");   //add elements to the list
		for(int i=0;i<n;i++){
			String str=in.next();
			deque.add(str);
		}
		System.out.println("iterating the queue elements:");

		Iterator<String> itr=deque.iterator();      //iterating objects for iterating elements
		while(itr.hasNext()){

			System.out.println(itr.next());

		}


		   //delete elements in the list
		
		deque.poll();
		System.out.println("After deleting the first element in the queue :"); 

		Iterator<String> itr1=deque.iterator();
		while(itr1.hasNext()){

			System.out.println(itr1.next());
			}
	} 
}




/*  OUTPUT

Enter the number of elements to the queue :
5
enqueue the elements to the queue :
html
java
dbms
android
python
iterating the queue elements:
html
java
dbms
android
python
After deleting the first element in the queue :
java
dbms
android
python


*/
