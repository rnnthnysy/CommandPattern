package commandPattern;
import java.util.Scanner;
public class music implements device {
    private String[] playlist = {"Fancy by Twice", "Cake by ITZY", "Tally by BlackPink"};
    @Override
    public void powerOn() {
        System.out.println("Music is on!");
    }

    @Override
    public void powerOff() {
        System.out.println("Music is off!");
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
        System.out.println("Music Volume increased by 1");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Music Volume decreased by 1");
    }

    @Override
    public void selectPlayList() {
        System.out.println("Available songs:");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println((i + 1) + ". " + playlist[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the song you want to play: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= playlist.length) {
            System.out.println("Currently Playing: " + playlist[choice - 1]);
            System.out.println();
        } else {
            System.out.println("Invalid input! Please select a valid song.");
        }
    }
}