interface Device {
    void turnOn();
    void turnOff();
    void mute();
}

class TV implements Device {
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }

    public void mute() {
        System.out.println("TV muted");
    }
}

class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio turned ON");
    }

    public void turnOff() {
        System.out.println("Radio turned OFF");
    }

    public void mute() {
        System.out.println("Radio muted");
    }
}

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}

class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

    public void mute() {
        device.mute();
    }
}

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new AdvancedRemote(tv);
        remote.turnOn();
        ((AdvancedRemote) remote).mute();

        Device radio = new Radio();
        RemoteControl basic = new BasicRemote(radio);
        basic.turnOn();
    }
}