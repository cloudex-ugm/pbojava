public class App {
    public static void main(String[] args) throws Exception {
        AbstractFactory wiredFactory = FactoryProducer.getFactory(true);
        AbstractFactory wirelessFactory = FactoryProducer.getFactory(false);

        IPeripheral peripheral1 = wiredFactory.Connect("mouse");
        IPeripheral peripheral2 = wirelessFactory.Connect("wirelessmouse");

        peripheral1.ConnectToPc();
        peripheral2.ConnectToPc();

        wirelessFactory.TurnOnBluetooth();
        IPeripheral peripheral3 = wirelessFactory.Connect("wirelessmouse");
        peripheral2.ConnectToPc();
        peripheral3.ConnectToPc();
    }
}
