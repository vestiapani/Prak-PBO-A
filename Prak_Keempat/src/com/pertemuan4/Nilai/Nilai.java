package com.pertemuan4.Nilai;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Nilai ===");

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = scanner.nextInt();

        double[]nilai = new double[jumlah];


        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        //total nilai
        double totalNilai = 0;
        for (int i = 0; i < jumlah; i++) {
            totalNilai+= nilai[i];
        }

        double avg = totalNilai / jumlah;

        System.out.println("\n=== Nilai Mahasiswa ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + ": " + nilai[i]);
        }
        System.out.println("Nilai Rata-Rata Mahasiswa: " + avg);

    }
}
