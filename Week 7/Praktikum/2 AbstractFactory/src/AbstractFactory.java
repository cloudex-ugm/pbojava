public abstract class AbstractFactory {
    abstract IPeripheral Connect(String peripheral);
    abstract void TurnOnBluetooth();
}