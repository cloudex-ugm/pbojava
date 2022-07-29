class Mouse implements IPeripheral{
    @Override
    public void ConnectToPc(){
        System.out.println("Menghubungkan mouse ke PC");
    }
}

class Keyboard implements IPeripheral{
    @Override
    public void ConnectToPc(){
        System.out.println("Menghubungkan keyboard ke PC");
    }
}