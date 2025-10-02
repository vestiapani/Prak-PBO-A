public class kuis {
    public static void main(String[] args) throws Exception {
        mobil mobil1 = new mobil();
        mobil mobil2 = new mobil();

        mobil1.color = "Ocean Blue ";
        mobil2.color = "Mystic Purple ";
        mobil1.type = "SUV ";
        mobil2.type = "Sedan ";

        mobil1.nyala();
        mobil1.mati();
        mobil1.klakson();

        mobil2.nyala();
        mobil2.mati();
        mobil2.klakson();
    }
}
