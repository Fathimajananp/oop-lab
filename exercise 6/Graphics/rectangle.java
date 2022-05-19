package Graphics;

import java.util.*;

interface figure{
	public void area(int l,int b);
}



public class rectangle implements figure{
	public void area(int l,int b){
		System.out.println("Area of rectangle : " +(l*b));
	}
}



