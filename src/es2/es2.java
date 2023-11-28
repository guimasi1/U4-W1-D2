package es2;

import java.util.Scanner;

public class es2 {
    public static void printNumber(int num) {
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore: questo numero non è fra 0 e 3.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3.");
        int num = Integer.parseInt(scanner.nextLine());
        printNumber(num);
        scanner.close();
    }

}
