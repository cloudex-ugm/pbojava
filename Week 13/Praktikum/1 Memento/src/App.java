public class App {
    public static void main(String[] args) throws Exception {
        Git javaProject = new Git(new LocalGit());
        javaProject.WriteCode("Code 1: Authentication Functions \n");
        javaProject.WriteCode("Code 2: Data saving functions \n");
        javaProject.CommitChanges();
        javaProject.WriteCode("Code 3: Bugs \n");
        javaProject.ViewCode();
        javaProject.UndoChanges();
        javaProject.ViewCode();
    }
}
