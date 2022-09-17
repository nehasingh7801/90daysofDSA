package hashset;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.*;
public class hashing{
    public static void main(String args[]) {
        //cretaing
        HashSet<Integer> set=new HashSet<>();

        //inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//duplicate wont be stored
        

        //searching-- contains or not

        if(set.contains(1)){
            System.out.println("yes");
        }

        //interator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    
}