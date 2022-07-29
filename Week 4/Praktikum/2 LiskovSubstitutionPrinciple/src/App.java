// Without Liskov Substitution Principle 

// class Program
// {
//     static void Main(string[] args)
//     {
//         Apple apple = new Apple();
//         Console.WriteLine(apple.GetColor());
//     }
// }

/// With Liskov substitution Principle ///

public class App {
    public static void main(String[] args) throws Exception {
        Fruit fruit = new Apple();
        fruit.GetColor();
        fruit = new Orange();
        fruit.GetColor();

    }
}
