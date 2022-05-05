/*Write a menu driven program that would choose either in-built method or call a user defined method to sort an array of strings.*/


import java.util.*;
import java.lang.*;
class Sort{
	void userdef(String a[],int n)  //comparing strings and swapping the strings
	{
    	for(int i=0;i<n-1;i++)
    	{
      		for(int j=i+1;j<n;j++)
      		{
        		if(a[i].compareTo(a[j])>0)
         		{
          			String temp = a[i];
          			a[i] = a[j];
          			a[j] = temp;
        	 	}
      		}
    	}

		System.out.println("The Sorted array is :"); //printing the array after sorting
		for(int i=0;i<n;i++)
		System.out.print(a[i]+"\n");
	}
}


class sort{
	public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);  
   
    	System.out.println("Enter the size of the array :");  //read the size of array
    	int n=in.nextInt();
    	String a[]=new String [n];
    	System.out.println("Enter the Strings in the array :");   //reading the strings to array
    	for(int i=0;i<n;i++)
    	{
     		a[i]=in.next();
    	}
     	Sort obj=new Sort();   //object created for the class Sort
      	do
      	{
       		System.out.println("\n1.In_build method for sort \n2.User defined method to sort \n3.Exit");
       		System.out.print("\nEnter your choice : ");
       		int ch=in.nextInt();

        	switch (ch)
    		{
     			case 1 : Arrays.sort(a);    //inbuilt method call
                   		 System.out.println("The Sorted array is :");
         				 System.out.println(Arrays.toString(a));
                         //printing the sorted array using Arrays.toString(a)
                   		 break;
     			case 2 : obj.userdef(a,n);
          				 break;
         		case 3 : System.out.println("Exiting.....!");
                   		 System.exit(0);
     			default: System.out.println("Enter a valid option...!");
    		}
        }while(true);
       
    }
}



/*  OUTPUT

Enter the size of the array :
5
Enter the Strings in the array :
hemil
richu
ainu
anu
sinu

1.In_build method for sort 
2.User defined method to sort 
3.Exit

Enter your choice : 1
The Sorted array is :
[ainu, anu, hemil, richu, sinu]

1.In_build method for sort 
2.User defined method to sort 
3.Exit

Enter your choice : 2
The Sorted array is :
ainu
anu
hemil
richu
sinu

1.In_build method for sort 
2.User defined method to sort 
3.Exit

Enter your choice : 5
Enter a valid option...!

1.In_build method for sort 
2.User defined method to sort 
3.Exit

Enter your choice : 3
Exiting.....!


*/
