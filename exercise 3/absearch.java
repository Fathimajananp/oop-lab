//Search using arrays.binarySearch()

import java.util.*;
class absearch
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

    	int z=Arrays.binarySearch(arr,s);        //invoking binarySearch()
    	if(z> -1)            //implies element found case
      		System.out.println("ELEMENT FOUND AT INDEX "+(z+1));
    	else                 //not found case
        	System.out.println("ELEMENT NOT FOUND...");            
    }
}



/*OUTPUT

Enter Number of elements: 4
Enter the elements in sorted order: 
3 
5
7
9
Enter the element to search: 7
ELEMENT FOUND AT INDEX 3



Enter Number of elements: 4
Enter the elements in sorted order: 
2
3
4
5
Enter the element to search: 6
ELEMENT NOT FOUND...

*/
