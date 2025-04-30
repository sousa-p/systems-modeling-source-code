interface VideoService {
    void watchVideo(String videoName);
}

class RealVideoService implements VideoService {
    @Override
    public void watchVideo(String videoName) {
        System.out.println("Streaming video: " + videoName);
    }
}

public class Main {
    public static void main(String[] args) {
        VideoService service = new RealVideoService();
        service.watchVideo("documentary.mp4");
    }
}