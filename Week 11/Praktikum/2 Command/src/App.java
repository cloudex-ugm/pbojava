public class App {
    public static void main(String[] args) throws Exception {
        Invoker invoker = new Invoker();
        invoker.SetOnStart(new SimpleCommand("Hello World!"));
        Receiver receiver = new Receiver();
        invoker.SetOnFinish(new ComplexCommand(receiver, "Send Email", "Save Report"));
        invoker.DoSomethingImportant();
    }
}
