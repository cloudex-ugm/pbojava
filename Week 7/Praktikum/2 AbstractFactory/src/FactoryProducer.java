public class FactoryProducer {
    public static AbstractFactory getFactory(boolean wired){
        if (wired){
            return new WiredFactory();
        }
        else{
            return new WirelessFactory();
        }
    }
}
