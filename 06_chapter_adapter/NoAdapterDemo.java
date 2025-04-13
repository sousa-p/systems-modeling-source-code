class LegacySoundSystem {
    public void playSound(String file) {
        System.out.println("Playing sound: " + file);
    }
}

class AudioPlayer {
    public void playAudio(String file) {
        System.out.println("Playing modern audio: " + file);
    }
}

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.playAudio("music.mp3");
    }
}