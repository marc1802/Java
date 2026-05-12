package Ejercicios;

import java.util.Scanner;

public class Entrada {
    public static final Scanner sc = new Scanner(System.in);

    public static int leerEntero() {
        System.out.print("");
        return sc.nextInt();
    }

    public static double leerDecimal() {
        System.out.print("");
        return sc.nextDouble();
    }

    public static String leerTexto() {
        System.out.print("");
        return sc.nextLine();
    }
}
