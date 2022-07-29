class Client {
    public void ClientCode(Component leaf){
        System.out.printf("RESULT: %s %n", leaf.Operation());
    }
    
    public void ClientCode2(Component component1, Component component2){
        if (component1.IsComposite()){
            component1.Add(component2);
        }
        System.out.printf("RESULT: %s %n", component1.Operation());
    }
}
