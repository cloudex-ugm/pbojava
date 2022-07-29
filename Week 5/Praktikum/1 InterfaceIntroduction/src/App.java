public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Rectangle a = new Rectangle();
        double hasil = a.CalculateArea(12, 25);
        System.out.printf("Area Persegi A adalah : 2%f %n", hasil);
        a.GetColor();

        IPolygon b = new Rectangle();
        hasil = b.CalculateArea(23, 12);
        System.out.printf("Area Persegi B adalah : 2%f", hasil);

    }
}
