public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Abstraction abstraction;
        abstraction = new Abstraction(new ConcreteImplementationA());
        client.ClietCode(abstraction);

        System.out.println("");
        abstraction = new ExtendedAbstraction(new ConcreteImplementationB());
        client.ClietCode(abstraction);
    }
}
