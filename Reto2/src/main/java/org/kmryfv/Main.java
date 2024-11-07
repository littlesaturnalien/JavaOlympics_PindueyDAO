package org.kmryfv;

import org.kmryfv.models.NumeroInverso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Ingresa el número a invertir: ");
        num = scanner.nextInt();
        NumeroInverso numeroInverso = new NumeroInverso(num);
        numeroInverso.invertirNumero();
    }
}