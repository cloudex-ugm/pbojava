import java.util.Map;
import java.util.HashMap;

public class Mediator implements ISiCepat {

    private Map<String, Tujuan> dataPaket = new HashMap<>();

    @Override
    public void KirimPaket(String paket, String penerima){
        Tujuan t = dataPaket.get(penerima);
        t.TerimaPaket();
    }

    @Override
    public void Tujuan(Tujuan tujuan){
        this.dataPaket.put(tujuan.getPenerima(), tujuan);
    }
}
