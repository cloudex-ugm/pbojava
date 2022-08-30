public class App {
    public static void main(String[] args) throws Exception {
        HeavyTask task = new HeavyTask();

        // Proses initial task hanya perlu dilakukan 1x, process-process selanjutnya tidak perlu lagi melakukan inisiasi
        task.Process();
        task.Process();
        task.Process();
    }
}
