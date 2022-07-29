public class App {
    public static void main(String[] args) throws Exception {
        Singleton _s1 = new Singleton();
        Singleton _s2 = new Singleton();
        String s1 = _s1.GetInstance();
        String s2 = _s2.GetInstance();

        // Kode diatas dapat disederhanakan menjadi
        // String s1 = Singleton.GetInstance();
        // String s2 = Singleton.GetInstance();

        Singleton _n1 = new Singleton();
        Singleton _n2 = new Singleton();
        String n1 = _n1.GetNonSingletonInstance();
        String n2 = _n2.GetNonSingletonInstance();

        if (s1 == s2){
            System.out.println("Singleton works, both variables contain the same instance.");
        }
        else{
            System.out.println("Singleton failed, variables contain different instances.");
        }

        if (n1 == n2){
            System.out.println("Non Singleton failed, both variables contain the same instance.");
        }
        else{
            System.out.println("Non Singleton works, variables contain different instances.");
        }
    }
}
