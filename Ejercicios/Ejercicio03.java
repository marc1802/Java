
public class Ejercicio03 {
    public static void main(String[] args) {
          System.out.println("Introduce los Grados Celsius:");
          double celsius = Entrada.leerDecimal(null);
          
          double Fahreinheit = celsius * 9 /5 +32;

          System.out.println("Hay " + celsius + "ºC" + "y " + Fahreinheit + "ºF");
    }
}
