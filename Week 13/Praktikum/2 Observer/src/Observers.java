class UsageCalculator{
    public static double CalculateUsage(String program, double observer){
        switch (program.toLowerCase()){
            case "game":
                return 40 * observer;
            case "browser":
                return 10 * observer;
            case "microsoft office":
                return 15 * observer;
            case "video editor":
                return 20 * observer;
            default:
                return 0;
        }
    }
}

class UsageCpu extends TaskManager {
    public UsageCpu(Computer computer){
        this._computer = computer;
        this._computer.Attach(this); 
    }

    @Override
    public void Update(){
        double usage = UsageCalculator.CalculateUsage(this._computer.GetProgram(), 1.5);
        System.out.printf("Current Usage of CPU : %.2f%% %n", usage);
    }
}

class UsageRam extends TaskManager {
    public UsageRam(Computer computer){
        this._computer = computer;
        this._computer.Attach(this);
    }

    @Override
    public void Update(){
        double usage = UsageCalculator.CalculateUsage(this._computer.GetProgram(), 2);
        System.out.printf("Current Usage of RAM : %.2f%% %n", usage);
    }
}

class UsageVga extends TaskManager{
    public UsageVga(Computer computer){
        this._computer = computer;
        this._computer.Attach(this);
    }

    @Override
    public void Update(){
        double usage = UsageCalculator.CalculateUsage(this._computer.GetProgram(), 1);
        System.out.printf("Current Usage of Grapich Card : %.2f%% %n", usage);
    }
}
