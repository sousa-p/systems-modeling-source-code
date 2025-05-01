class BasicTVRemote {
    public void turnOn() {
        System.out.println("Basic Remote: TV turned ON");
    }

    public void turnOff() {
        System.out.println("Basic Remote: TV turned OFF");
    }
}

class AdvancedTVRemote {
    public void turnOn() {
        System.out.println("Advanced Remote: TV turned ON");
    }

    public void turnOff() {
        System.out.println("Advanced Remote: TV turned OFF");
    }

    public void mute() {
        System.out.println("Advanced Remote: TV muted");
    }
}

class BasicRadioRemote {
    public void turnOn() {
        System.out.println("Basic Remote: Radio turned ON");
    }

    public void turnOff() {
        System.out.println("Basic Remote: Radio turned OFF");
    }
}

class AdvancedRadioRemote {
    public void turnOn() {
        System.out.println("Advanced Remote: Radio turned ON");
    }

    public void turnOff() {
        System.out.println("Advanced Remote: Radio turned OFF");
    }

    public void mute() {
        System.out.println("Advanced Remote: Radio muted");
    }
}

public class Main {
    public static void main(String[] args) {
        BasicTVRemote basicTV = new BasicTVRemote();
        basicTV.turnOn();

        AdvancedRadioRemote advancedRadio = new AdvancedRadioRemote();
        advancedRadio.turnOn();
        advancedRadio.mute();
    }
}