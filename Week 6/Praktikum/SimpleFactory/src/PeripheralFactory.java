public class PeripheralFactory {
    public IPeripheral createFactory(String peripheral){
        switch (peripheral.toLowerCase()){
            case "mouse":
                return new Mouse();
            case "keyboard":
                return new Keyboard();
            default:
                return null;
        }
    }
}
