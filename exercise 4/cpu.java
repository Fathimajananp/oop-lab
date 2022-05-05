/* 1. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.*/



//PROGRAM FOR INNER CLASS CONCEPT

import java.util.*;
class cpu           //OUTER CLASS
{

	float price=5000;
    void display()
     {
       System.out.println("PRICE: "+price);
       processor p=new processor();//CREATING OBJECT FOR INNER CLASS PROCESSOR
       p.display();
     }


	class processor//INNER CLASS
	{
		int core=5;
		String manufacturer="intel";
     	void display()
     	{
       		System.out.println("NUMBER OF CORES: "+core);
       		System.out.println("CPU MANUFACTERER: "+manufacturer);
     	}

	}

 	static class ram//STATIC INNER CLASS
	{
		int memory=4;
		String manufacturer="dell";
    	void display()
   	 	{
     		System.out.println("RAM MEMORY: "+memory+ " GB");
     		System.out.println("RAM MANUFACTERER: "+manufacturer);
    	}
	}


	public static void main(String args[])
	{
		cpu obj=new cpu();//CREATING OBJECT OF OUTER CLASS
		System.out.println("system information");
		System.out.println("....................");
		System.out.println("\n");
		obj.display();
		cpu.ram obj2=new cpu.ram();//CREATING OBJECT FOR STATIC INNER CLASS
		obj2.display();
	}
}




/*
SYSTEM INFORMATIONS
....................
PRICE: 5000.0
NUMBER OF CORES: 5
CPU MANUFACTERER: AMD
RAM SIZE: 4 GB
RAM MANUFACTERER: DELL
*/


















