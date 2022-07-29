public class AddonPeripheral implements IComputer{
    protected IComputer _runningComputer;
    public AddonPeripheral(IComputer runningComputer){
        this._runningComputer = runningComputer;
    }

    public void RunComputer(){_runningComputer.RunComputer();}
}

class SpeakerPeripheral extends AddonPeripheral{
    public SpeakerPeripheral(IComputer runningComputer){
        super(runningComputer);
    }

    @Override
    public void RunComputer(){
        _runningComputer.RunComputer();
        ConnectSpeaker(_runningComputer);
    }

    private void ConnectSpeaker(IComputer runningComputer){
        System.out.println("Speaker connected to computer");
    }
}