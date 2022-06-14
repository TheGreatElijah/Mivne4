package MivneFourPackage;

public class HashClosed {
    private LinkedList[] array_of_subscribed;
    private Node[] sure_people;
    private int m;  //// size of the table needs to be the (number of lines in the file input1)/3

    public HashClosed(int m){  // this m right here is the number of people that we plan to register
        this.m = m/3;
        this.array_of_subscribed = new LinkedList[this.m];   ///// the table of the people who are subscribed
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


    public void read_file(String file_name){  //////////  complete this with I/O later , the file input1
        do something ////////////////////////////////////////////////////  this method should be in the class Concert !!!
    }  //////////////////  according to the assignment, I think this method should be in the class Concert !!!


    public int get_amount_of_nodes_in_subscribed(){   ////////  might be needed, might not be needed, who knows
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

    public int AverageSteps_reception(){
        int step_counter = 0, sum_of_nodes = 0;
        for(int curr_size : this.getNodesSizes()){
            sum_of_nodes += curr_size;  //////  sum of nodes

            for (int step = 1; step <= curr_size; step++) {    ////  sum of steps of all the nodes
                step_counter += step;
            }
            step_counter += 1;  //// last check, when we realise the list is over
        }

        return step_counter / sum_of_nodes;  /// return the rounded down value of: step_counter / sum_of_nodes
    }


    public void add_to_array_of_sure_people(int id){  //// makes the reception\adds the people to the sure_people array, later we will put in hall
        if (this.sure_people == null){
            this.sure_people = new Node[this.get_amount_of_nodes_in_subscribed()];
        }
        ////  and put the node with that id in the this.sure_people array with a while cell != null
    }




}
