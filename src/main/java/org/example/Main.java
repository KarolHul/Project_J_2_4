package org.example;

public class Main {
    public static void main(String[] args) {
        Produkt jabłko = new Produkt("Jabłko",2,50);
        Produkt banan = new Produkt("Banan",3,30);
        Produkt gruszka = new Produkt("Gruszka",1,100);
        System.out.println(jabłko.toString());
        System.out.println(banan.toString());
        System.out.println(gruszka.toString());
    }
}