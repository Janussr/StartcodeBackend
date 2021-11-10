package dtos.externalAPIs;

public class CombinedDTO {
    private CatDTO catDTO;
    private DogDTO dogDTO;
    private DuckDTO duckDTO;
    private FoxDTO foxDTO;

    public CombinedDTO(CatDTO catDTO, DogDTO dogDTO, DuckDTO duckDTO, FoxDTO foxDTO) {
        this.catDTO = catDTO;
        this.dogDTO = dogDTO;
        this.duckDTO = duckDTO;
        this.foxDTO = foxDTO;
    }

    public CatDTO getCatDTO() {
        return catDTO;
    }

    public void setCatDTO(CatDTO catDTO) {
        this.catDTO = catDTO;
    }


    public DogDTO getDogDTO() {
        return dogDTO;
    }

    public void setDogDTO(DogDTO dogDTO) {
        this.dogDTO = dogDTO;
    }

    public DuckDTO getDuckDTO() {
        return duckDTO;
    }

    public void setDuckDTO(DuckDTO duckDTO) {
        this.duckDTO = duckDTO;
    }

    public FoxDTO getFoxDTO() {
        return foxDTO;
    }

    public void setFoxDTO(FoxDTO foxDTO) {
        this.foxDTO = foxDTO;
    }
}
