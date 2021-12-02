package com.softuni.DesignPatterns.command;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Controller controller = new Controller();

        controller.executeCommand(new VolumeUpCommand(radio));
        controller.executeCommand(new VolumeUpCommand(radio));
        controller.executeCommand(new VolumeDownCommand(radio));
        radio.volumeDown();

    }
}
