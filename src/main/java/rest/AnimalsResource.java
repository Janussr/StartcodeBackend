package rest;

import com.google.gson.Gson;
import dtos.externalAPIs.*;
import utils.HttpUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;

@Path("/animals")
public class AnimalsResource {

    Gson gson = new Gson();

    @Context
    private UriInfo context;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAnimals() throws IOException {
        String cat = HttpUtils.fetchData("https://aws.random.cat/meow");
        CatDTO catDTO = gson.fromJson(cat, CatDTO.class);

        String dog = HttpUtils.fetchData("https://random.dog/woof.json");
        DogDTO dogDTO = gson.fromJson(dog, DogDTO.class);

        String fox = HttpUtils.fetchData("https://randomfox.ca/floof/");
        FoxDTO foxDTO = gson.fromJson(fox, FoxDTO.class);

        String duck = HttpUtils.fetchData("https://random-d.uk/api/random");
        DuckDTO duckDTO = gson.fromJson(duck, DuckDTO.class);

        CombinedDTO combinedDTO = new CombinedDTO(catDTO, dogDTO, duckDTO, foxDTO);


        return gson.toJson(combinedDTO);
    }
}
