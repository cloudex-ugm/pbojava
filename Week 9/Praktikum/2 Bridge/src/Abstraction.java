class Abstraction {
    protected IImplementation _implementation;
    
    public Abstraction(IImplementation implementation){
        this._implementation = implementation;
    }

    public String Operation(){
        return "Abstract: Base operation with: " + _implementation.OperationImplementation();
    }
}
