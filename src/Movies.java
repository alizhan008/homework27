import java.util.*;

public class Movies {
    Root root = FileService.readFile();


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
    }

    public void searchMovies(String search) {
        for (Root.Movie mv : root.movies) {
            if (mv.getName().toLowerCase(Locale.ROOT).contains(search.toLowerCase(Locale.ROOT))) {
                System.out.println(mv.getName());
            }
        }
    }

    public void sortDate() {
        Collections.sort(root.movies);
        System.out.println("Сортирвока по дате:");
        for (Root.Movie m : root.movies) {
            System.out.printf("%s: %s%n",m.getName(),m.getYear());
        }
        System.out.println();
    }

    public void sortName() {
        Comparator<Root.Movie> moviesComparator = new Comparator<Root.Movie>() {
            @Override
            public int compare(Root.Movie o1, Root.Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("Сортировка по имени фильма:");
        root.movies.sort(moviesComparator);
        for (Root.Movie m : root.movies) {
            System.out.println(m.getName());
        }
    }
    public void sortProducer() {
    }


}


