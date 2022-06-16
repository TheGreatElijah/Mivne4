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

        int[] steps1 = Concert.seatingArrangement(arrived, hash, 1);
        System.out.println("steps1:");
        for (int stat: steps1){
            System.out.println(stat);
        }
        System.out.println("..............ended steps1");
        int[] steps2 = Concert.seatingArrangement(arrived, hash, 2);
        System.out.println("steps2:");
        for (int stat: steps2){
            System.out.println(stat);
        }
        System.out.println("..............ended steps2");

    }
}
