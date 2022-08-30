public class App {
    public static void main(String[] args) throws Exception {
        GamingPc gamingPc = new GamingPc();
        WorkPc workPc = new WorkPc();

        Build builder1 = new Build(gamingPc);
        builder1.BuildPc();

        Pc pc1 = builder1.GetPc();
        System.out.println("PC 1 = " + pc1.GetPcSpec());

        Build builder2 = new Build(workPc);
        builder2.BuildPc();
        Pc pc2 = builder2.GetPc();
        System.out.println("PC 2 = " + pc2.GetPcSpec());
    }
}
