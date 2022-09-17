package hashset;
import java.util.*;

public class hashingtwo {
    public static void main(String args[]) {
        HashMap<String, Integer> map=new HashMap<>();


        //insertion

        map.put("India", 120);
        map.put("US", 30);

        System.out.println(map);
        
        //searchi

        // if(map.containsKey("India")){
        //     System.out.println("present");
        // }

        // System.out.println(map.get("China"));//null
        // System.out.println(map.get("India"));//120


        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


    }
    
}
