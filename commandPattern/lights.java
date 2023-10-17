package commandPattern;

public class lights implements device{

    @Override
    public void powerOn() {
        System.out.println("Lights are on!");
    }

    @Override
    public void powerOff() {
        System.out.println("Lights are off!");
    }

    @Override
    public void increaseBrightness() {
        System.out.println("Lights increased brightness by 1");
    }

    @Override
    public void decreaseBrightness() {
        System.out.println("Lights decreased brightness by 1");
    }

    @Override
    public void increaseTemperature() {
    //intentionally left blank
    }

    @Override
    public void decreaseTemperature() {
    //intentionally left blank
    }

    @Override
    public void increaseVolume() {
    //intentionally left blank
    }

    @Override
    public void decreaseVolume() {
    //intentionally left blank
    }

    @Override
    public void selectPlayList() {
    //intentionally left blank
    }
    
}
