package org.kmryfv;

import org.kmryfv.models.FactorMultiple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int numero;
            System.out.println("Ingrese un numero entero positivo: ");
            numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("El numero debe ser positivo");
                return;
            }
            FactorMultiple factorMultiplo = new FactorMultiple(numero);
            factorMultiplo.factoresMultiples();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}