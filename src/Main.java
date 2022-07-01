import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Movies movies = new Movies();
        movies.printMovies();
        movies.searchMovies("g");
        movies.printMovies();
        movies.sortDate();
        movies.sortName();
////        movies.sortProducer(); не смог реализовать этот метод и 2е задание.
        MoviesMap moviesMap = new MoviesMap();
        moviesMap.fillMap();
    }
}