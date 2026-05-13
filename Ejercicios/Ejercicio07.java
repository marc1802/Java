package Ejercicios;

public class Ejercicio07 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int operacion;

        System.out.println("Introduce el primer numero");
        num1 = Entrada.leerEntero();
        System.out.println("Introduce el segundo numero");
        num2 = Entrada.leerEntero();

        System.out.println("Elige una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        operacion = Entrada.leerEntero();

        switch (operacion) {
            case 1 -> {
                int suma = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma);
            }
            case 2 -> {
                int resta = num1 - num2;
                System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resta);
            }
            case 3 -> {
                int multiplicacion = num1 * num2;
                System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es igual a " + multiplicacion);
            }
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    int division = num1 / num2;
                    System.out.println("La division de " + num1 + " / " + num2 + " es igual a " + division);
                }
            }
            default -> System.out.println("El numero no corresponde a ninguna opcion");
        }
    }
}
