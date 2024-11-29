package ru.vichukano.gof.remote;

import ru.vichukano.gof.device.Device;

public class SimpleRemote implements Remote {
    private final Device device;

    public SimpleRemote(Device device) {
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

}
