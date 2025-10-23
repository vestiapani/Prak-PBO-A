package com.inheritance;

public class Karyawan {
    protected String KodeKaryawan;
    protected String nama;

    public Karyawan(String KodeKaryawan, String nama) {
        this.KodeKaryawan = KodeKaryawan;
        this.nama = nama;
    }

    public void absenPagi(){
        System.out.println(this.nama + ": Absen Pagi");
    }

    public void kerja(){
        System.out.println(this.nama + ": Sedang Bekerja");
    }

    public void absenPulang(){
        System.out.println(this.nama + ": Absen Pulang");
    }
    
    public void getInfo(){
        System.out.println("Nama Karyawanan: " + this.nama);
        System.out.println("Kode Karyawan: " + this.KodeKaryawan);
    }
}
