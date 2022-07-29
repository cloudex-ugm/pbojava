public class App {
    public static void main(String[] args) throws Exception {

        Order order1 = new Order(100000, 1, 10, "Mouse Logitech");
        Order order2 = new Order(400000, 1, 15, "Keyboard Steelseries");
        Subscription subs1 = new Subscription(70000, "1 Januari 2022", "1 Februari 2022", "Subsctiption Netflix");

        Order[] orderList = {order1, order2};
        Subscription[] subsList = {subs1};

        InvoiceGenerator generator = new InvoiceGenerator();
        generator.Generate(orderList, subsList);
    }
}
