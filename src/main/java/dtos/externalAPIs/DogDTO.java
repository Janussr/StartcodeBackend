package dtos.externalAPIs;

public class DogDTO {
    private String url;

    public DogDTO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
