abstract class ClutchSystem {
    public abstract void engageGear();
}

class ManualClutch extends ClutchSystem {
    @Override
    public void engageGear() {
        System.out.println("Engaging gear manually.");
    }
}

class AutomaticClutch extends ClutchSystem {
    @Override
    public void engageGear() {
        System.out.println("Engaging gear automatically.");
    }
}

class Car {
    private ClutchSystem clutchSystem;

    public Car(ClutchSystem clutchSystem) {
        this.clutchSystem = clutchSystem;
    }

    public void engageGear() {
        clutchSystem.engageGear();
    }

    public void setClutchSystem(ClutchSystem clutchSystem) {
        this.clutchSystem = clutchSystem;
    }
}
