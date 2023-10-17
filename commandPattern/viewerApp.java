package commandPattern;

import java.util.*;

public class viewerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        device Television = new television();
        device Light = new lights();
        device AirConditioner = new airConditioner();
        device Music = new music();

        remoteControl RemoteControl = new remoteControl();
        boolean executing = true;
        System.out.println("Welcome to Smart Home Automation!");

        while(executing) {
            System.out.println("Please choose a Device: ");
            System.out.println("(1) Television");
            System.out.println("(2) Light");
            System.out.println("(3) Air Conditioner");
            System.out.println("(4) Music");
            System.out.println("(5) Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                while (true) {
                    System.out.println("Commands for Television: ");
                    System.out.println("(1) Power On");
                    System.out.println("(2) Power Off");
                    System.out.println("(3) Increase Volume");
                    System.out.println("(4) Decrease Volume");
                    System.out.println("(5) Return to Main Menu");
                    int tvInput = sc.nextInt();
                    if (tvInput == 1) {
                        command tvOn = new powerOn(Television);
                        RemoteControl.addCommand(tvOn);
                        RemoteControl.pushButton();
                    } else if (tvInput == 2) {
                        command tvOff = new powerOff(Television);
                        RemoteControl.addCommand(tvOff);
                        RemoteControl.pushButton();
                    } else if (tvInput == 3) {
                        command tvVolumeIncrease = new increaseVolume(Television);
                        RemoteControl.addCommand(tvVolumeIncrease);
                        RemoteControl.pushButton();
                    } else if (tvInput == 4) {
                        command tvVolumeDecrease = new decreaseVolume(Television);
                        RemoteControl.addCommand(tvVolumeDecrease);
                        RemoteControl.pushButton();
                    } else if (tvInput == 5) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                } continue;
            } else if (choice == 2) {
                while (true) {
                    System.out.println("Commands for Light: ");
                    System.out.println("(1) Power On");
                    System.out.println("(2) Power Off");
                    System.out.println("(3) Increase Brightness");
                    System.out.println("(4) Decrease Brightness");
                    System.out.println("(5) Return to Main Menu");
                    int lightInput = sc.nextInt();
                    if (lightInput == 1) {
                        command lightOn = new powerOn(Light);
                        RemoteControl.addCommand(lightOn);
                        RemoteControl.pushButton();
                    } else if (lightInput == 2) {
                        command lightOff = new powerOff(Light);
                        RemoteControl.addCommand(lightOff);
                        RemoteControl.pushButton();
                    } else if (lightInput == 3) {
                        command lightBrightnessIncrease = new increaseBrightness(Light);
                        RemoteControl.addCommand(lightBrightnessIncrease);
                        RemoteControl.pushButton();
                    } else if (lightInput == 4) {
                        command lightBrightnessDecrease = new decreaseBrightness(Light);
                        RemoteControl.addCommand(lightBrightnessDecrease);
                        RemoteControl.pushButton();
                    } else if (lightInput == 5) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                }
                continue;
            } else if (choice == 3) {
                while (true) {
                    System.out.println("Commands for Air Conditioner: ");
                    System.out.println("(1) Power On");
                    System.out.println("(2) Power Off");
                    System.out.println("(3) Increase Temperature");
                    System.out.println("(4) Decrease Temperature");
                    System.out.println("(5) Return to Main Menu");
                    int acInput = sc.nextInt();
                    if (acInput == 1) {
                        command acOn = new powerOn(AirConditioner);
                        RemoteControl.addCommand(acOn);
                        RemoteControl.pushButton();
                    } else if (acInput == 2) {
                        command acOff = new powerOff(AirConditioner);
                        RemoteControl.addCommand(acOff);
                        RemoteControl.pushButton();
                    } else if (acInput == 3) {
                        command acTempIncrease = new increaseTemperature(AirConditioner);
                        RemoteControl.addCommand(acTempIncrease);
                        RemoteControl.pushButton();
                    } else if (acInput == 4) {
                        command acTempDecrease = new decreaseTemperature(AirConditioner);
                        RemoteControl.addCommand(acTempDecrease);
                        RemoteControl.pushButton();
                    } else if (acInput == 5) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                }
                continue;
            } else if (choice == 4) {
                while (true) {
                    System.out.println("Commands for Music ");
                    System.out.println("(1) Power On");
                    System.out.println("(2) Power Off");
                    System.out.println("(3) Increase Volume");
                    System.out.println("(4) Decrease Volume");
                    System.out.println("(5) Select a Playlist");
                    System.out.println("(6) Return to Main Menu");
                    int musicInput = sc.nextInt();
                    if (musicInput == 1) {
                        command musicOn = new powerOn(Music);
                        RemoteControl.addCommand(musicOn);
                        RemoteControl.pushButton();
                    } else if (musicInput == 2) {
                        command musicOff = new powerOff(Music);
                        RemoteControl.addCommand(musicOff);
                        RemoteControl.pushButton();
                    } else if (musicInput == 3) {
                        command musicVolumeIncrease = new increaseVolume(Music);
                        RemoteControl.addCommand(musicVolumeIncrease);
                        RemoteControl.pushButton();
                    } else if (musicInput == 4) {
                        command musicVolumeDecrease = new decreaseVolume(Music);
                        RemoteControl.addCommand(musicVolumeDecrease);
                        RemoteControl.pushButton();
                    } else if (musicInput == 5) {
                        command musicSelectPlayList = new selectPlayList(Music);
                        RemoteControl.addCommand(musicSelectPlayList);
                        RemoteControl.pushButton();
                    } else if (musicInput == 6) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                }
                continue;
            } else if (choice == 5) {
                System.out.println("Thank you for using Smart Home Automation!");
                System.exit(0);
                sc.close();
                break;
            } else {
                System.out.println("Invalid Input!");
                System.out.println("Choose between 1 to 5 only");
            }
        }
    }
}