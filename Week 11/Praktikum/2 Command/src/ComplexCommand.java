public class ComplexCommand implements ICommand {
    private Receiver _receiver;
    private String _a;
    private String _b;

    public ComplexCommand(Receiver receiver, String a, String b){
        this._receiver = receiver;
        this._a = a;
        this._b = b;
    }

    public void Execute(){
        System.out.println("ComplexCommand: Complex Stuff should be done by a receiver object");
    }
}
