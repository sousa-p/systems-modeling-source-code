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

public interface GameCreator {
    Game createGame();
}

class ComputerGameCreator implements GameCreator {
    @Override
    public Game createGame() {
        return new ComputerGame();
    }
}

class GBAGameCreator implements GameCreator {
    @Override
    public Game createGame() {
        return new GBAGame();
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
        GameCreator gbaCreator = new GBAGameCreator();
        Game gbaGame = gbaCreator.createGame();
        gbaGame.start();
        gbaGame.pause();
        
        GameCreator computerCreator = new ComputerGameCreator();
        Game computerGame = computerCreator.createGame();
        computerGame.start();
        computerGame.pause();
    }
}