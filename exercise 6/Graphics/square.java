package Graphics;

import java.util.*;

interface figure{
	public void area(int a);
}



public class square implements figure{
	public void area(int a){
		System.out.println("Area of square : " +(a*a));
	}
}



