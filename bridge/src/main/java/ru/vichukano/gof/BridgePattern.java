package ru.vichukano.gof;

import ru.vichukano.gof.device.Device;
import ru.vichukano.gof.device.Radio;
import ru.vichukano.gof.device.Tv;
import ru.vichukano.gof.remote.AdminRemote;
import ru.vichukano.gof.remote.Remote;
import ru.vichukano.gof.remote.SimpleRemote;
import ru.vichukano.gof.remote.SuperDuperRemote;

public class BridgePattern {


    /**
     * Bridge between Remote and Device.
     * Remote is an abstraction and Device is a platform.
     */
    void bridge() {
        Device tv = new Tv();
        Device radio = new Radio();
        Remote simpleTvRemote = new SimpleRemote(tv);
        Remote simpleRadioRemote = new SimpleRemote(radio);
        AdminRemote superTvRemote = new SuperDuperRemote(tv);
        AdminRemote superRadioRemote = new SuperDuperRemote(radio);
        simpleTvRemote.on();
        simpleTvRemote.settings();
        simpleRadioRemote.settings();
        superRadioRemote.diagnostic();
        superTvRemote.mute();
        superTvRemote.diagnostic();
    }

}
