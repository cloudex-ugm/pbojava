import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        Minuman AirPutih = new Minuman("Air Putih");
        AirPutih.Buat();
        AirPutih.Buat(true);

        Kopi Arabica = new Kopi("Kopi", "Arabica", false);
        Arabica.Buat();
        Arabica.Buat(true);

        var minuman = new ArrayList<Minuman>();
        minuman.add(new Minuman());
        minuman.add(new Sirup("Fruit Punch", "Jeruk"));
        minuman.add(new Kopi("Blended Coffee", "Arabica", false));

        //hasil yang keluar di console akan menampilkan 1 "Minuman null dibuat". 
        //ubah kode diatas sehingga minuman null menjadi minuman kopi Espresso dengan gula

        for (Iterator<Minuman> i = minuman.iterator(); i.hasNext();){
            Minuman item = i.next();
            item.Buat();
        }
    }
}
