public class DisplayVisitor implements IComputerPartVisitor {
    @Override
    public void Visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    @Override
    public void Visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }

    @Override
    public void Visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard");
    }

    @Override
    public void Visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }
}
