package main.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BiQueue bh = new BiQueue();
        System.out.println("Enter integer element to insert");
        do {
            int i = scan.nextInt();
            bh.insert(i);
            System.out.println(bh.showHeap());
        } while (true);
    }
}