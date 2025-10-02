package src.com.pertemuan3;

class Mahasiswa {
    String npm;
    String nama;
    String jurusan;
    double ipk;

    Mahasiswa(String paramNama, String paramJurusan, String paramNpm, double paramIpk) {
        nama = paramNama;
        jurusan = paramJurusan;
        npm = paramNpm;
        ipk = paramIpk;
    }

    void tampilData() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("NPM     : " + this.npm);
        System.out.println("IPK     : " + this.ipk);
    }

}