public class Context {
    private IStrategy _strategy;
    public Context(IStrategy strategy){
        this._strategy = strategy;
    }

    public void ExecuteContext(String you, String opponenet){
        _strategy.Execute(you, opponenet);
    }
}
