public class App {
    public static void main(String[] args) throws Exception {
        Product mouse = new Product("Mouse Logitech", "LOG-01", "Logitech", 100000);
        Invoice invoice1 = new Invoice(mouse, 1, 10, 5);
        InvoicePrinter printInvoice1 = new InvoicePrinter(invoice1);
        printInvoice1.Print();

        Product keyboard = new Product("Keyboard Steelseries", "STL-03", "Steelseties", 400000);
        // Print invoice keyboard steelseries dengan quantity: 2, discount 15% dan tax 10%
    }
}
