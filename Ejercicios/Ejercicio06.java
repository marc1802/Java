
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 3;     
       int num2 = 2;
       int num3  = 1; 

       num1 = sc.nextInt();
       num2 = sc.nextInt();
       num3 = sc.nextInt();
       
       if(num1 > num2 && num1 > num3){
        System.out.println("Numero 1 es el mayor");
       }else if (num2 > num3 && num2 > num1) {
           System.out.println("El numero 2 es mayor");
       }else {
        System.out.println("El numero 3 es el mayor");
       }
    }
}
