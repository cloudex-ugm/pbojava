public class Rectangle implements IPolygon, IColor {
    public double CalculateArea(double a, double b){
        return a*b;
    }

    public void GetColor(){
        System.out.println("Persegi Berwarna Merah");
    }
}

interface IColor{
    void GetColor();
}