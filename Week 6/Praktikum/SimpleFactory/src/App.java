public class App {
    public static void main(String[] args) throws Exception {
        PeripheralFactory factory = new PeripheralFactory();

        //Coba hubungkan mouse ke pc;
        IPeripheral p = factory.createFactory("mouse");
        p.ConnectToPc();
    }
}
