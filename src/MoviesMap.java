import java.util.HashMap;
import java.util.Map;

public class MoviesMap {
    MyMovies movies = FileService.readFile();
    Map<String, MyMovies.Movie> mapMap = new HashMap<>();

    public void fillMap(){
        for (MyMovies.Movie rm:movies.getMovies()) {
            mapMap.put(rm.getName(), rm);
        }
        System.out.println(mapMap);
    }
}
