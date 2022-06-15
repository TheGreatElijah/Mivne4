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

    public int[] search(String[] person){
        Node runner = this.head;
        int steps = 1;
        while (runner != null){
            boolean flag = true;
            for (int i=0; i<4;i++){
                if (!runner.getData()[i].equals(person[i])){
                    flag = false;
                }
            }
            if (flag){
                int[] res = new int[2];
                res[0] = 1;
                res[1] = steps;
                return res;
            }
            steps++;
            runner = runner.getNext();
        }
        int[] res2 = new int[2];
        res2[0] = 0;
        res2[1] = steps;
        return res2;
    }
}
