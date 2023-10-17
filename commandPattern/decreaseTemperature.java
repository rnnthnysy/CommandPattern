package commandPattern;

public class decreaseTemperature implements command {

    private device device;

    public decreaseTemperature(device device){
        this.device = device;
    }
    @Override
    public void execute() {
      device.decreaseTemperature();
    }
    
}