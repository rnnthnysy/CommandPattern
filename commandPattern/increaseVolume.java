package commandPattern;

public class increaseVolume implements command {

    private device device;

    public increaseVolume(device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.increaseVolume();
    }
    
}