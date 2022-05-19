package Graphics;

import java.util.*;

interface figure{
	public void area(int b,int h);
}



public class triangle implements figure{
	public void area(int b,int h){
		System.out.println("Area of triangle : " +((b*h*0.5)));
	}
}



