import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         double Celsius,resultado;
         Scanner teclado = new Scanner(System.in);

         System.out.print("Coloque o valor em graus Celsius °C: ");
         Celsius = teclado.nextDouble();
         teclado.close();

         resultado = (Celsius * 9/5) +32;

         System.out.printf("O valor em graus Fahrenheit eh: %.1f °F",resultado);
    }
}
