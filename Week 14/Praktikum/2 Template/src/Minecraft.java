public class Minecraft extends Game {
    boolean _initialized;

    public Minecraft(){
        _initialized = false;
    }

    @Override
    void Initialize() {
        this._initialized = true;
        System.out.printf("Intializing %s. Loading world...%n", this.getClass().getName());
    }

    @Override
    void StartPlay() {
        if (this._initialized){
            System.out.println("World ready. Starting game");
        }
        else{
            System.out.println("Please initialize the game before starting");
        }
    }

    @Override
    void EndPlay() {
        System.out.println("Quitting game");
        this._initialized = false;
    }
}
