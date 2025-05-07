package nadelbaum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein, wie viele Zeilen der Baum groß sein soll.");
        int eingabe = scanner.nextInt();
        if (eingabe >= 1) ;

        for (int i = 0; i < eingabe; i++) {

            for (int j = 0; j < eingabe - i - 1; j++){
                System.out.print(".");
            }

            for (int k = 0; k < (2*i+1); k++){
                System.out.print("*");
            }

            for (int j = 0; j < eingabe - i -1; j++){
                System.out.print(".");
            }

            System.out.println();
        }

    }
}
