//Program to Convert HashMap to TreeMap

import java.util.*;

class HmapTmap
{
    public static void main(String args[])
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        System.out.println("HashMap : " + map);
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        System.out.println("TreeMap : " + treeMap);
    }
}


/*  OUTPUT

HashMap : {1=One, 2=Two, 3=Three, 4=Four, 5=Five, 6=Six, 7=Seven, 8=Eight, 9=Nine}
TreeMap : {1=One, 2=Two, 3=Three, 4=Four, 5=Five, 6=Six, 7=Seven, 8=Eight, 9=Nine}

*/
  
