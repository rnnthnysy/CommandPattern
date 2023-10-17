package commandPattern;

public class increaseBrightness implements command{

    private device device;

    public increaseBrightness(device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.increaseBrightness();
    }
    
}