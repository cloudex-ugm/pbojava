import java.beans.Expression;

public class App {
    public static void main(String[] args) throws Exception {
        String _bapak = "Agus Bejo";
        String _ibu = "Susi Bejo";
        String _anak = "Timmy Bejo";
        String _tetangga = "Bambang Salim";

        IExpression bapak = new ContainsExpression(_bapak);
        IExpression ibu = new ContainsExpression(_ibu);
        IExpression anak = new ContainsExpression(_anak);
        IExpression tetangga = new ContainsExpression(_tetangga);

        IExpression keluarga_bejo = new ContainsExpression("Bejo");
        IExpression menikah = new AndExpression(bapak, ibu);

        System.out.println(keluarga_bejo.Interpreter(_bapak));
        System.out.println(keluarga_bejo.Interpreter(_anak));
        System.out.println(keluarga_bejo.Interpreter(_tetangga));
        System.out.println(menikah.Interpreter(String.format("%s, %s", _bapak, _ibu)));
        System.out.println(menikah.Interpreter(String.format("%s, %s", _tetangga, _ibu)));
    }
}
