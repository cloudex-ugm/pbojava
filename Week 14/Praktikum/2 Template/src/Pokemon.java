public class Pokemon extends Game {
    @Override
    void Initialize(){
        System.out.printf("Initializing game %s%n", this.getClass().getName());
    }

    @Override
    void StartPlay() {
        System.out.printf("%s game started%n", this.getClass().getName());
    }

    @Override
    void EndPlay() {
        System.out.printf("Game ended. exiting %s game%n", this.getClass().getName());
    }
}
