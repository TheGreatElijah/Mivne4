package MivneFourPackage;

public class Node implements Comparable{
    private Node next;
    private String[] data;

    public Node(String first_name, String last_name, String id, String ticket_type){
        this.data = new String[4];
        this.data[0] = id;
        this.data[1] = first_name;
        this.data[2] = last_name;
        this.data[3] = ticket_type;
        this.next = null;
    }

    public String[] getData(){ return this.data; }

    public Node getNext() { return this.next; }
    public void setNext(Node person){ this.next = person; }

    public String getFirst_name() { return this.data[1]; }
    public void setFirst_name(String first_name) { this.data[1] = first_name; }

    public String getLast_name() { return this.data[2]; }
    public void setLast_name(String last_name) { this.data[2] = last_name; }

    public String getId() { return this.data[0]; }
    public void setId(String id) { this.data[0] = id; }

    public String getTicket_type() { return this.data[3]; }
    public void setTicket_type(String ticket_type) { this.data[3] = ticket_type; }


    @Override
    public int compareTo(Object o) {    ////////  0 if equal, 1 if greater, -1 if lower
        if (this.getTicket_type() == ((Node)o).getTicket_type()){
            return 0;
        }                 //////////// from here on, they're not equal based to ticket_type
        if (this.getTicket_type() == "VIP"){
            return 1;
        }
        if (((Node)o).getTicket_type() == "VIP"){
            return -1;
        }
        if (this.getTicket_type() == "GOLDEN_RING" && ((Node)o).getTicket_type() != "VIP"){
            return 1;
        }
        if (this.getTicket_type() != "VIP" && ((Node)o).getTicket_type() == "GOLDEN_RING"){
            return -1;
        }
        if (this.getTicket_type() == "INNER_RING" && ((Node)o).getTicket_type() != "OUTER_RING"){
            return -1;
        }
        if (this.getTicket_type() != "OUTER_RING" && ((Node)o).getTicket_type() == "INNER_RING"){
            return 1;
        }
        if (((Node)o).getTicket_type() == "OUTER_RING") {
            return 1;
        } else { ///////  this is: if (this.getTicket_type() == "OUTER_RING")
            return -1;
        }

    }
}
