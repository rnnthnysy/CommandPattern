package commandPattern;

public class television implements device{

    @Override
    public void powerOn() {
        System.out.println("TV is on!");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is off!");
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
    //intentionally left blank 
    }

    @Override
    public void decreaseTemperature() {
    //intentionally left blank
    }

    @Override
    public void increaseVolume() {
       System.out.println("Volume increased by 1");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume decreased by 1");
    }

    @Override
    public void selectPlayList() {
    //intentionally left blank 
    }
    
}