public class Minuman {
    public String Nama;
    public int Harga;

    public Minuman(String Nama, int Harga){
        this.Nama = Nama;
        this.Harga = Harga;
    }

    public Minuman(){

    }

    public void DisplayMinuman(){

    }

    protected void IsMinuman(){

    }

    public void RasaMinuman(){
        System.out.println("Rasa Minuman");
    }
}

class Kopi extends Minuman{
    public String JenisKopi;

    public Kopi(String Nama, String JenisKopi, int Harga){
        this.Nama = Nama;
        this.JenisKopi = JenisKopi;
        this.Harga = Harga;
    }

    public void RoastKopi(){
        IsMinuman();
    }

    public void RasaMinuman(){
        System.out.println("Didominasi rasa pahit");
    }
}

class NonKopi extends Minuman{
    public String Rasa;

    public NonKopi(String Nama, String Rasa, int Harga){
        this.Nama = Nama;
        this.Rasa = Rasa;
        this.Harga = Harga;
    }

    public void AddTopping(){

    }
}