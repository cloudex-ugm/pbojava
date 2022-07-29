public class App {
    public static void main(String[] args) throws Exception {
        Computer c = new Computer("Game");
        TaskManager cpu = new UsageCpu(c);
        TaskManager ram = new UsageRam(c);
        TaskManager vga = new UsageVga(c);

        System.out.println("Computer usage when running game");
        cpu.Update();
        ram.Update();
        vga.Update();


        System.out.println("\nComputer usage when running browser");
        c.SetProgram("Browser");
        cpu.Update();
        ram.Update();
        vga.Update();
    }
}
