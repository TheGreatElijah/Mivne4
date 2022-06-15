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
        int this_value = 0, o_value = 0;
        String [] types = new String[4];
        types[3] = "VIP";
        types[2] = "GOLDEN_RING";
        types[1] = "INNER_RING";
        types[0] = "OUTER_RING";
        for (int i=0; i < types.length; i++){
            if (((Node)o).getTicket_type().equals(types[i])){
                o_value = i;
            }
            if (this.getTicket_type().equals(types[i])){
                this_value = i;
            }
        }
        if (this_value == o_value){
            return 0;
        }
        if (this_value > o_value){
            return 1;
        } else{
            return -1;
        }


    }
}
