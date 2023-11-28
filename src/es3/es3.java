package es3;

import java.util.Arrays;
import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {
            System.out.println("Inserisci una stringa");
            String str = scanner.nextLine();
            if(str.equals(":q")) {
                System.out.println("Esco dal programma.");
                exit = true;
            } else {
                char[] chars = str.toCharArray();
                System.out.println(Arrays.toString(chars));
            }
        }
        scanner.close();
    }

}
