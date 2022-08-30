interface IPc{
    public void SetCpu(String cpu);
    public void SetGpu(String gpu);
    public void SetRam(String ram);
}

class Pc implements IPc{
    private String _cpu;
    private String _gpu;
    private String _ram;

    public void SetCpu(String cpu){
        this._cpu = cpu;
    }

    public void SetGpu(String gpu){
        this._gpu = gpu;
    }

    public void SetRam(String ram){
        this._ram = ram;
    }

    public String GetPcSpec(){
        return this._cpu + "/" + this._gpu + "/" + this._ram;
    }
}

interface PcBuilder{
    public void BuildCpu();
    public void BuildGpu();
    public void BuildRam();
    public Pc GetPc();
}

class WorkPc implements PcBuilder{
    private Pc _pc;

    public WorkPc(){
        this._pc = new Pc();
    }

    public void BuildCpu(){
        _pc.SetCpu("Intel i5");
    }

    public void BuildGpu(){
        _pc.SetGpu("Nvidia GeForce 900M");
    }

    public void BuildRam(){
        _pc.SetRam("8 GB");
    }

    public Pc GetPc(){
        return this._pc;
    }
}

class GamingPc implements PcBuilder{
    private Pc _pc;

    public GamingPc(){
        this._pc = new Pc();
    }

    public void BuildCpu(){
        _pc.SetCpu("Intel i9");
    }

    public void BuildGpu(){
        _pc.SetGpu("Nvidia RTX 2080");
    }

    public void BuildRam(){
        _pc.SetRam("16 GB");
    }

    public Pc GetPc(){
        return this._pc;
    }
}

class Build{
    private PcBuilder _pcBuilder;
    
    public Build(PcBuilder pcBuilder){
        this._pcBuilder = pcBuilder;
    }

    public Pc GetPc(){
        return this._pcBuilder.GetPc();
    }

    public void BuildPc(){
        this._pcBuilder.BuildCpu();
        this._pcBuilder.BuildGpu();
        this._pcBuilder.BuildRam();
    }
}