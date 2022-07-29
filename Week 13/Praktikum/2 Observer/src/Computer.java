import java.util.ArrayList;
import java.util.List;

public class Computer{
    private String _program;
    private List<TaskManager> _observers = new ArrayList<>();

    public Computer (String program){
        this._program = program;
    }

    public String GetProgram(){
        return this._program;
    }

    public void SetProgram(String program){
        this._program = program;
    }

    public void Attach(TaskManager observer){
        _observers.add(observer);
    }

    public void NotifyObserver(){
        for (TaskManager o : _observers){
            o.Update();
        }
    }
}