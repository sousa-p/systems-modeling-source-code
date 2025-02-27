public class GlobalSettings {
    private static final GlobalSettings instance = new();

    private GlobalSettings() {}

    public static GlobalSettings getInstance() {
        return instance;
    }
}
