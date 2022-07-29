/// Without Interface Segregation Principle
// public class HPLaserJetPrinter : IPrinterTasks
// {
//     public void Print(string PrintContent)
//     {
//         Console.WriteLine("Print Done");
//     }

//     public void Scan(string ScanContent)
//     {
//         Console.WriteLine("Scan content");
//     }

//     public void Fax(string FaxContent)
//     {
//         Console.WriteLine("Fax Content");
//     }

//     public void PrintDuplex(string PrintDuplexContent)
//     {
//         Console.WriteLine("Print Duplex content");
//     }
// }

// With Interface Segregation Principle

public class HPLaserJetPrinter implements IPrinterTask, IFaxTask, IPrintDuplexTask {
    public void Print(String PrintContent){
        System.out.println("Print Dode");
    }

    public void Scan(String ScanContent){
        System.out.println("Scan Content");
    }

    public void Fax(String FaxContent){
        System.out.println("Fax Content");
    }

    public void PrintDuplex(String PrintDuplexContent){
        System.out.println("Print Duplex Content");
    }
}
