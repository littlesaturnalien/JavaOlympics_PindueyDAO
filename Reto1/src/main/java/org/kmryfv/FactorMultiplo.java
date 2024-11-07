package org.kmryfv;


public class FactorMultiplo {
    public void descomponer(int numero) {
        if (numero <= 0) {
            System.out.println("El numero debe ser positivo");
            return;
        }
        //La salida (los factores) deben multiplicarse y dar como resultado el numero que se ingreso
        //Por ejemplo: 28 = 1, 2, 2, 7 = 1 x 2 x 2 x 7 = 28
        int i = 2;
        while (i <= numero) {
            if (numero % i == 0) {
                System.out.println(i);
                numero = numero / i;
            } else {
                i++;
            }
        }
    }


}
