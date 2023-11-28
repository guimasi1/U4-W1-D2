package es4;

import java.util.Scanner;

public class es4 {

    public static void counter(int num) {
        for(int i = num; i >= 0; i--) {
            System.out.println(num);
            num--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire un numero intero.");
        int num = Integer.parseInt(scanner.nextLine());
        counter(num);
        scanner.close();
    }
}
