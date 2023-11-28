package es1;

import java.util.Scanner;

public class es1 {

    public static boolean oddOrEven(String string1) {
        return string1.length() % 2 == 0;
    }

    public static boolean bisestile(int year) {
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola, l'output sarà true o false a seconda della sua lunghezza, sia essa pari o dispari.");
        String wordToTest = scanner.nextLine();
        System.out.println(oddOrEven(wordToTest));
        System.out.println("Inserisci un anno, l'output sarà true se bisestile, altrimenti false.");
        int yearToTest = Integer.parseInt(scanner.nextLine());
        System.out.println(bisestile(yearToTest));
        scanner.close();
    }
}

