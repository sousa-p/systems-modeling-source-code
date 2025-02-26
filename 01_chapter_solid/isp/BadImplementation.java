interface Programmer {
    void writeCode();
    void deployCode();
}

class BackendDev implements Programmer {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code.");
    }

    @Override
    public void deployCode() {
        throw new UnsupportedOperationException("Error");
    }
}
