public abstract class Game{
    abstract void Initialize();
    abstract void StartPlay();
    abstract void EndPlay();

    //template method untuk game
    public final void Play(){
        Initialize();
        StartPlay();
        EndPlay();
    }
}
