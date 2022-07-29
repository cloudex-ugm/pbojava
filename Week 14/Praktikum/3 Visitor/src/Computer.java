public class Computer implements IComputerPart {
    IComputerPart[] parts;
    public Computer(){
        parts = new IComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void Accept(IComputerPartVisitor visitor) {
        for (var p : parts){
            p.Accept(visitor);
        }
        visitor.Visit(this);
    }
}

class Mouse implements IComputerPart{
    @Override
    public void Accept(IComputerPartVisitor visitor) {
        visitor.Visit(this);
    }
}

class Keyboard implements IComputerPart{
    @Override
    public void Accept(IComputerPartVisitor visitor) {
        visitor.Visit(this);
    }
}

class Monitor implements IComputerPart{
    @Override
    public void Accept(IComputerPartVisitor visitor) {
        visitor.Visit(this);
    }
}