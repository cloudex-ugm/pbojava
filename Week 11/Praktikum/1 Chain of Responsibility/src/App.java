public class App {
    public static void main(String[] args) throws Exception {
        RoleVerification super_user = new FullClearance(null);
        RoleVerification contributor = new PartialClearance(null);
        RoleVerification anonim = null;

        // Skenario testing:
        // 1.Super user dapat mengakses semua clearance
        // 2.Contributor dapat mengakses partial clearance
        // 3.Anonim tidak mendapatkan clearance

        System.out.println("Testing super user di partial clearance");
        var clearanceStatus1 = new PartialClearance(super_user);
        System.out.printf("User verification status : %s %n %n", clearanceStatus1.isVerified(super_user));

        System.out.println("Testing contributor di full clearance");
        var clearanceStatus2 = new FullClearance(contributor);
        System.out.printf("User verification status : %s %n %n", clearanceStatus2.isVerified(contributor));

        System.out.println("Testing anonim di partial clearance");
        var clearanceStatus3 = new PartialClearance(anonim);
        System.out.printf("User verification status : %s %n %n", clearanceStatus3.isVerified(anonim));

    }
}
