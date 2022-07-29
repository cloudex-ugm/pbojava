public class WirelessFactory extends AbstractFactory {
    boolean _bluetoothOn;

    @Override
    IPeripheral Connect(String peripheral) {
        if (_bluetoothOn){
            switch (peripheral.toLowerCase()){
                case "wirelessmouse":
                    return new WirelessMouse();
                default:
                    return new NoDeviceFound();
            }
        }
        else{
            return new NoDeviceFound();
        }
    }

    void TurnOnBluetooth(){
        this._bluetoothOn = true;
    }
}
