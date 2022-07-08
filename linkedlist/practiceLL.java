class practiceLL {
    Node head;
    private int size;

    practiceLL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head = newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;

    }

    public void print(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data + " -> ");
            currnode=currnode.next;
        }
        System.out.println("NULL");


    }

    public void reverse(){
        if(head==null || head.next==null ){
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        while(currnode!=null){
            Node nextnode=currnode.next;
            currnode.next=prevnode;//reversing the direction

            //updating
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
    }

    public void deletefirst(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;

    }

    public void deleteLast(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;

        size--;

        if(head.next==null){
            head=null;
            return;
        }
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }

        secondlast.next=null;

    }

    
}
