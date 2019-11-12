package ch2;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the wind";
        one.genre = "drama";
        one.rating = 9;
        Movie two = new Movie();
        two.title = "Titanic";
        two.genre = "tragic";
        two.rating = 10;

        one.playIt();
        two.playIt();


    }
}
