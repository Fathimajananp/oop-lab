// Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.


import java.util.*;
class arraylist{

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();//delcaring an array list
		System.out.println("___Array List Operations___\n");
		System.out.println("1.ADD\n2.REMOVE\n3.REMOVE ALL\n4.DISPLAY\n5.SIZE\n6.EXIT\n");
		while(true){
			System.out.println("Enter your choice :");
			int ch=s.nextInt();
			switch(ch){
					case 1 :System.out.println("Enter item to add");
							String str=s.next();
							al.add(str);//adding an item
							break;
							
					case 2 :System.out.println("Enter item to Remove");
							String str2=s.next();
							al.remove(str2);//removing an item
							System.out.println("item Removed");
							break;

					case 3 :al.clear();//removing all
							System.out.println("All Item Cleared");
							break;

					case 4 :System.out.println(al);//displaying
							break;

					case 5 :System.out.println("Size of ArrayList : "+al.size());//getting size
							break;

					case 6 :System.out.println("Exiting...");
							break;
		
					default:System.out.println("Enter a valid option...");
							System.exit(0);

				}
			}
		}
	}



/*  OUTPUT

___Array List Operations___

1.ADD
2.REMOVE
3.REMOVE ALL
4.DISPLAY
5.SIZE
6.EXIT

Enter your choice :
1
Enter item to add
a
Enter your choice :
1
Enter item to add
b
Enter your choice :
1
Enter item to add
c
Enter your choice :
1
Enter item to add
d
Enter your choice :
4
[a, b, c, d]
Enter your choice :
5
Size of ArrayList : 4
Enter your choice :
2
Enter item to Remove
b
item Removed
Enter your choice :
3
All Item Cleared
Enter your choice :
6
Exiting...
Enter your choice :
7
Enter a valid option...


*/
