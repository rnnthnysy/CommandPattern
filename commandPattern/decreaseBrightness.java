package commandPattern;

public class decreaseBrightness implements command{

    private device device;

    public decreaseBrightness(device device){
        this.device = device;
    }
    @Override
    public void execute() {
       device.decreaseBrightness();
    }
    
}