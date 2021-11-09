package dtos;

public class CombinedDTO {
    private CatDTO catDTO;
    private CoffeeDTO coffeeDTO;
    private DogDTO dogDTO;
    private DuckDTO duckDTO;
    private FoxDTO foxDTO;

    public CombinedDTO(CatDTO catDTO, CoffeeDTO coffeeDTO, DogDTO dogDTO, DuckDTO duckDTO, FoxDTO foxDTO) {
        this.catDTO = catDTO;
        this.coffeeDTO = coffeeDTO;
        this.dogDTO = dogDTO;
        this.duckDTO = duckDTO;
        this.foxDTO = foxDTO;
    }

    public CombinedDTO(CatDTO catDTO, DuckDTO duckDTO) {
        this.catDTO = catDTO;
        this.duckDTO = duckDTO;
    }

    public CatDTO getCatDTO() {
        return catDTO;
    }

    public void setCatDTO(CatDTO catDTO) {
        this.catDTO = catDTO;
    }

    public CoffeeDTO getCoffeeDTO() {
        return coffeeDTO;
    }

    public void setCoffeeDTO(CoffeeDTO coffeeDTO) {
        this.coffeeDTO = coffeeDTO;
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
