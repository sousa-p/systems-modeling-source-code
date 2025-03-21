public interface Game {
    void start();
    void pause();
}

class GBAGame implements Game {
    @Override
    public void start() {
        System.out.println("GBA Game started");
    }
    
    @Override
    public void pause() {
        System.out.println("GBA Game paused");
    }
}

class ComputerGame implements Game {
    @Override
    public void start() {
        System.out.println("Computer Game started");
    }
    
    @Override
    public void pause() {
        System.out.println("Computer Game paused");
    }
}

public class Main {
    public static void main(String[] args) {
        Game gbaGame = new GBAGame();
        gbaGame.start();
        gbaGame.pause();
        
        Game computerGame = new ComputerGame();
        computerGame.start();
        computerGame.pause();
    }
}