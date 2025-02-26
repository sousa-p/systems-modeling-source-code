interface CodeWriter {
    void writeCode();
}

interface Deployer {
    void deployCode();
}

class BackendDev implements CodeWriter {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code.");
    }
}

class DevOpsDeveloper implements CodeWriter, Deployer {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code.");
    }

    @Override
    public void deployCode() {
        System.out.println("Deploying code.");
    }
}
