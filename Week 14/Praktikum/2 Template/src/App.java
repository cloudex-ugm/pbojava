public class App {
    public static void main(String[] args) throws Exception {
        Game pokemon = new Pokemon();
        Game minecraft = new Minecraft();
        // Menjalankan fungsi initialize, startplay dan endplay sekaligus dengan template Game
        pokemon.Play();
        System.out.printf("\n");
        minecraft.Play();
    }
}
