class ContainsExpression implements IExpression{
    String _data;

    public ContainsExpression(String data){
        this._data = data;
    }

    public boolean Interpreter(String expression){
        if (expression.contains(_data)){
            return true;
        }
        else{
            return false;
        }
    }
}

class AndExpression implements IExpression{
    IExpression _ex1;
    IExpression _ex2;
    
    public AndExpression(IExpression ex1, IExpression ex2){
        this._ex1 = ex1;
        this._ex2 = ex2;
    }

    public boolean Interpreter(String expression){
        return _ex1.Interpreter(expression) && _ex2.Interpreter(expression);
    }
}