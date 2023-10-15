package ch08.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();

        Movie theMovie2 = new Adventure("Indiana Jones");
        theMovie2.watchMovie();

        Movie theMovie3 = new Comedy("Home Alone");
        theMovie3.watchMovie();

        Movie theMovie4 = new ScienceFiction("Star Trek");
        theMovie4.watchMovie();
        System.out.println("---------------------------------------");

        Movie theMovie5 = Movie.getMovie("Adventure", "Star Wars");
        theMovie5.watchMovie();

        Movie theMovie6 = Movie.getMovie("Science", "Star Wars");
        theMovie6.watchMovie();
        System.out.println("---------------------------------------");

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Moview Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
