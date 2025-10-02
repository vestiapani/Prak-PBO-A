public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone1 = new Iphone();
        Iphone iphone2 = new Iphone();

        iphone1.color = "Ocean Blue ";
        iphone2.color = "Mystic Purple ";

        iphone1.storage = "256 ";
        iphone2.storage = "512 ";

        iphone1.nyala();
        iphone1.mati();
        iphone1.berderding();
        iphone1.memori();

        iphone2.nyala();
        iphone2.mati();
        iphone2.berderding();
        iphone2.memori();
    }
}
