package MivneFourPackage;

public class HashOpen{
    private Node[] array_of_hall;    /// open addressing here !!!

    private int m;  //// size

    public HashOpen(int m){  /////  the size of HashOpen we want it to be
        this.m = m;
        this.array_of_hall = new Node[this.m];  /////  the table of the people in the hall
    }
    public int getSize(){ return this.m; }
    public Node[] getArray_of_hall() { return this.array_of_hall; }

    public int getNumberElements(){
        int amount = 0;
        for (Node ls : this.array_of_hall){
            if(ls != null){
                amount++;
            }
        }
        return amount;
    }


//    public int insert(int id, int hashFunc){}   ////// continue




}
