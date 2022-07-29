class Product{
    public String title;
    public String code;
    public String brand;
    public double price;

    Product(String title, String code, String brand, double price){
        this.title = title;
        this.code = code;
        this.brand = brand;
        this.price = price;
    }
}

class Invoice{
    Product product;
    int quantity;
    double discount;
    double tax;
    double total;

    public Invoice(Product product, int quantity, double discount, double tax){
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.tax = tax;
        // Lengkapi variable total dibawah ini.
        //this.total = 
    }

    public double CalculateTotal(){
        double price = ((product.price - product.price * (discount / 100)) * this.quantity);
        double priceWithTaxes = price * (1 + (this.tax / 100));
        return priceWithTaxes;
    }

    /// kode diberi komentar di bawah ini adalah yang yang salah akan memasukkan semua fungsi kedalam satu kelas.
    /// seharusnya fungsi2 yang tidak sesuai dengan kelasnya, dibuat sesuai dengan kelasnya

    // public void printInvoice() {
    //     // print functions
    // }
}

//printing dipisah classnya

class InvoicePrinter{
    Invoice invoice;

    InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void Print(){
        // Ubah kode printing invoice agar menampilkan kode dan brand produk.
        System.out.println("--------------------------------------------");
        System.out.printf("Invoice for %n Product : %s %n Qty: %d %n Discount: %.0f%% %n Tax: %.0f%% %n Total: %.2f %n", invoice.product.title, invoice.quantity, invoice.discount, invoice.tax, invoice.total);
        System.out.println("--------------------------------------------");
    }

}