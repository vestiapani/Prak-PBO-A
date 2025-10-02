package src.com.pertemuan3;

class Pegawai {
    public String nama;
    public String npwp;
    protected String matakuliah;

    Pegawai(String paramNama, String paramnpwp, String paramMatakuliah) {
        nama = paramNama;
        npwp = paramnpwp;
        matakuliah = paramMatakuliah;
    }

    public void tampilData(){
        System.out.println("Nama    : " + nama);
        System.out.println("NPWP    : " + npwp);
        System.out.println("Mata Kuliah    : " + matakuliah);
    }

    private void mengajar(){
        System.out.println("Dosen" + nama + "Sedang Mengajar" + matakuliah);
    }

    protected void istirahat(){
        System.out.println("Dosen" + nama + "Sedang Istirahat");
    }
    
}
