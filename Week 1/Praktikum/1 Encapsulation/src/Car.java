public class Car {
    public String brand;
    public String model;
    public int ukuranMesin;

    public Car(String brand, String model, int ukuranMesin){
        this.brand = brand;
        this.model = model;
        this.ukuranMesin = ukuranMesin;
    }

    public Car(){

    }

    public void StartEngine(){
        System.out.println(this.brand + " model " + this.model + " is starting");
    }

    public int CurrentSpeed(int speed){
        speed+=speed + 10;
        return speed;
    }

    public double AverageSpeed(double[] speed){
        double rerataKecepatan = 0;
        double total = 0;
        for (int i=0; i<speed.length; i++){
            total = total + speed[i];
        }
        rerataKecepatan = total / speed.length;
        return rerataKecepatan;
    }

    public void DisplayCar(){
        System.out.println("This is " + this.brand + " model " + this.model);
    }
}
