import java.util.ArrayList;

public class MyMovies {

    public ArrayList<Movie> movies;

    public static class Movie implements Comparable<Movie>{
        private String name;
        private Integer year;
        private String description;
        private Director director;
        private ArrayList<Cast> cast;

        @Override
        public int compareTo(Movie o) {
            return getYear().compareTo(o.year);
        }


        public static class Director{
            private String fullName;

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }
        }

        public static class Cast{
            private String fullName;
            private String role;

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Director getDirector() {
            return director;
        }

        public void setDirector(Director director) {
            this.director = director;
        }

        public ArrayList<Cast> getCast() {
            return cast;
        }

        public void setCast(ArrayList<Cast> cast) {
            this.cast = cast;
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    ", description='" + description + '\'' +
                    ", director=" + director +
                    ", cast=" + cast +
                    '}';
        }
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }


}


