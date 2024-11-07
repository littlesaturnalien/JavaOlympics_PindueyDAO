import org.kmryfv.FactorMultiplo;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        try {
            //utilitario que descomponga un numero en sus factores multiples
            //Entrada = numero entero positivo (int)
            // Salida = factores multiples
            //La salida (los factores) deben multiplicarse y dar como resultado el numero que se ingreso
            int numero;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero entero positivo: ");
            numero = scanner.nextInt();


            if (numero <= 0) {
                System.out.println("El numero debe ser positivo");
                return;
            }
            FactorMultiplo factorMultiplo = new FactorMultiplo();
            factorMultiplo.descomponer(numero);


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
