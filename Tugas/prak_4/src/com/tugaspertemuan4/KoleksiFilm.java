package com.tugaspertemuan4;


import java.util.ArrayList;
import java.util.Scanner;

public class KoleksiFilm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> koleksiFilm = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n===== MENU KOLEKSI FILM =====");
            System.out.println("1. Tambah Film");
            System.out.println("2. Tampilkan Koleksi Film");
            System.out.println("3. Hapus Film");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul film: ");
                    String film = input.nextLine();
                    koleksiFilm.add(film);
                    System.out.println("Film berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n===== DAFTAR KOLEKSI FILM =====");
                    if (koleksiFilm.isEmpty()) {
                        System.out.println("Belum ada film dalam koleksi.");
                    } else {
                        for (int i = 0; i < koleksiFilm.size(); i++) {
                            System.out.println((i + 1) + ". " + koleksiFilm.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===== HAPUS FILM =====");
                    if (koleksiFilm.isEmpty()) {
                        System.out.println("Tidak ada film untuk dihapus.");
                    } else {
                        for (int i = 0; i < koleksiFilm.size(); i++) {
                            System.out.println((i + 1) + ". " + koleksiFilm.get(i));
                        }
                        System.out.print("Pilih nomor film yang ingin dihapus: ");
                        int nomor = input.nextInt();
                        input.nextLine();

                        if (nomor >= 1 && nomor <= koleksiFilm.size()) {
                            koleksiFilm.remove(nomor - 1);
                            System.out.println("Film berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program Koleksi Film!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
