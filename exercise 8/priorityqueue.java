// Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.*;

public class priorityqueue{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		PriorityQueue<String> queue=new PriorityQueue<String>();
		System.out.println("Enter the number of elements to the Queue :"); 
		int n=in.nextInt();
		System.out.println("enqueue the elements to the queue :");   //add elements to the list
		for(int i=0;i<n;i++){
			String str=in.next();
			queue.add(str);
		}
		
		System.out.println("iterating the queue elements:");

		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());

		}

		queue.remove();
		queue.poll();

		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){

			System.out.println(itr2.next());

		}
	}
}


/*  OUTPUT

Enter the number of elements to the Queue :
5
enqueue the elements to the queue :
java
dbms
python
c
android
iterating the queue elements:
android
c
python
java
dbms
after removing two elements:
dbms
java
python

*/


