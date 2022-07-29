public class App {
    public static void main(String[] args) throws Exception {
        IComputerPart c = new Computer();
        c.Accept(new DisplayVisitor());
    }
}
