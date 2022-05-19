package Graphics;

import java.util.*;

interface figure{
	public void area(int r);
}



public class circle implements figure{
	public void area(int r){
		System.out.println("Area of circle : " +(r*r*3.14));
	}
}






