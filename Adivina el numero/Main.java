import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Ingrese el número:");
        int numeroSecreto = rnd.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intento = sc.nextInt();
        int contador = 0;

        while(intento != numeroSecreto) {
            intento = sc.nextInt();
            contador++;

        
       if (intento > numeroSecreto)
                System.out.println("Demasiado alto");
            else if (intento < numeroSecreto)
                System.out.println("Demasiado bajo");
            else
                System.out.println("¡Correcto! Lo adivinaste en " + contador + " intentos");
}

        sc.close();
    }
}