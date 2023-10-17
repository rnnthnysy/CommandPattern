package commandPattern;

public class airConditioner implements device {

    @Override
    public void powerOn() {
        System.out.println("Air Conditioner is on!");
    }

    @Override
    public void powerOff() {
        System.out.println("Air Conditioner is off!");
    }

    @Override
    public void increaseBrightness() {
    //intentionally left blank
    }

    @Override
    public void decreaseBrightness() {
    //intentionally left blank
    }

    @Override
    public void increaseTemperature() {
        System.out.println("Temperature Increased by 1");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Temperature Decreased by 1");
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
