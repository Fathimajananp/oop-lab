/*Java program to find the number of days in a month for a given year.
Check Leap year also.*/

import java.util.Scanner;
class leapyear{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int days=0;
		String month="0";

		System.out.print("Enter a month number:");
		int m=in.nextInt();
		
		System.out.print("Enter a year:");
		int year=in.nextInt();

		switch (m) {
			case 1 :month="January";
					days=31;
					break;
			case 2 :month="February";
					if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
					{
					days=29;
					System.out.print(year+" is a leap year\n");
					}
					else
					{
					days=28;
					System.out.print(year+" is not a leap year\n");
					}
					break;
			case 3 :month="March";
					days=31;
					break;
			case 4 :month="April";
					days=30;
					break;
			case 5 :month="May";
					days=31;
					break;
			case 6 :month="June";
					days=30;
					break;
			case 7 :month="July";
					days=31;
					break;
			case 8 :month="August";
					days=31;
					break;
			case 9 :month="September";
					days=30;
					break;
			case 10 :month="October";
					days=31;
					break;
			case 11 :month="November";
					days=30;
					break;
			case 12 :month="December";
					days=31;
					break;
		}
		System.out.print(month + " " + year + " has " + days + " days\n");
	}
}

/*output

Enter a month number:3
Enter a year:2000
March 2000 has 31 days

Enter a month number:2
Enter a year:2022
2022 is not a leap year
February 2022 has 28 days

Enter a month number:2
Enter a year:2024
2024 is a leap year
February 2024 has 29 days

*/
