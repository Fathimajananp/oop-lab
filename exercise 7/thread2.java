/* Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a
given range. Implement using threads. (Runnable Interface)  */




import java.util.*;

class fibonacci implements Runnable//implementing runnable interface
{
	Scanner s=new Scanner(System.in);
	int n;
	fibonacci(int k){//constructor
	n=k;		
}

public void run()
{
	System.out.println("\n__Fibonacci series upto "+n+" terms___\n\n");
	int a=0,b=1,c=0;
	for(int i=1;i<=n;i++)
	{
		System.out.println("Fibonacci : "+c);
		a=b;
		b=c;
		c=a+b;
	}
}
}

class even implements Runnable
{
	int n1,n2;
	even(int x,int y){
	n1=x;
	n2=y;
}

public void run()
{
	
	for(int i=n1;i<=n2;i++)
	{
		if(i%2==0){System.out.println("Even Number : "+i);}
	}
}
}

class thread2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("\n\nEnter the Limit for fibonacci series:");
		int n=s.nextInt();

		System.out.println("\n\nEnter the range for even numbers:");
		int n1=s.nextInt();
		int n2=s.nextInt();

		fibonacci th1=new fibonacci(n);//creating object of class fibonacci
		Thread t1=new Thread(th1);//creating thread object with the abve class object

		even th2=new even(n1,n2);//creating object of class sample2
		Thread t2=new Thread(th2);//creating thread object with the abve class object

		t1.start();//starting thread
		t2.start();//starting thread
	}
}




/*  OUTPUT

Enter the Limit for fibonacci series:
100


Enter the range for even numbers:
1
100

__Fibonacci series upto 100 terms___


Even Number : 2
Even Number : 4
Even Number : 6
Even Number : 8
Fibonacci : 0
Fibonacci : 1
Fibonacci : 1
Fibonacci : 2
Fibonacci : 3
Fibonacci : 5
Fibonacci : 8
Fibonacci : 13
Fibonacci : 21
Fibonacci : 34
Fibonacci : 55
Fibonacci : 89
Fibonacci : 144
Fibonacci : 233
Fibonacci : 377
Fibonacci : 610
Fibonacci : 987
Fibonacci : 1597
Fibonacci : 2584
Fibonacci : 4181
Fibonacci : 6765
Fibonacci : 10946
Fibonacci : 17711
Fibonacci : 28657
Fibonacci : 46368
Even Number : 10
Fibonacci : 75025
Even Number : 12
Fibonacci : 121393
Fibonacci : 196418
Fibonacci : 317811
Even Number : 14
Even Number : 16
Even Number : 18
Even Number : 20
Even Number : 22
Even Number : 24
Even Number : 26
Even Number : 28
Even Number : 30
Even Number : 32
Even Number : 34
Even Number : 36
Even Number : 38
Even Number : 40
Fibonacci : 514229
Even Number : 42
Fibonacci : 832040
Fibonacci : 1346269
Even Number : 44
Even Number : 46
Even Number : 48
Even Number : 50
Even Number : 52
Even Number : 54
Even Number : 56
Even Number : 58
Even Number : 60
Even Number : 62
Even Number : 64
Even Number : 66
Even Number : 68
Even Number : 70
Even Number : 72
Even Number : 74
Even Number : 76
Fibonacci : 2178309
Even Number : 78
Fibonacci : 3524578
Even Number : 80
Fibonacci : 5702887
Even Number : 82
Fibonacci : 9227465
Even Number : 84
Fibonacci : 14930352
Even Number : 86
Fibonacci : 24157817
Even Number : 88
Even Number : 90
Even Number : 92
Even Number : 94
Even Number : 96
Even Number : 98
Even Number : 100
Fibonacci : 39088169
Fibonacci : 63245986
Fibonacci : 102334155
Fibonacci : 165580141
Fibonacci : 267914296
Fibonacci : 433494437
Fibonacci : 701408733
Fibonacci : 1134903170
Fibonacci : 1836311903
Fibonacci : -1323752223
Fibonacci : 512559680
Fibonacci : -811192543
Fibonacci : -298632863
Fibonacci : -1109825406
Fibonacci : -1408458269
Fibonacci : 1776683621
Fibonacci : 368225352
Fibonacci : 2144908973
Fibonacci : -1781832971
Fibonacci : 363076002
Fibonacci : -1418756969
Fibonacci : -1055680967
Fibonacci : 1820529360
Fibonacci : 764848393
Fibonacci : -1709589543
Fibonacci : -944741150
Fibonacci : 1640636603
Fibonacci : 695895453
Fibonacci : -1958435240
Fibonacci : -1262539787
Fibonacci : 1073992269
Fibonacci : -188547518
Fibonacci : 885444751
Fibonacci : 696897233
Fibonacci : 1582341984
Fibonacci : -2015728079
Fibonacci : -433386095
Fibonacci : 1845853122
Fibonacci : 1412467027
Fibonacci : -1036647147
Fibonacci : 375819880
Fibonacci : -660827267
Fibonacci : -285007387
Fibonacci : -945834654
Fibonacci : -1230842041
Fibonacci : 2118290601
Fibonacci : 887448560
Fibonacci : -1289228135
Fibonacci : -401779575
Fibonacci : -1691007710
Fibonacci : -2092787285
Fibonacci : 511172301
Fibonacci : -1581614984
Fibonacci : -1070442683
Fibonacci : 1642909629
Fibonacci : 572466946
Fibonacci : -2079590721
Fibonacci : -1507123775
Fibonacci : 708252800
Fibonacci : -798870975
Fibonacci : -90618175
Fibonacci : -889489150

*/
