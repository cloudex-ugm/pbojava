public class Minuman{
    public String Nama;

    public Minuman(String Nama){
        this.Nama = Nama;
    }

    public Minuman(){

    }

    public void Buat(){
        System.out.printf("Minuman %s dibuat. %n", Nama);
    }

    public void Buat(boolean PakaiEs){
        String Suhu = "Dingin";
        if (!PakaiEs){
            Suhu = "Hangat";
        }

        System.out.printf("Minuman %s %s dibuat. %n", Nama, Suhu);
    }
}

class Kopi extends Minuman{
    public String JenisKopi;
    public boolean PakaiGula;
    public String Gula;

    public Kopi(String Nama, String JenisKopi, boolean PakaiGula){
        this.Nama = Nama;
        this.JenisKopi = JenisKopi;
        this.PakaiGula = PakaiGula;
        this.Gula = PakaiGula ? "dengan gula" : "tanpa gula";
    }

    public void Buat(){
        System.out.printf("Minuman %s %s %s dibuat. %n", Nama, JenisKopi, Gula);
    }

    public void Buat(boolean PakaiEs){
        String Es = "";
        if (PakaiEs){
            Es = "Es";
        }

        System.out.printf("Minuman %s %s %s %s dibuat. %n", Es, Nama, JenisKopi, Gula);
    }
}

class Sirup extends Minuman{
    public String Rasa;

    public Sirup(String Nama, String Rasa){
        this.Nama = Nama;
        this.Rasa = Rasa;
    }

    public void Buat(){
        System.out.printf("Minuman %s dengan rasa %s dibuat. %n", Nama, Rasa);
    }

    public void Buat(boolean PakaiEs){
        String Es = "";
        if (PakaiEs){
            Es = "Es";
        }

        System.out.printf("Minuman %s %s dengan rasa %s dibuat. %n", Es, Nama, Rasa);
    }

}