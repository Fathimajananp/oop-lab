package Graphics;

import java.util.*;

interface figure{
	public void area(int a,int b);
}



public class square implements figure{
	public void area(int a,int b){
		System.out.println("Area of square : " +(a*a));
	}
}



