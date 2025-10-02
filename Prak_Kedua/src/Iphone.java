public class Iphone {
    String color;
    String storage;
    
    public void nyala(){
        System.out.println("Iphone warna : " + this.color + "Menyala.");
    }

    public void mati(){
        System.out.println("Iphone Warna : " + this.color + "Mati.");
    }

    public void berderding(){
        System.out.println("Iphone Warna : " + this.color + "Berdering.");
    }

    public void memori(){
        System.out.println("Memori Iphone Warna " + this.color + "Sebesar : " + this.storage + "GB");
    }
}