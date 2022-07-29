public class App {
    public static void main(String[] args) throws Exception {
        Car mobilSaya = new Car();
        mobilSaya.brand = "Mazda";
        mobilSaya.model = "RX8";
        mobilSaya.ukuranMesin = 2000;
        mobilSaya.DisplayCar();
        mobilSaya.StartEngine();

        Car mobilAnda = new Car("Toyota", "FT86", 2000);
        mobilAnda.DisplayCar();
        mobilAnda.StartEngine();

        int hasil = mobilAnda.CurrentSpeed(70);
        System.out.println("current speed " + mobilAnda.brand + " model " + mobilAnda.model + ": " + hasil);

        double[] speedArray = {40, 50, 60, 80, 70, 80, 100};

        double avg = mobilAnda.AverageSpeed(speedArray);
        System.out.println("average speed " + mobilAnda.brand + " model " + mobilAnda.model + ": " + avg);
    }
}
