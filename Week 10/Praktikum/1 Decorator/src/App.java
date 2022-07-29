public class App {
    public static void main(String[] args) throws Exception {
        IComputer pc = new Peripheral();
        IComputer pcWithSpeaker = new SpeakerPeripheral(new Peripheral());

        System.out.println("--------- PC 1 Peripherals ----------");
        pc.RunComputer();
        System.out.println("---------- PC 2 Peripherals -------------");
        pcWithSpeaker.RunComputer();
    }
}
