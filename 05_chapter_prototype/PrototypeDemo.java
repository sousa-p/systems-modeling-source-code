import java.util.HashMap;
import java.util.Map;


public interface GamePrototype extends Cloneable {
    GamePrototype clone();
    void play();
}


class AdventureGame implements GamePrototype {
    private String level;

    public AdventureGame(String level) {
        this.level = level;
    }

    @Override
    public GamePrototype clone() {
        return new AdventureGame(this.level);
    }

    @Override
    public void play() {
        System.out.println("Level: " + level);
    }
}


class RacingGame implements GamePrototype {
    private String track;

    public RacingGame(String track) {
        this.track = track;
    }

    @Override
    public GamePrototype clone() {
        return new RacingGame(this.track);
    }

    @Override
    public void play() {
        System.out.println("Racing on track: " + track);
    }
}


class GameRegistry {
    private static final Map<String, GamePrototype> prototypes = new HashMap<>();

    public static void addPrototype(String key, GamePrototype prototype) {
        prototypes.put(key, prototype);
    }

    public static GamePrototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}


public class PrototypeDemo {
    public static void main(String[] args) {
        GamePrototype adventure = new AdventureGame("Level 1");
        GamePrototype racing = new RacingGame("Desert");

        GameRegistry.addPrototype("adventure", adventure);
        GameRegistry.addPrototype("racing", racing);

        GamePrototype clonedAdventure = GameRegistry.getPrototype("adventure");
        GamePrototype clonedRacing = GameRegistry.getPrototype("racing");

        clonedAdventure.play();
        clonedRacing.play();
    }
}
