class Mouse implements IPeripheral {
    @Override
    public void ConnectToPc() {
        System.out.println("Mouse terhubung ke PC");
    }
}

class Keyboard implements IPeripheral{
    @Override
    public void ConnectToPc() {
        System.out.println("Keyboard terhubung ke PC");
    }
}

class WirelessMouse implements IPeripheral{
    @Override
    public void ConnectToPc() {
        System.out.println("Wireless mouse terhubung ke PC");
    }
}

class NoDeviceFound implements IPeripheral{
    @Override
    public void ConnectToPc() {
        System.out.println("Device anda tidak ditemukan, pastikan nama device benar, jika device bersifat wireless, pastikan bluetooth hidup.");
    }
}
