import java.util.*;

public class Movies {
    MyMovies root = FileService.readFile();


    public void printMovies() {
        System.out.printf("Коллекция фильмов:%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n",
                root.movies.get(0).getName(),
                root.movies.get(1).getName(),
                root.movies.get(2).getName(),
                root.movies.get(3).getName(),
                root.movies.get(4).getName(),
                root.movies.get(5).getName(),
                root.movies.get(6).getName(),
                root.movies.get(7).getName());
        System.out.println();
    }

    public void searchMovies(String search) {
        for (MyMovies.Movie mv : root.movies) {
            if (mv.getName().toLowerCase(Locale.ROOT).contains(search.toLowerCase(Locale.ROOT))) {
                System.out.println(mv.getName());
            }
        }
        System.out.println();
    }

    public void sortDate() {
        Collections.sort(root.movies);
        System.out.println("Сортирвока по дате:");
        for (MyMovies.Movie m : root.movies) {
            System.out.printf("%s: %s%n",m.getName(),m.getYear());
        }
        System.out.println();
    }

    public void sortName() {
        Comparator<MyMovies.Movie> moviesComparator = new Comparator<MyMovies.Movie>() {
            @Override
            public int compare(MyMovies.Movie o1, MyMovies.Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("Сортировка по имени фильма:");
        root.movies.sort(moviesComparator);
        for (MyMovies.Movie m : root.movies) {
            System.out.println(m.getName());
        }
    }
    public void sortProducer() {
    }


}


