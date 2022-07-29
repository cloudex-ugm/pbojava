class Invoker{
    private ICommand _onStart;
    private ICommand _onFinish;

    public void SetOnStart(ICommand command){
        this._onStart = command;
    }

    public void SetOnFinish(ICommand command){
        this._onFinish = command;
    }

    public void DoSomethingImportant(){
        System.out.println("Invoker: Does anybody want something done before i begin?");
        if (this._onStart != null){
            this._onStart.Execute();
        }

        System.out.println("Invoker: ... doing something really important...");
        System.out.println("Invoker: Does anybody want something done after i finnish?");
        if (this._onFinish != null){
            this._onFinish.Execute();
        }
    }
}