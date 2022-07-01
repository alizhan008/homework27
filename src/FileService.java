import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("./movies.json");

    public static Root readFile(){

        String json = "";
        try{
            json = Files.readString(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Type type = new TypeToken<List<Root>>() {}.getType();
//        return GSON.fromJson(json,type);
        return GSON.fromJson(json, Root.class);
    }

}
