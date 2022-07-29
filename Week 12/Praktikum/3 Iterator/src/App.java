public class App {
    public static void main(String[] args) throws Exception {
        var collection = new WordsCollection();
        collection.AddItem("First");
        collection.AddItem("Second");
        collection.AddItem("Third");

        System.out.println("Straigth traversal: ");
        for (var element : collection.getItems()){
            System.out.println(element);
        }

        System.out.println("Reverse Traversal: ");
        collection.ReverseDirection();

        for (var element : collection.getItems()){
            System.out.println(element);
        }
    }
}
