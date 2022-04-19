//Write a program to search an element in array using Linear search

import java.util.*;
class lsearch
{
    public static void main(String args[])
    {
    	int i,k=0;
    	Scanner in=new Scanner(System.in);
    	System.out.print("Enter Number of elements: ");
    	int n=in.nextInt();
    	int arr[]=new int[n];
    	System.out.print("Enter the elements:\n");
    	for( i=0;i<n;i++)
    	{
   			arr[i]=in.nextInt();
    	}
    	System.out.print("\nEnter the element to search: ");
    	int s=in.nextInt();
    	for( i=0;i<n;i++)
    		{
     			if(arr[i]==s)
        			{
            			System.out.println("ITEM FOUND AT INDEX "+(i+1));
            			k=1;
            			break;
        			}
          
     		}
     	if(k==0)
     		{
         		System.out.println("ELEMENT NOT FOUND....  ");
     		}        
    }
}


/*  OUTPUT 1

Enter Number of elements: 4
Enter the elements:
4
9
6
0

Enter the element to search: 0
ITEM FOUND AT INDEX 4


   OUTPUT 2

Enter Number of elements: 4
Enter the elements:
1
9
3
6

Enter the element to search: 7
ELEMENT NOT FOUND....
  */
