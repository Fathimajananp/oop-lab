/* Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class) */

import java.util.*;

class multiplication extends Thread //inheriting thread class
{
 public void run()
     {
        System.out.println("Multiplication Table of 5\n\n");          
        for(int i=1;i<=10;i++)
         {
          System.out.println(i +"*5="+(i*5));
         }
     }
}

class prime extends Thread        //extending thread class
  {
    int n;
    prime(int k){   //constructor
    n=k;
    }


 public void run(){
    int f=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Prime numbers upto "+ n+"\n\n");
         for(int i=2;i<=n;i++)
         {  
            f=0;
            for(int j=2;j<=(i/2);j++)
              {
                 if((i%j)==0)
                   {
                     f=1;
                     break;
                   }
              }
            if(f==0)
            {
              System.out.println("Prime Number : "+i);
            }
          }
     }
}


class thread1{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);        
       System.out.println("\nEnter the limit:");
       int n=s.nextInt();
       multiplication m=new multiplication();           //creating object for class sample1    
       prime p=new prime(n);         //creating object for class sample2
       m.start();                     //using that object starting thread
       p.start();                     //starting thread by using this object  
   }

}




/*  OUTPUT

Enter the limit:
6
Multiplication Table of 5


1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
Prime numbers upto 6


Prime Number : 2
Prime Number : 3
Prime Number : 5
6*5=30
7*5=35
8*5=40
9*5=45
10*5=50

*/
