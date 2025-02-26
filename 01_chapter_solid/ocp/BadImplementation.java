class Car {
    private String clutchSystem;

    public Car(String clutchSystem) {
        this.clutchSystem = clutchSystem;
    }

    public void engageGear() {
        if (clutchSystem.equals("manual")) {
            System.out.println("Manually.");
        } else if (clutchSystem.equals("automatica")) {
            System.out.println("Automatically.");
        }
    }
}
