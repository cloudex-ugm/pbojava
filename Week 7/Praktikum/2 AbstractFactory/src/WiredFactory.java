public class WiredFactory extends AbstractFactory {
    @Override
    IPeripheral Connect(String peripheral) {
        switch (peripheral.toLowerCase()){
            case "mouse":
                return new Mouse();
            case "keyboard":
                return new Keyboard();
            default:
                return new NoDeviceFound();
        }
    }

    @Override
    void TurnOnBluetooth() {
        System.out.println("Wired Device tidak menggunakan bluetooth");
    }
}
