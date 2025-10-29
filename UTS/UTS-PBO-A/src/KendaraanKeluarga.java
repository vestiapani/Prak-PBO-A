public class KendaraanKeluarga extends Kendaraan {
    private int pJumlahPintu;
    private boolean pACBelakang;

    public KendaraanKeluarga(String nama, String jenis, int kecepatan, int kapasitas, String warna, String bahan, float harga, boolean status, String plat, int tahun, int pintu, boolean acBelakang) {
        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
        this.pJumlahPintu = pintu;
        this.pACBelakang = acBelakang;
    }

    // Override method tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah Pintu: " + pJumlahPintu);
        System.out.println("AC Belakang: " + (pACBelakang ? "Tersedia" : "Tidak Ada"));
    }

    public void hidupkanACBelakang() {
        if (pACBelakang) {
            System.out.println("AC belakang dinyalakan untuk kenyamanan penumpang.");
        } else {
            System.out.println("Mobil ini tidak memiliki AC belakang.");
        }
    }

    public void lipatKursiBelakang() {
        System.out.println("Kursi belakang dilipat untuk menambah ruang bagasi.");
    }
}
