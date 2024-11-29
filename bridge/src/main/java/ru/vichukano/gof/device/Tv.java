package ru.vichukano.gof.device;

public class Tv implements Device {
    private int volume = 0;
    private boolean isOn = false;

    @Override
    public void powerUp() {
        this.isOn = true;
        this.volume = 50;
    }

    @Override
    public void powerDown() {
        this.volume = 0;
        this.isOn = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void info() {
        System.out.println("TV: " + (isOn ? "ON" : "OFF"));
        System.out.println("Volume: " + volume);
    }
}
