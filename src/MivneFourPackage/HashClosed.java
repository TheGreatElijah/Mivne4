package MivneFourPackage;

public class HashClosed {
    private LinkedList[] array_of_subscribed;
    private Node[] sure_people;
    private int m = 11;  //// size of the table needs to be the (number of lines in the file input1)/3

    public HashClosed(int m){  // m is the number of people that we plan to register
        this.m = m/3;
        this.array_of_subscribed = new LinkedList[this.m];   ///// the table of the people who are subscribed
    }

    public void insert(String[] person){
        int insertion_index = ((conversion from string to int)(person[0])) % this.m;   ///// use conversion from string to int
        this.array_of_subscribed[insertion_index].InsertPersonNode(person);
    }

    public LinkedList[] getArray_of_subscribed() { return this.array_of_subscribed; }
    public int getM() { return this.m; }


    public void read_file(String file_name){  //////////  complete this with I/O later , the file input1
        do something
    }  /////  according to the assignment, I think this method should be in the class Concert




    public void search_table(int sought_id){
        int index_to_search = sought_id % this.m;
        //////  and then search the LinkedList with a function in the LinkedList and do what needs to be done
    }


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


    public int[] reception(){
        ////  return the sorted list of the id's of the sure_people
    }


    public void add_to_array_of_sure_people(int id){  //// makes the reception\adds the people to the sure_people array, later we will put in hall
        if (this.sure_people == null){
            this.sure_people = new Node[this.get_amount_of_nodes_in_subscribed()];
        }
        ////  and put the node with that id in the this.sure_people array with a while cell != null
    }


    public void insertion_to_the_hall(){   //////  not sure which form it should be in, disregard this method for now
        ////  build the array_of_hall according to the assignment, and put the Nodes of the sure_people in it  // should be in class HashOpen !!!
    }




}