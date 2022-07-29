public class Paket extends Tujuan {
    public Paket(ISiCepat kurir, String penerima, String alamat){
        super(kurir, penerima, alamat);
    }

    @Override
    public void KirimPaket(String paket, String penerima){
        System.out.printf("(Notifikasi untuk pengirim): Paket %s telah dikirim ke %s %n", paket, this.getPenerima());
        getMediator().KirimPaket(paket, penerima);
    }

    @Override
    public void TerimaPaket(){
        System.out.printf("(Notifikasi untuk penerima): Paket anda telah sampai di %s %n", this.getAlamat());
    }
}
