/* String manipulation methods.
1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()
*/

import java.util.*;
class strmanipulation{
	public static void main(String[] args)
		{
			//new string using new
			char chs[] = {'w','e','l','c','o','m','e'};
			String newStr = new String(chs);
			System.out.println("New string from char[] using new String: "+ newStr);
			byte asciis[] = {65,66,67,68,69,70};
			newStr = new String(asciis);
			System.out.println("New string from byte[] using new String: "+ newStr);

			String s1 = "hello";
			String s2 = "World";

			//string length
			
			System.out.println("\nString length of 'hello' : "+ s1.length());
			
			//to uppercase and lowercase
			
			System.out.println("\n----- String Case Change -----");
			System.out.println(s1 + " to uppercase: "+s1.toUpperCase());
			System.out.println(s2 + " to lowercase: "+s2.toLowerCase());

			//string concatenation

			System.out.println("\n----- String Concatenation -----");
			System.out.println("\nusing concat(): "+ s1.concat(s2));
			System.out.println("\nusing + operator: "+ s1 + s2);

			//character extraction

			System.out.println("\n----- Character Extraction -----");
			System.out.println("\nCharacter at 3rd position: "+ s1.charAt(3));
			char c[] = new char[5];
			s1.getChars(2,4,c,0);
			System.out.println("\nCharacter between 2 and 4 : "+ new String(c));

			//character comparison

			System.out.println("\n----- Character comparison -----");
			s1 = "welcome";
			s2 = "WELCOME";
			System.out.println(s1 + " Equals: "+ s2 + " : " + s1.equals(s2));
			System.out.println(s1 + " equalsIgnoreCase "+ s2 + " : " + s1.equalsIgnoreCase(s2));
			
			System.out.println(s1 + " compareTo: "+ s2 + " : " + s1.compareTo(s2));
			System.out.println(s1 + " compareToIgnoreCase "+ s2 + " : " + s1.compareToIgnoreCase(s2));

			System.out.println(s1 + " startsWith w : " +s1.startsWith("w"));
			System.out.println(s1 + " endsWith e : " +s1.endsWith("e"));

			//searching substring

			System.out.println("\n----- searching substring -----");
			String s3 = "Have a nice day";
			System.out.println("The index of 'nice' in the string "+s3+ " is : " +s3.indexOf("nice"));
			System.out.println("The last index of 'nice' in the string "+s3+ " is : " +s3.lastIndexOf("e"));


			//modifying a sting

			System.out.println("\n----- modifying a sting -----");
			System.out.println("The sub string of string "+s3+ " is : " +s3.substring(12,15));
			System.out.println("The string 'nice' from "+s3+ " is replaced by 'good' : " +s3.replace("nice","good"));

			//Data conversion using valueOf()

			System.out.println("\n----- Data conversion using valueOf() -----");
			int s4 = 30;
			System.out.println("The data conversion using valueOf() of int 30 is : " +String.valueOf(s4));
			
		}
	}



/*  output


New string from char[] using new String: welcome
New string from byte[] using new String: ABCDEF

String length of 'hello' : 5

----- String Case Change -----
hello to uppercase: HELLO
World to lowercase: world

----- String Concatenation -----

using concat(): helloWorld

using + operator: helloWorld

----- Character Extraction -----

Character at 3rd position: l

Character between 2 and 4 : ll

----- Character comparison -----
welcome Equals: WELCOME : false
welcome equalsIgnoreCase WELCOME : true
welcome compareTo: WELCOME : 32
welcome compareToIgnoreCase WELCOME : 0
welcome startsWith w : true
welcome endsWith e : true

----- searching substring -----
The index of 'nice' in the string Have a nice day is : 7
The last index of 'nice' in the string Have a nice day is : 10

----- modifying a sting -----
The sub string of string Have a nice day is : day
The string 'nice' from Have a nice day is replaced by 'good' : Have a good day

----- Data conversion using valueOf() -----
The data conversion using valueOf() of int 30 is : 30
*/
