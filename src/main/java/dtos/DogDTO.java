package dtos;

public class DogDTO {
    private String url;

    public DogDTO() {
    }

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
