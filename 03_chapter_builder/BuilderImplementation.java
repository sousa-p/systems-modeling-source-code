interface IComputerBuilder {
    IComputerBuilder setCPU(String cpu);
    IComputerBuilder setRAM(int ram);
    IComputerBuilder setStorage(int storage);
    IComputerBuilder setHasWifi(boolean hasWifi);
}


class PersonalComputer {
    private String cpu;
    private int ram;
    private int storage;
    private boolean hasWifi;

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setRam(int ram) { this.ram = ram; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setHasWifi(boolean hasWifi) { this.hasWifi = hasWifi; }
}


class PersonalComputerBuilder implements IComputerBuilder {
    private final PersonalComputer personalComputer;

    public PersonalComputerBuilder() {
        this.personalComputer = new PersonalComputer();
    }

    @Override
    public PersonalComputerBuilder setCPU(String cpu) {
        personalComputer.setCpu(cpu);
        return this;
    }

    @Override
    public PersonalComputerBuilder setRAM(int ram) {
        personalComputer.setRam(ram);
        return this;
    }

    @Override
    public PersonalComputerBuilder setStorage(int storage) {
        personalComputer.setStorage(storage);
        return this;
    }

    @Override
    public PersonalComputerBuilder setHasWifi(boolean hasWifi) {
        personalComputer.setHasWifi(hasWifi);
        return this;
    }

    public PersonalComputer build() {
        return personalComputer;
    }
}


class ServerComputer {
    private String cpu;
    private int ram;
    private int storage;
    private boolean hasWifi;

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setRam(int ram) { this.ram = ram; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setHasWifi(boolean hasWifi) { this.hasWifi = hasWifi; }
}


class ServerComputerBuilder implements IComputerBuilder {
    private final ServerComputer serverComputer;

    public ServerComputerBuilder() {
        this.serverComputer = new ServerComputer();
    }

    @Override
    public ServerComputerBuilder setCPU(String cpu) {
        serverComputer.setCpu(cpu);
        return this;
    }

    @Override
    public ServerComputerBuilder setRAM(int ram) {
        serverComputer.setRam(ram);
        return this;
    }

    @Override
    public ServerComputerBuilder setStorage(int storage) {
        serverComputer.setStorage(storage);
        return this;
    }

    @Override
    public ServerComputerBuilder setHasWifi(boolean hasWifi) {
        serverComputer.setHasWifi(hasWifi);
        return this;
    }

    public ServerComputer build() {
        return serverComputer;
    }
}


public class BuilderImplementation {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputerBuilder()
                .setCPU("Intel i7")
                .setRAM(16)
                .setStorage(512)
                .setHasWifi(true)
                .build();

        ServerComputer server = new ServerComputerBuilder()
                .setCPU("AMD EPYC")
                .setRAM(64)
                .setStorage(2000)
                .setHasWifi(false)
                .build();
    }
}
