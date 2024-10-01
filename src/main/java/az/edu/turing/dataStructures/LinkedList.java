package az.edu.turing.dataStructures;

public class LinkedList {
    Node head;

    public void add(int data) {

        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
        }
        else {
            Node currency=head;
            while (currency.next!=null){
                currency=currency.next;
            }
            head.next=newNode;
        }
    }
    public void addFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void delete(int key){
        Node current=head;
        Node prev=null;
        if (current!=null && current.data==key){
            head=current.next;
        }
        while (current!=null && current.data!=key){
            prev=current;
            current=current.next;
        }
        if (current==null){
            System.out.println("logout");
        }
        prev.next=current.next;
    }
    public void traverse(){
        Node current=head;
        if (current!=null){
            System.out.println("Current data: "+current.data);
            current=current.next;
        }
    }
}
