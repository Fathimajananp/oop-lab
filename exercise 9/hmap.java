//Program to demonstrate the working of Map interface by adding, changing and removing elements.

import java.util.*;
class hmap
{
    public static void main(String args[])
    {
        HashMap<String,Double>hm =new HashMap<String,Double>();
        hm.put("book",50.0);
        hm.put("pen",15.5);
        hm.put("pencil",5.6);
        hm.put("box",100.5);
        hm.put("umberla",200.8);
        hm.put("bag",680.0);
       
        System.out.println("Hashmap: "+hm+"\n");
       
        hm.remove("book");
        System.out.println("book removed\nHashmap: "+hm+"\n");
       
        double h= hm.get("box");
        hm.put("box",h+75.5);
        System.out.println("value of box is changed\nHashmap: "+hm+"\n");
           
        Set<Map.Entry<String,Double>>set= hm.entrySet();
        for(Map.Entry<String,Double>i : set)
        {
            System .out.println(i.getKey()+" : "+i.getValue());
        }
    }            
}


/*  OUTPUT

Hashmap: {umberla=200.8, book=50.0, pen=15.5, bag=680.0, box=100.5, pencil=5.6}

book removed
Hashmap: {umberla=200.8, pen=15.5, bag=680.0, box=100.5, pencil=5.6}

value of box is changed
Hashmap: {umberla=200.8, pen=15.5, bag=680.0, box=176.0, pencil=5.6}

umberla : 200.8
pen : 15.5
bag : 680.0
box : 176.0
pencil : 5.6

*/

