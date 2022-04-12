//Binary Search

import java.util.*;
class bsearch
	{
    	public static void main(String args[])
    		{
    			int i,k=0;
    			Scanner in=new Scanner(System.in);
    			System.out.print("Enter Number of elements: ");
    			int n=in.nextInt();
    			int arr[]=new int[n];
    			System.out.print("Enter the elements in sorted order: \n");
    			for( i=0;i<n;i++)
    				{
      					arr[i]=in.nextInt();
    				}
    			System.out.print("Enter the element to search: ");
    			int s=in.nextInt();

    			int f=0,l=n-1,mid=(f+l)/2;
    			while(f<=l)
    				{
     					if(s>arr[mid])     //case of element is right of mid
        					{
      	    					f=mid+1;
            					mid=(f+l)/2;
        					}
        				else if(s<arr[mid])   //case of element is left of mid
        					{
            					l=mid-1;
            					mid=(f+l)/2;
        					}
       					else                 //case of match
        					{
            					System.out.println("ELEMENT FOUND AT INDEX "+(mid+1));
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

/* output 1

Enter Number of elements: 5
Enter the elements in sorted order: 
2 4 7 9 5
Enter the element to search: 7
ELEMENT FOUND AT INDEX 3


  output 2

Enter Number of elements: 5
Enter the elements in sorted order: 
2 4 3 7 9 
Enter the element to search: 6
ELEMENT NOT FOUND.... 
*/
