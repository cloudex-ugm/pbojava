class Client{
    public void Main(){
        System.out.println("App: Launched with the ConcreteCreator1.");
        ClientCode(new ConcreteCreator1());
        System.out.println("");
        System.out.println("App: Launched with the ConcreteCreator2.");
        ClientCode(new ConcreteCreator2());
    }

    public void ClientCode(Creator creator){
        System.out.println("Client: I'm not aware of the creator's class, but it still works. \n" + creator.SomeOperation());
    }
}