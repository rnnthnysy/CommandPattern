package commandPattern;

public class selectPlayList implements command{

    private device device;

    public selectPlayList(device device){
        this.device = device;
    }
    @Override
    public void execute() {
       device.selectPlayList();
    }
    
}