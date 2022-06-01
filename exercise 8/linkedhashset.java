// Program to demonstrate the creation of Set object using the LinkedHashset class

import java.util.*;
public class linkedhashset{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		System.out.println("Enter the number of elements to the set :"); 
		int n=in.nextInt();
		System.out.println("Enter the elements to the set :");   //add elements to the set
		for(int i=0;i<n;i++){
			String str=in.next();
			set.add(str);
		}
		System.out.println("iterating the set elements:");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());
			}
	} 
}



/*  OUTPUT


Enter the number of elements to the set :
5
Enter the elements to the set :
java
python
html
dbms
android
iterating the set elements:
java
python
html
dbms
android

*/
