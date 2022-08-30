public class App {
    public static void main(String[] args) throws Exception {
        PcFacade pc1 = new PcFacade();
        PcFacade pc2 = new PcFacade();

        pc1.StartPcNormal();
        System.out.println(pc1.GetPcTemp());

        pc2.StartPcOverclock();
        System.out.println(pc2.GetPcTemp());
    }
}
