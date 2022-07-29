public class App {
    public static void main(String[] args) throws Exception {
        Context yourAttack = new Context(new Attacking());
        yourAttack.ExecuteContext("Fire", "Water");
        yourAttack.ExecuteContext("Fire", "Grass");

        Context opponentAttack = new Context(new Defending());
        opponentAttack.ExecuteContext("Fire", "Fire");
        opponentAttack.ExecuteContext("Fire", "Water");
    }
}
