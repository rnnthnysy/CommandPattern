package commandPattern;

public class increaseTemperature implements command {

    private device device;

    public increaseTemperature(device device){
        this.device = device;
    }
    @Override
    public void execute() {
       device.increaseTemperature();
    }
    
}
