class SimpleCommand implements ICommand {
    private String _payload = "";

    public SimpleCommand(String payload){
        this._payload = payload;
    }

    public void Execute(){
        System.out.printf("SimpleCommand: See, I can do simple things like printing (%s) %n", this._payload);
    }
}
