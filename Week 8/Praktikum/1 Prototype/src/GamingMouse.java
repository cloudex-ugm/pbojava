public class GamingMouse extends Mouse {
    // Setelah mencoba fungsi dibawah, coba tambahkan fungsi baru yang dapat menset nilai diskon yang berbeda
    // pada masing-masing lokasi dan mendapatkan harga total.

    String _title;
    String _brand;
    String _lokasiToko;
    int _harga;

    public GamingMouse(String title, String brand){
        this._title = title;
        this._brand = brand;
    }

    public void Jual(String lokasiToko, int harga){
        this._lokasiToko = lokasiToko;
        this._harga = harga;
    }

    @Override
    public Mouse Copy(){
        GamingMouse copy = new GamingMouse(this._title, this._brand);
        return copy;
    }
}
