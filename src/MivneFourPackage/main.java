package MivneFourPackage;

public class main {
    public static void main(String[] args){
//        LinkedList st = Concert.getFromFile("D:\\Minvefour\\input1.txt");        ///////////////     ttteesssttt

        HashClosed hash = Concert.registerCrowd("D:\\\\Minvefour\\\\input1.txt");

        int[] arrived = Concert.reception("D:\\Minvefour\\input2.txt", hash);

//        for (int i : arrived){                /////////////////    tteesssttt
//            System.out.println(i);                       /////////////////    tteesssttt
//        }                         /////////////////    tteesssttt
//        System.out.println(arrived);            /////////////////    tteesssttt

        int avg = Concert.reception_AverageSteps("D:\\Minvefour\\input2.txt", hash);
        System.out.println("reception_AverageSteps Test: " + avg);

//        int[] steps1 = Concert.seatingArrangement(arrived, hash, 1);

//        int[] steps2 = Concert.seatingArrangement(arrived, hash, 2);

    }
}
