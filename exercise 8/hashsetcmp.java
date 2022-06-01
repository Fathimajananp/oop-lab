// Write a Java program to compare two hash set


import java.util.*;
public class hashsetcmp{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  //object creation for hashset1
		LinkedHashSet<String> set2=new LinkedHashSet<String>();  //object creation for hashset2

		System.out.println("Enter the number of elements to the set1 :"); 
		int n=in.nextInt();

		System.out.println("Enter the number of elements to the set2 :"); 
		int m=in.nextInt();

		System.out.println("Enter the elements to the set1 :");   //adding elements to the set1
		for(int i=0;i<n;i++){
			String str=in.next();
			set1.add(str);
		}

		System.out.println("Enter the elements to the set2 :");   //adding elements to the set2
		for(int i=0;i<m;i++){
			String str=in.next();
			set2.add(str);
		}

		
		
		if(set1.equals(set2))
		{
			System.out.println("The two sets set1 and set2 are equal"); 
		}
		else
		{
		System.out.println("The two sets set1 and set2 are different"); 
		}
	} 
}


/*  OUTPUT

Enter the number of elements to the set1 :
3
Enter the number of elements to the set2 :
3
Enter the elements to the set1 :
java
python
html
Enter the elements to the set2 :
java
python
html
The two sets set1 and set2 are equal




Enter the number of elements to the set1 :
3
Enter the number of elements to the set2 :
3
Enter the elements to the set1 :
java
python
android
Enter the elements to the set2 :
c
dbms
html
The two sets set1 and set2 are different



*/
