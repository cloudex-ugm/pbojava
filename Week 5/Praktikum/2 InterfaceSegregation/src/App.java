public class App {
    public static void main(String[] args) throws Exception {
        // class LiquidJetPrinter hanya dapat melakukan fungsi dari interface PrinterTask
        // class HPLaserJetPrinter dapat melakukan fungsi dari interface PrinterTask, FaxTask, dan PrintDuplexTask
        // buat code yang dapat memanggil fungsi-fungsi tersebut dibawah ini.
        HPLaserJetPrinter hp = new HPLaserJetPrinter();
        LiquidInkjetPrinter inkjet = new LiquidInkjetPrinter();
    }
}
