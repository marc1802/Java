public class Ejercicio04 {
    public static void main(String[] args) {
            int num = Entrada.leerEntero();

            if(num <0){
                System.out.println("Es Menor que cero");
            } 
            else if (num == 0) {
                System.out.println("Es igual a 0");
            }
            else {
                System.out.println("Es mayor a 0");
            }
        }
}
