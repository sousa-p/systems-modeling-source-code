public class AdventureGame {
    private String level;

    public AdventureGame(String level) {
        this.level = level;
    }

    public void play() {
        System.out.println("Level: " + level);
    }
}

public class RacingGame {
    private String track;

    public RacingGame(String track) {
        this.track = track;
    }

    public void play() {
        System.out.println("Racing on track: " + track);
    }
}

public class NoPrototypeDemo {
    public static void main(String[] args) {
        AdventureGame adventureGame1 = new AdventureGame("Level 1");
        RacingGame racingGame1 = new RacingGame("Desert Track");
        
        adventureGame1.play();
        racingGame1.play();

        AdventureGame adventureGame2 = new AdventureGame("Level 1");
        RacingGame racingGame2 = new RacingGame("Desert Track");
        
        adventureGame2.play();
        racingGame2.play();
    }
}
