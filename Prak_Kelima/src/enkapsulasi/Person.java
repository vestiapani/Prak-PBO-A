package enkapsulasi;

public class Person {
    private String nama;
    private int umur;
    private String alamat;

   public void setNama(String nama) {
    this.nama = nama;
   }

   public String getNama() {
    return nama;
   }

   public void setUmur(int umur) {
    this.umur = umur;
   }

   public int getUmur() {
    return umur;
   }

   public void setAlamat(String alamat) {
    this.alamat = alamat;
   }

   public String getAlamat() {
    return alamat;
   }
}
