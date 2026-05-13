
import Ejercicios.Entrada;

public class Ejercicio07 {
        public static void main(String[] args) {
              int num1 =0;
              int num2 =0;
              int operacion = 0;
              
              System.out.println("Introduce el primer numero");
              num1 = Entrada.leerEntero();
              System.out.println("Introduce el segundo numero");
              num2 = Entrada.leerEntero();

            switch (operacion) {
                case 1 -> {
                    int suma= num1+num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma);
                }
                case 2 -> {
                    int resta = num1 - num2;
                    System.out.println("La resta de " + num1 + " + " + num2 + " es igual a " + resta);
                }
                case 3 -> {
                    int multi = num1 * num2;
                    System.out.println("La multiplicación de " + num1 + " + " + num2 + " es igual a " + multi);
                }
                case 4 -> {
                    int dividir = num1 / num2;
                    System.out.println("La division de " + num1 + " + " + num2 + " es igual a " + dividir);
                }
                default -> System.out.println("El numero no corresponde a ninguna opción");
            }

        }
}
