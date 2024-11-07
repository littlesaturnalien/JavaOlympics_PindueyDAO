package org.kmryfv.models;

public class FactorMultiple {
    private int num;

    public FactorMultiple(int num) {
        this.num = num;
    }

    public void factoresMultiples() {
        if (this.num > 0) {
            System.out.println(1);
            int i = 2;
            while (i <= this.num) {
                if (this.num % i == 0) {
                    System.out.println(i);
                    this.num = this.num / i;
                } else {
                    i++;
                }
            }
        } else {
            System.out.println("El número debe ser positivo o distinto de 0.");
        }
    }
}
