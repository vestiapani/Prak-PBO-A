package enkapsulasi;

public class App {
    public static void main(String[] args) throws Exception {
        Animal KUCING = new Animal();

        KUCING.setNamaHewan("Kucing");
        KUCING.setUmurKucing(2);

        System.out.println(KUCING.getNamaHewan() + " " + KUCING.getUmurKucing() + " tahun sedang bermain");
        System.out.println();
    }


}
