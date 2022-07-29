public class App {
    public static void main(String[] args) throws Exception {
        Context c = new Context();
        Shooting shoot = new Shooting();
        Aiming aim = new Aiming();
        Reloading reload = new Reloading();

        shoot.Action(c);
        reload.Action(c);
        shoot.Action(c);
        aim.Action(c);
        shoot.Action(c);
    }
}
