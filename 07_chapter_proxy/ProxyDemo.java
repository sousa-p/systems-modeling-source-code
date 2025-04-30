interface VideoService {
    void watchVideo(String videoName);
}

class RealVideoService implements VideoService {
    @Override
    public void watchVideo(String videoName) {
        System.out.println("Streaming video: " + videoName);
    }
}

class ProxyVideoService implements VideoService {
    private RealVideoService realService;
    private boolean hasAccess;

    public ProxyVideoService(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    @Override
    public void watchVideo(String videoName) {
        if (!hasAccess) {
            System.out.println("Erro de acesso");
            return;
        }

        if (realService == null) {
            realService = new RealVideoService();
        }

        realService.watchVideo(videoName);
    }
}

public class Main {
    public static void main(String[] args) {
        VideoService service = new ProxyVideoService(true);
        service.watchVideo("documentary.mp4");

        VideoService restricted = new ProxyVideoService(false);
        restricted.watchVideo("restricted_video.mp4");
    }
}