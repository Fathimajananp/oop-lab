/* Create interfaces Student and Sports. Create a class Result implements Student and Sports. Display the academic and sports score of a student. */


import java.util.*;

interface student{
	int score=10;
	void displayscore();
}

interface sports{
	int score=25;
	void displaysportsscore();
}

class result implements student,sports{
	public void displayscore()
	{
		System.out.println("Academic score is " +student.score);
	}
	public void displaysportsscore()
	{
		System.out.println("sports score is " +sports.score);
	}

}

public class sportsstudentresult{
	public static void main(String args[]){
		result r=new result();
		r.displayscore();
		r.displaysportsscore();
	}
}

	


/* OUTPUT


Academic score is 10
sports score is 25

*/
