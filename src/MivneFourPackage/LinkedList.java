package MivneFourPackage;

public class LinkedList {
    private int Size;
    private Node head, tail;

    public LinkedList(){
        this.Size = 0;
        this.head = null;
        this.tail = null;
    }

    public int getSize(){
        return this.Size;
    }
    public Node getHead() { return this.head; }
    public Node getTail(){ return this.tail; }
    public void setHead(Node head) { this.head = head; }
    public void setTail(Node tail) { this.tail = tail; }
    public void setSize(int size) { this.Size = size; }

    public void add(String[] person){
        this.InsertPersonNode(new Node(person[1], person[2], person[0], person[3]));
    }

    public void InsertPersonNode(Node New_Node){
        if (this.Size == 0){
            this.head = New_Node;
            this.tail = New_Node;
            this.setSize(this.getSize() + 1);
        }else{
            this.getTail().setNext(New_Node);
            this.setTail(New_Node);
            this.setSize(this.getSize() + 1);
        }
    }

    public void search_id(int sought_id){    ///////////////  maybe change to returns int or returns Node
        Node runner = this.head;
        while (runner !=)
    }
}
