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
////        movies.sortProducer(); �� ���� ����������� ���� ����� � 2� �������.
        MoviesMap moviesMap = new MoviesMap();
        moviesMap.fillMap();
    }
}