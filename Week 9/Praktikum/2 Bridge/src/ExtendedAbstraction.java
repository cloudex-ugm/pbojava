class ExtendedAbstraction extends Abstraction {

    public ExtendedAbstraction(IImplementation implementation){
        super(implementation);
    }

    public String Operation(){
        return "ExtendedAbstraction: Extend operation with: " + super._implementation.OperationImplementation();
    }
}
