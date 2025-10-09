package com.pertemuan4.Kasir;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KASIR ===");

        System.out.print("Masukkan nama pembeli : ");
        String nama = scanner.nextLine();
        

        System.out.print("Masukkan Nama Produk :");
        String produk = scanner.nextLine();
        

        System.out.print("Masukkan Harga Produk: ");
        float harga = scanner.nextFloat();
        

        System.out.print("Masukkan Jumlah Produk: ");
        int jumlah = scanner.nextInt();

        float total = harga * jumlah;
        
        //Output Hasil
        System.out.println("=== STRUK PEMBELIAN ===");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Nama Produk: " + produk);
        System.out.println("Harga per Produk: " + harga);
        System.out.println("Jumlah Barang yang Dibeli : " + jumlah);
        System.out.println("Total Harga : " + total);
    }
}
