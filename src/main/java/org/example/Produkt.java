package org.example;

public class Produkt {
    String nazwa;
    int cena,ilość;

    public Produkt(String nazwa, int cena, int ilość) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilość = ilość;
    }
    @Override
    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "Nazwa | "+this.nazwa+newLine+"Cena | "+this.cena+newLine+"Ilość | "+this.ilość;
    }
}
