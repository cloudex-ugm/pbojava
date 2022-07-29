public class App {
    public static void main(String[] args) throws Exception {
        GamingMouse mouse1 = new GamingMouse("Rival 650", "Steelseries");
        mouse1.Jual("Yogyakarta", 500000);

        // Kita dapat melakukan copy pada prototype mouse1 dan menset harga yang berbeda untuk mouse 2 yang memiliki lokasi penjualan yang berbeda
        GamingMouse mouse2 = (GamingMouse) mouse1.Copy();
        mouse2.Jual("Jakarta", 650000);

        System.out.printf("Harga %s %s di %s adalah %d %n", mouse1._brand, mouse1._title, mouse1._lokasiToko, mouse1._harga);
        System.out.printf("Harga %s %s di %s adalah %d %n", mouse2._brand, mouse2._title, mouse2._lokasiToko, mouse2._harga);
    }
}
