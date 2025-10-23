package com.inheritance;
public class App {
    public static void main(String[] args) throws Exception {
        Karyawan Ridho = new Karyawan("12345", "Ridho");
        Karyawan Melan = new Karyawan("12346", "Melan");
        Ridho.getInfo();
        System.out.println("\n");
        Melan.getInfo();
        System.out.println("================");
        Ridho.absenPagi();
        Ridho.kerja();
        System.out.println("\n");
        Melan.absenPagi();
        Melan.kerja();
        System.out.println("=================");
        Ridho.absenPulang();
        Melan.absenPulang();
        System.out.println("=================");

        Dosen Andiani = new Dosen ("23455", "332211", "Andiani");
        Dosen Ionia = new Dosen ("23456", "332212", "Ionia");
        Andiani.getInfo();
        System.out.println("\n");
        Ionia.getInfo();
        System.out.println("=================");
        Andiani.absenPagi();
        Andiani.ngajar();
        System.out.println("\n");
        Ionia.absenPagi();
        Ionia.kerja();
        System.out.println("=================");
        Ionia.absenPulang();
        Andiani.absenPulang();
        System.out.println("=================");
    }
}
