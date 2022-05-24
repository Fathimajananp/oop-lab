/* Write a user defined exception class to authenticate the user name and password.*/

import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}
}
class main1{
	public static void main(String ar[]){
		String username = "janan123";
		String password = "password";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the username :");
		String n = in.next();
		System.out.print("Enter the password :");
		String p = in.next();
		
		try{
			if((n.equals(username)) && (p.equals(password)))
			{
				throw new myException("Authentication success");
			}
			else{
				throw new myException("Authentication failed..!");
			}
		}
		
		catch(myException ex){
			System.out.print(ex.getMessage()+"\n");
		}
	}
}



/*   OUTPUT

Enter the username :janan
Enter the password :123
Authentication failed..!




Enter the username :janan123
Enter the password :password
Authentication success

*/
