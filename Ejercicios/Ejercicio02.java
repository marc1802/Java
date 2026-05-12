
public class Ejercicio02 {
    public static void main(String[] args) {
        
     

        int num1 = 0;
        int num2 = 0;


        System.out.println("Introduce un primer numero:");
         num1 = Entrada.sc.nextInt();
         System.out.println("Introduce un segundo numero");
         num2 = Entrada.sc.nextInt();

         int suma= num1+num2;
         System.out.println("La Suma de los dos numeros es " +suma);
         int resta = num1-num2;
         System.out.println("La resta de los dos numeros es " + resta);
         int multi = num1*num2;
         System.out.println("La resta de los dos numeros es " + multi);
        int division = num1/num2;
        System.out.println("La division de los dos numeros es " + division);
        int resto = num1%num2;
        System.out.println("La resta de los dos numeros es " + resto);
    }
}