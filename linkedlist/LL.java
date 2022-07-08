import java.util.*;

class LL {

    Node head;// creating a head
    private int size; //to track size

    LL()//constructor
    {
        this.size=0;//initializing it to zero and when we create a new node we make the size ++ and when delete the size--
    }

    class Node {
        String data;// the data we store
        Node next;// since next is also a node, so Node(class name) next

        Node(String data)// constructor
        {
            this.data = data;
            this.next = null;// whenever new node the next will be null
            size++;//counting the size
        }
    }

    // 1.add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) // checking if a linked list even exists
        {
            head = newNode;
            return;
        }
        // else, the newnode's next will now point towards where head was(the first
        // element in ll) and then we make the head point towards the newnode

        newNode.next = head;
        head = newNode;
    }

    // 1.add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) // checking if a linked list even exists
        {
            head = newNode;
            return;
        }

        // traverse
        Node currNode = head;
        while (currNode.next != null)// traverse till the next of currNode is pointing till null(last node)
        {
            currNode = currNode.next;// going to the next node

        }
        // after reaching last node
        currNode.next = newNode;// the new node is now the last node, and its already pointing towards null

    }

    // 2.print
    public void printList() {
        // is head is null
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null)// traverse till the currNode is null(last node)
        {
            System.out.print(currNode.data + " -> ");// printing the data
            currNode = currNode.next;// going to the next node

        }
        System.out.println("NULL");
    }
    //3.delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;//just making the head as the next one

    }
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        //if out head.next=null that means our lastnode is null and if we do null ka next then therell be error
        //basically a list with just one node
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        while(lastnode.next != null)//till the lastnode next points to null
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;

        }
        //as soon as we find second last node
        secondlast.next=null;


    }
    public int getsize(){
        return size;
    }

    public void reverseIterate(){
        //if list is empty or has only one element
        if(head==null || head.next==null){
            
            return;

        }
        Node prevnode=head;
        Node currnode=head.next;//if linkedlist is empty this will give an error
        //we'll define the next node in the loop
        while(currnode != null)//till we reach the last node, after reversing even the last node, reached null
        {
            Node nextnode=currnode.next;
            currnode.next=prevnode;//reversing the direction


            //update
            prevnode=currnode;
            currnode=nextnode;

        }
        head.next=null;
        head=prevnode;//the new head is the prev node

    }




    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        
        list.addLast("List");
        list.addFirst("This");
        list.printList();

        list.reverseIterate();
        list.printList();

    }
}

// the internals of a linkedlist
