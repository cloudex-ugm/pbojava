public class App {
    public static void main(String[] args) throws Exception {
        ISiCepat kurir = new Mediator();

        Tujuan tujuan1 = new Paket(kurir, "Agus Bejo", "Jakarta");
        kurir.Tujuan(tujuan1);
        tujuan1.KirimPaket("Mouse Logitech", "Agus Bejo");
    }
}
