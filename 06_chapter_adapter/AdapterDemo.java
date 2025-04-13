interface AudioPlayable {
    void playAudio(String file);
}

class LegacySoundSystem {
    public void playSound(String file) {
        System.out.println("Playing sound: " + file);
    }
}

class AudioAdapter implements AudioPlayable {
    private LegacySoundSystem legacySystem;

    public AudioAdapter(LegacySoundSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void playAudio(String file) {
        legacySystem.playSound(file);
    }
}

class AudioPlayer {
    private AudioPlayable audio;

    public AudioPlayer(AudioPlayable audio) {
        this.audio = audio;
    }

    public void play(String file) {
        audio.playAudio(file);
    }
}

public class Main {
    public static void main(String[] args) {
        LegacySoundSystem oldSystem = new LegacySoundSystem();
        AudioPlayable adapted = new AudioAdapter(oldSystem);

        AudioPlayer player = new AudioPlayer(adapted);
        player.play("music.mp3");
    }
}