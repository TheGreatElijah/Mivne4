package MivneFourPackage;

public class HashOpen {
    private LinkedList[] array_of_hall;

    private int m = 11;  //// size = like the

    public HashOpen(){
        this.array_of_hall = new LinkedList[this.m];  /////  the table of the people in the hall
    }

    public int getM() { return this.m; }
    public LinkedList[] getArray_of_hall() { return this.array_of_hall; }




}
