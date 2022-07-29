class ConcreteCreator1 extends Creator {
    public IProduct FactoryMethod(){
        return new ConcreteProduct1();
    }
}

class ConcreteCreator2 extends Creator {
    public IProduct FactoryMethod(){
        return new ConcreteProduct2();
    }
}
