package commandPattern;

public class decreaseVolume implements command{

    private device device;

    public decreaseVolume(device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.decreaseVolume();
    }
    
}