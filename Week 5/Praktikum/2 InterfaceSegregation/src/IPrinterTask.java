/// Without Interface Segregation Principle
// public interface IPrinterTask
// {
//     void Print(string PrintContent);
//     void Scan(string ScanContent);
//     void Fax(string FaxContent);
//     void PrintDuplex(string PrintDuplexContent);
// }

/// With Interface Segregation Principle
/// Separate Fax and PrintDuplex Interface into different files

public interface IPrinterTask{
    void Print(String PrintContent);
    void Scan(String ScanContent);
}

