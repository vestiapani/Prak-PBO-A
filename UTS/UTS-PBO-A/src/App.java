public class App {
    public static void main(String[] args) {
        System.out.println("=== KENDARAAN SPORT ===");
        KendaraanSport sport = new KendaraanSport(
            "Ferrari SF25", "Sport", 350, 2, "Merah", "Bensin", 1000000, true, "SF 25", 2025, 750, "Racing"
        );
        sport.tampilInfo();
        sport.nyalakan();
        sport.aktifkanModeSport();
        sport.turboBoost();
        System.out.println("Pajak Sport: " + sport.hitungPajak(15) + "$");

        System.out.println("\n");

        System.out.println("\n=== KENDARAAN KELUARGA ===");
        KendaraanKeluarga keluarga = new KendaraanKeluarga(
            "Toyota Alphard", "MPV", 180, 7, "Hitam", "Bensin", 80000, true, "B 99 GP", 2022, 5, true
        );
        keluarga.tampilInfo();
        keluarga.hidupkanACBelakang();
        keluarga.lipatKursiBelakang();
        System.out.println("Pajak Keluarga: " + keluarga.hitungPajak() + "$");
    }
}
