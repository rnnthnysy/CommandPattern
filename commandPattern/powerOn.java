package commandPattern;

public class powerOn implements command {

    private device device;

    public powerOn(device device){
        this.device = device;
    }
    @Override
    public void execute() {
       device.powerOn();
    }
    
}