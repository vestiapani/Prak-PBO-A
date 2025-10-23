package com.Overriding;

public class Main {
    public static void main(String[] args){
        bangunDatar BangunDatar = new bangunDatar();
        Lingkaran el = new Lingkaran(7);

        BangunDatar.luas();
        BangunDatar.keliling();

        System.out.println("Luas Lingkaran: " + el.luas());
        System.out.println("Keliling Lingkaran: " + el.keliling());
    }
    
}
