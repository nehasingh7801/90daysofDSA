import java.util.*;
public class javaLLcollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        
        list.addLast("List");
        list.add("This");//by default in java LL add means addlast
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        //to search

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        //to remove a particular item
        list.remove(2);//remove second index value
        System.out.println(list);



        

        
    }
    
}
