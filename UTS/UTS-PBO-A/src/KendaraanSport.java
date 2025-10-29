public class KendaraanSport extends Kendaraan {
    private int pTenagaKuda;
    private String pModeMesin;

    public KendaraanSport(String nama, String jenis, int kecepatan, int kapasitas, String warna, String bahan, float harga, boolean status, String plat, int tahun, int tenagaKuda, String modeMesin) {
        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
        this.pTenagaKuda = tenagaKuda;
        this.pModeMesin = modeMesin;
    }

    // Override method tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tenaga Kuda: " + pTenagaKuda + " HP");
        System.out.println("Mode Mesin: " + pModeMesin);
    }

    public void aktifkanModeSport() {
        System.out.println("Mode Sport diaktifkan! Performa maksimal!");
    }

    public void turboBoost() {
        System.out.println("Turbo boost aktif! Kecepatan meningkat tajam!");
    }
}
