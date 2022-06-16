package MivneFourPackage;

public class HashClosed {
    private LinkedList[] array_of_subscribed;
    private int m;    //// size of the table needs to be the (number of lines in the file input1)/3

    public HashClosed(int m){  // this m right here is the number of people that we plan to register
        this.m = m/3;
        this.array_of_subscribed = new LinkedList[this.m];   ///// the table of the people who are subscribed
        for (int i=0; i<this.m; i++){
            this.array_of_subscribed[i] = new LinkedList();
        }
    }

    public void insert(String[] person){
        int insertion_index = (Integer.parseInt(person[0])) % this.m;
        this.array_of_subscribed[insertion_index].add(person);
    }

    public int[] search(String[] person){
        int insertion_index = (Integer.parseInt(person[0])) % this.m;
        return this.array_of_subscribed[insertion_index].search(person);
    }

    public int getSize(){ return this.m; }
    public LinkedList[] getArray_of_subscribed() { return this.array_of_subscribed; }


    public int get_amount_of_nodes_in_subscribed(){
        int sum_of_nodes = 0;
        for(int curr_size : this.getNodesSizes()) {
            sum_of_nodes += curr_size;  //////  sum of nodes
        }
        return sum_of_nodes;
    }


    public int[] getNodesSizes(){
        int[] arr_of_sizes = new int[this.m];
        int i = 0;
        for(LinkedList ls : this.array_of_subscribed){
            arr_of_sizes[i] = ls.getSize();
            i++;
        }
        return arr_of_sizes;
    }



}
