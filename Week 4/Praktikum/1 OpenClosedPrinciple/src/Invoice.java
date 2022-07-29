// Misalkan ada dua jenis pembelian yang bisa dilakukan, order based dan subscrition based

class Invoice{
    public String _title;
    public double _total;

    public Invoice(String title){
        this._title = title;
    }
}

class Order extends Invoice {
    public double _harga;
    public int _qty;
    public double _discount;

    public Order(double harga, int qty, int discount, String title){
        super(title);
        this._harga = harga;
        this._qty = qty;
        this._discount = discount;
        this._total = CalculateTotal();
    }

    private double CalculateTotal(){
        return (this._harga - this._harga * (this._discount / 100)) * this._qty;
    }
}

class Subscription extends Invoice {
    public double _hargaPerBulan;
    public String _orderDate;
    public String _nextBilling;

    public Subscription(double hargaPerBulan, String orderDate, String nextBilling, String title){
        super(title);
        this._hargaPerBulan = hargaPerBulan;
        this._orderDate = orderDate;
        this._nextBilling = nextBilling;
        this._total = hargaPerBulan;
    }
}

// Contoh Method yang hanya dapat mengenerate 1 jenis invoice
// class OrderGenerator{
//     public void Generate(Order[] orders){
//         for (Order o : orders){
//             System.out.printf("Invoice for %n Order : %s %n Qty: %d %n Discount: %.0f%% %n Total: %.2f %n", o._title, o._qty, o._discount, o._total);
//             System.out.println("--------------------------------------------");
//         }
//     }
// }

// Membuat sebuah method yang dapat menghandle Invoice Order dan Invoice Subscription sekaligus
class InvoiceGenerator{
    public void Generate(Order[] orders, Subscription[] subs){
        for (Order o : orders){
            System.out.printf("Invoice for %n Order : %s %n Qty: %d %n Discount: %.0f%% %n Total: %.2f %n", o._title, o._qty, o._discount, o._total);
            System.out.println("--------------------------------------------");
        }

        // buat kode untuk mengenerate subscription invoice
    }
}