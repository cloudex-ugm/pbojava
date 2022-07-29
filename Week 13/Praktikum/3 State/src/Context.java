public class Context {
    private IState _state;

    public Context(){
        _state = null;
    }

    public void SetState(IState state){
        this._state = state;
    }

    public IState GetState(){
        return this._state;
    }
}
