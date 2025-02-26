class HttpClientImpl {
    public void sendRequest(String url) {
        System.out.println("Requesting " + url);
    }
}

class ApiService {
    private final HttpClientImpl httpClient;

    public ApiService() {
        this.httpClient = new HttpClientImpl();
    }

    public void fetchData() {
        httpClient.sendRequest("https://api.com/data");
    }
}
