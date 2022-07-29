public class LocalGit{
    private StringBuilder _localCode;

    public LocalGit(){
        this._localCode = new StringBuilder();
    }

    public void AddCode(String code){
        _localCode.append(code);
    }

    public CodeEditor Commit(){
        return new CodeEditor(_localCode.toString());
    }

    public void Undo(CodeEditor pastCode){
        _localCode = new StringBuilder(pastCode.GetCode());
    }

    public void Print(){
        System.out.println(_localCode.toString());
    }
}