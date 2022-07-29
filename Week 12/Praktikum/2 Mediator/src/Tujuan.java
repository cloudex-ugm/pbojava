public abstract class Tujuan {
    private ISiCepat _mediator;

    private String _penerima;
    private String _alamat;

    public Tujuan(ISiCepat kurir, String penerima, String alamat){
        this._mediator = kurir;
        this._penerima = penerima;
        this._alamat = alamat;
    }

    public abstract void KirimPaket(String paket, String penerima);
    public abstract void TerimaPaket();

    public ISiCepat getMediator(){
        return _mediator;
    }

    public String getPenerima(){
        return _penerima;
    }

    public String getAlamat(){
        return _alamat;
    }
}
