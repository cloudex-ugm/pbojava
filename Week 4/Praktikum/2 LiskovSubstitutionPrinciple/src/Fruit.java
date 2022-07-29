import java.util.Hashtable;

// Without Liskov Substitution Principle 

// public class Apple
// {
//     public virtual string GetColor()
//     {
//         return "Red";
//     }
// }

// public class Orange: Apple{
//     public override string GetColor()
//     {
//         return "Orange";
//     }
// }

/// With Liskov substitution Principle ///

public abstract class Fruit{
    abstract void GetColor();
    public Hashtable<String, String> fruitColorDict = new Hashtable<String, String>();

    Fruit(){
        fruitColorDict.put("Apple", "Merah");
        fruitColorDict.put("Orange", "Orange");
        fruitColorDict.put("Banana", "Kuning");
    }
}

class Apple extends Fruit{
    void GetColor(){
        String buah = this.getClass().getName();
        System.out.printf("Buah %s berwarna %s %n", buah, fruitColorDict.get(buah));
    }
}

class Orange extends Fruit{
    void GetColor(){
        String buah = this.getClass().getName();
        System.out.printf("Buah %s berwarna %s %n", buah, fruitColorDict.get(buah));
    }
}