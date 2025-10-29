public class Kendaraan {
    // === Properti ===
    private String pNama;
    private String pJenis;
    protected int pKecepatan;
    protected int pKapasitas;
    public String pWarna;
    public String pBahanBakar;
    private float pHarga;
    private boolean pStatus;
    protected String pPlatNomor;
    public int pTahun;

    // === Constructor ===
    public Kendaraan(String nama, String jenis, int kecepatan, int kapasitas, String warna, String bahan, float harga, boolean status, String plat, int tahun) {
        this.pNama = nama;
        this.pJenis = jenis;
        this.pKecepatan = kecepatan;
        this.pKapasitas = kapasitas;
        this.pWarna = warna;
        this.pBahanBakar = bahan;
        this.pHarga = harga;
        this.pStatus = status;
        this.pPlatNomor = plat;
        this.pTahun = tahun;
    }

    // === Method ===
    public void tampilInfo() {
        System.out.println("=== Data Kendaraan ===");
        System.out.println("Nama: " + pNama);
        System.out.println("Jenis: " + pJenis);
        System.out.println("Kecepatan: " + pKecepatan + " km/jam");
        System.out.println("Kapasitas: " + pKapasitas + " orang");
        System.out.println("Warna: " + pWarna);
        System.out.println("Bahan Bakar: " + pBahanBakar);
        System.out.println("Harga: " + pHarga + "$");
        System.out.println("Status: " + (pStatus ? "Aktif" : "Non-aktif"));
        System.out.println("Plat Nomor: " + pPlatNomor);
        System.out.println("Tahun: " + pTahun);
    }

    public void nyalakan() { System.out.println(pNama + " dinyalakan."); }

    public void matikan() { System.out.println(pNama + " dimatikan."); }

    public void ubahKecepatan(int kecepatanBaru) {
        this.pKecepatan = kecepatanBaru;
        System.out.println("Kecepatan diubah menjadi: " + kecepatanBaru + " km/jam");
    }

    public double hitungPajak() {
        return 0.05 * pHarga;
    }

    // === Overloading ===
    public double hitungPajak(double persen) {
        return (persen / 100) * pHarga;
    }

    // === Getter dan Setter ===
    public double getHarga() { return pHarga; }
    public void setHarga(float harga) { this.pHarga = harga; }

    public boolean isAktif() { return pStatus; }
    public void setStatus(boolean status) { this.pStatus = status; }
}
