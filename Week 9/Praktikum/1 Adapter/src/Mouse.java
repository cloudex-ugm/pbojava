class Logitech implements IMouse {
    private int _harga;

    public Logitech(int hargaIdr){
        this._harga = hargaIdr;
    }

    @Override
    public int GetHarga(){
        return _harga;
    }
}

// Fungsi adapter yaitu menghubungkan dua interface berbeda.
class ForeignAdapter implements IUsdAdapter{
    private IMouse _mouse;

    public ForeignAdapter(IMouse mouse){
        _mouse = mouse;
    }

    @Override
    public int GetHargaForeign(){
        return ConvertIDRtoUSD(_mouse.GetHarga());
    }

    private int ConvertIDRtoUSD(int Idr){
        return Idr / 10000;
    }
}