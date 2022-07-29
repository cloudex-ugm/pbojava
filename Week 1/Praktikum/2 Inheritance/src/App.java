public class App {
    public static void main(String[] args) throws Exception {
        Minuman airPutih = new Minuman("Air Putih", 1000);
        Minuman airEs = new Minuman("Air Es", 1500);

        Kopi arabica = new Kopi("Espresso", "Arabica", 6000);
        Kopi robusta = new Kopi("Espresso", "Robusta", 7000);
        Kopi esKopiSusu = new Kopi("Es Kopi Susu", "Robusta", 6500);
        esKopiSusu.RoastKopi();
        esKopiSusu.RasaMinuman();

        Minuman a = esKopiSusu;
        a.RasaMinuman();

        NonKopi Susu = new NonKopi("Susu", "Vanilla/Coklat/Cookies/Strawberri", 7500);
        NonKopi Sirup = new NonKopi("Sirup", "Leci/Mangga/Jeruk/Melon/Strawberry/Mocca", 5000);
        Sirup.AddTopping();

        System.out.println("Selamat Datang di Warung Kopi Hitam Manis");
        System.out.println("------------------------------");
        System.out.println("Menu :");
        System.out.printf("%s : Rp %d %n", airPutih.Nama, airPutih.Harga);
        System.out.printf("%s : Rp %d %n", airEs.Nama, airEs.Harga);

        System.out.printf("%s - %s : Rp %d %n", arabica.Nama, arabica.JenisKopi, arabica.Harga);
        System.out.printf("%s - %s : Rp %d %n", robusta.Nama, robusta.JenisKopi, robusta.Harga);
        System.out.printf("%s - %s : Rp %d %n", esKopiSusu.Nama, esKopiSusu.JenisKopi, esKopiSusu.Harga);

        System.out.printf("%s Rasa %s : Rp %d %n", Susu.Nama, Susu.Rasa, Susu.Harga);
        System.out.printf("%s Rasa %s : Rp %d %n", Sirup.Nama, Sirup.Rasa, Sirup.Harga);
        System.err.println("------------------------------");
    }
}
