package arrayassiment;

import java.util.Scanner;

class Order {
    public static void main(String[] args) {
        int size;
        Scanner dScanner = new Scanner(System.in);
        System.out.println("\nEnter the order size: ");
        size = dScanner.nextInt();

        String[] food = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the food name " + (i + 1) + ": ");
            food[i] = dScanner.next();
        }

        System.out.println("\nInput prices: ");
        int[] prize = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter price for food " + (i + 1) + ": ");
            prize[i] = dScanner.nextInt();
            System.out.print("/-");
        }

        System.out.println("\nOutput prices: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Food " + (i + 1) + ": " + prize[i] + "/-");
        }
    }
}
