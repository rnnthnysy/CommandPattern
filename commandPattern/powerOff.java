package commandPattern;

public class powerOff implements command{

    private device device;

    public powerOff(device device){
        this.device = device;
    }
    @Override
    public void execute() {
      device.powerOff();
    }
    
}