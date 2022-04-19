//recursive binary search

import java.util.*;

class rbsearch
	{
    	int rbisearch(int f,int l,int x,int arr[])    //recursive fun
    		{
    			if(l>=f)
    				{
						int mid=(f+l)/2;
						if(arr[mid]==x)        //case of match
	    				return mid;
						if(x>arr[mid])
	    				return rbisearch(mid+1,l,x,arr);       //case of right side
   	    				return rbisearch(f,mid-1,x,arr);       //case of left side
    				}
    			return -1;
    		}


    	public static void main(String args[])
    		{
    			int i;
    			rbsearch obj=new rbsearch();
    			Scanner in=new Scanner(System.in);
    			System.out.print("Enter Number of elements: ");
    			int n=in.nextInt();
    			int arr[]=new int[n];
    			System.out.print("Enter the elements in sorted order : \n");
    			for( i=0;i<n;i++)
    				{
      					arr[i]=in.nextInt();
    				}
    			System.out.print("Enter the element to search: ");
    			int s=in.nextInt();
   
    			int k=obj.rbisearch(0,n-1,s,arr);             //invoking bisearch
    			if(k==-1)
      			System.out.println("ELEMENT NOT FOUND... ");
    			else
      			System.out.println("ELEMENT FOUND AT INDEX "+(k+1));   
    		}
	}


/* output 1


Enter Number of elements: 4
Enter the elements in sorted order : 
3 5 7 9
Enter the element to search: 4
ELEMENT NOT FOUND... 

output 2

Enter Number of elements: 5
Enter the elements in sorted order : 
2 4 6 3 8 
Enter the element to search: 6
ELEMENT FOUND AT INDEX 3

*/
