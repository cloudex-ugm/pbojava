public class PcFacade{
    private static int DEFAULT_CPU_TEMP = 50;
    private static int MAX_CPU_TEMP = 75;
    private static int DEFAULT_GPU_TEMP = 40;
    private static int MAX_GPU_TEMP = 60;
    private Cpu cpu = new Cpu();
    private Gpu gpu = new Gpu();

    public void StartPcNormal(){
        cpu.setTemp(DEFAULT_CPU_TEMP);
        gpu.setTemp(DEFAULT_GPU_TEMP);
    }

    public void StartPcOverclock(){
        cpu.setTemp(MAX_CPU_TEMP);
        gpu.setTemp(MAX_GPU_TEMP);
    }

    public String GetPcTemp(){
        return "CPU: " + this.cpu.getTemp() + "/GPU:" + this.gpu.getTemp();
    }
}

class Cpu{
    private int Temp;

    public int getTemp(){
        return this.Temp;
    }

    public void setTemp(int temp){
        this.Temp = temp;
    }
}

class Gpu{
    private int Temp;

    public int getTemp(){
        return this.Temp;
    }

    public void setTemp(int temp){
        this.Temp = temp;
    }
}