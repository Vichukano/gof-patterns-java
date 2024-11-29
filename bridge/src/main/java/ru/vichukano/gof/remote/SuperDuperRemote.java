package ru.vichukano.gof.remote;

import ru.vichukano.gof.device.Device;

public class SuperDuperRemote implements AdminRemote {
    private final Device device;

    public SuperDuperRemote(Device device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.powerUp();
    }

    @Override
    public void off() {
        device.powerDown();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    @Override
    public void settings() {
        device.info();
    }

    @Override
    public void mute() {
        device.setVolume(0);
    }

    @Override
    public void diagnostic() {
        System.out.println("Start to diagnostic for device: " + device);
        System.out.println("Diagnostic OK");
    }

}
