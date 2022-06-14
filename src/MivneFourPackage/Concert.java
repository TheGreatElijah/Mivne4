package MivneFourPackage;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Concert {
    public static LinkedList getFromFile(String FileName){
        LinkedList res = new LinkedList();     /////  we wil concatenate Nodes into this
        File file = new File(FileName);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                String[] line = st.split(",");
                res.add(line);
//                System.out.println(st);    ////////   ttteesssttt
            }
        }catch (IOException e){
            System.out.println(e.getMessage() + "\n" + e.getStackTrace());
        }
        return res;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static HashClosed registerCrowd(String file_path){
        LinkedList nodes = Concert.getFromFile(file_path);
        HashClosed res = new HashClosed(nodes.getSize());
        Node runner = nodes.getHead();
        while (runner != null){
            res.insert(runner.getData());
            runner = runner.getNext();
        }
        return res;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int[] reception(String file_path, HashClosed registered){
        LinkedList not_subscribed = new LinkedList();
        int[] res = new int[registered.get_amount_of_nodes_in_subscribed()];

        File file = new File(file_path);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            int insertion_index = 0;
            while ((st = br.readLine()) != null) {
                String[] line = st.split(",");
                if ((registered.search(line))[0] == 1){
                    res[insertion_index] = Integer.parseInt(line[0]);
                    insertion_index++;
                }else{
                    not_subscribed.add(line);
                }
            }

            if (insertion_index < registered.get_amount_of_nodes_in_subscribed()) {
                Node[] not_subscribed_sort = new Node[not_subscribed.getSize()];  //////  creating this now this

                Node runner = not_subscribed.getHead();
                int i1 = 0;
                while (runner != null){
                    not_subscribed_sort[i1] = runner;
                    i1++;
                }  ///////   created not_subscribed_sort

                for(int i=0; i < not_subscribed_sort.length - 1; i++){
                    int max_index = i;
                    for(int j=i+1; j < not_subscribed_sort.length; j++){
                        if (not_subscribed_sort[max_index].compareTo(not_subscribed_sort[j]) == 1){
                            max_index = j;
                        }
                    }
                    Node temp = not_subscribed_sort[i];
                    not_subscribed_sort[i] = not_subscribed_sort[max_index];
                    not_subscribed_sort[max_index] = temp;
                }

                int addition_index = 0;
                while (insertion_index < registered.get_amount_of_nodes_in_subscribed()){
                    res[insertion_index] = Integer.parseInt((not_subscribed_sort[addition_index]).getId());
                    addition_index++;
                    insertion_index++;
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage() + "\n" + e.getStackTrace());
        }
        return res;
    }




    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    public static int reception_AverageSteps(String file_path, HashClosed registered){}


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//    public static int[] seatingArrangement(int[] sortedCrowed, HashClosed registered, int functionNum){}
//
//
//
//    public int h_1(int id, int m){}  ///////  division method
//
//    public int h_2(int id, int m){}  ///////  reverse
//



}
