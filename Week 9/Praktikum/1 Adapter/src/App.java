public class App {
    public static void main(String[] args) throws Exception {
        IMouse logitech = new Logitech(400000);
        IUsdAdapter logitechForeign = new ForeignAdapter(logitech);

        System.out.printf("Harga logitech dalam negri : IDR %d %n", logitech.GetHarga());
        System.out.printf("Harga logitech luar negri : USD %d %n" , logitechForeign.GetHargaForeign());
    }
}
