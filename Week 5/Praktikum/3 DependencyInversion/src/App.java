public class App {
    public static void main(String[] args) throws Exception {
        // Pada kode ini DataAccessLogic kita anggap sebagai Database program kita.
        // BusinessLogic akan menjadi jembatan antara interface (Class App) dengan DatabaseLogic.
        // Buat kode yang dapat menampilkan data employee pada output terminal.
        // ID yang valid adalah 1 dan 2;
        EmployeeBusinessLogic businessLogic = new EmployeeBusinessLogic();
    }
}
