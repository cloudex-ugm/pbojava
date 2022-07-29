public class Git {
    private LocalGit _localGit;
    private CodeEditor _codeEditor;
    public Git(LocalGit localGit){
        this._localGit = localGit;
    }

    public void WriteCode(String code){
        _localGit.AddCode(code);
    }

    public void CommitChanges(){
        _codeEditor = _localGit.Commit();
    }

    public void UndoChanges(){
        _localGit.Undo(_codeEditor);
    }

    public void ViewCode(){
        _localGit.Print();
    }
}
