interface IHttpClient {
    void sendRequest(String url);
}

class OkHttpClientImpl implements IHttpClient {
    @Override
    public void sendRequest(String url) {
        System.out.println("HttpClient to: " + url);
    }
}

class ApacheHttpClientImpl implements IHttpClient {
    @Override
    public void sendRequest(String url) {
        System.out.println("ApacheHttpClient to: " + url);
    }
}

class ApiService {
    private final IHttpClient httpClient;

    public ApiService(IHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void fetchData() {
        httpClient.sendRequest("https://api.com/data");
    }
}
