interface ITask{
    void Process();
}

class HeavyTask implements ITask{
    public HeavyTask(){
        InitialProcess();
    }

    @Override
    public void Process(){
        System.out.println("Processing Complete");
    }

    private void InitialProcess(){
        System.out.println("Initial Configuration Complete");
    }
}

class HeavyTaskProxy implements ITask{
    private static HeavyTask _task;

    @Override
    public void Process(){
        if (_task == null){
            _task = new HeavyTask();
        }
        _task.Process();
    }
}