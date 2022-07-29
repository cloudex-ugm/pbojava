public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Leaf leaf = new Leaf();
        System.out.println("Client: I get a simple component: ");
        client.ClientCode(leaf);

        Composite tree = new Composite();
        Composite branch1 = new Composite();
        branch1.Add(new Leaf());
        branch1.Add(new Leaf());

        Composite branch2 = new Composite();
        branch2.Add(new Leaf());
        tree.Add(branch1);
        tree.Add(branch2);
        System.out.println("Client: No I've got a composite tree: ");
        client.ClientCode(tree);

        System.out.println("Client: I don't need to check the components classes even when manangeing the tree: ");
        client.ClientCode2(tree, leaf);
    }
}
