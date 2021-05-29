
/**
 * Insertion sort
 * 3/12/2021
 * Ryan Wagner
 */
public class MovieTesterV1
{
    public static void main(String[] args){
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Good Will Hunting", 1997, "Be Gentlemen");
        movies[1] = new Movie("Jumanji The Next Level", 2019, "Comumbia Pictures");
        movies[2] = new Movie("Spider Man", 2002, "Sony Pictures");
        movies[3] = new Movie("The Martian", 2015, "20th Century Fox");
        movies[4] = new Movie("Toy Story", 1995, "Pixar");
        movies[5] = new Movie("Aladin", 1992, "Disney");
        movies[6] = new Movie("Star War A New Hope", 1977, "Lucasfilm");
        movies[7] = new Movie("1917", 2019, "DreamWorks");
        movies[8] = new Movie("Iron Man", 2008, "Marvel");
        movies[9] = new Movie("Jurassic Park", 1993, "Universal Pictures");
        
        System.out.println("Original List: \n"); 
        printMovies(movies);
        
        //sortMovieTitle(movies, 1);
        //sortMovieTitle(movies, 2);
        
        //sortMovieYear(movies, 1);
        //sortMovieYear(movies, 2);
        
        //sortMovieStudio(movies, 1);
        //sortMovieStudio(movies, 2);
    }
    
    public static void printMovies(Movie[] movies){
        for(Movie m: movies){
            System.out.println(m);
        }
    }
    
    public static void sortMovieTitle(Movie[] movies, int upOrDown){
        String[] titles = new String[movies.length];
        Movie[] newMovies = new Movie[movies.length];
        if(upOrDown == 1){
            for(int i = 0 ; i < movies.length ; i++ ){
                String next = movies[i].getTitle();
                int newIndex = 0, t = i;
                while(t > 0 && newIndex == 0){
                    if (next.compareTo(titles[t - 1]) > 0 ){
                        newIndex = t;
                    }
                    else{
                        titles[t] = titles[t-1];
                        newMovies[t] = newMovies[t-1];
                    }
                    t--;
                }
                titles[newIndex] = next;
                newMovies[newIndex] = movies[i];
            }
            System.out.println("\n\n Sorted by title from a-z: \n");
        }
        if(upOrDown == 2){
            for(int i = 0 ; i < movies.length ; i++ ){
                String next = movies[i].getTitle();
                int newIndex = 0, m = i;
                while(m > 0 && newIndex == 0){
                    if(next.compareTo(titles[m - 1]) < 0 ){
                        newIndex = m;
                    }
                    else{
                        titles[m] = titles[m-1];
                        newMovies[m] = newMovies[m-1];
                    }
                    m--;
                }
                titles[newIndex] = next;
                newMovies[newIndex] = movies[i];
            }
            System.out.println("\n\nSorted by title from z-a: \n");
        }
        for(Movie m: newMovies){
            System.out.println(m);
        }
    }
    
    public static void sortMovieYear(Movie[] movies, int upOrDown){
        int[] years = new int[movies.length];
        Movie[] newMovies = new Movie[movies.length];
        if(upOrDown == 1){
            for ( int i = 0 ; i < movies.length ; i++ ){
                int next = movies[i].getYear();
                int newIndex = 0, y = i;
                while (y > 0 && newIndex == 0){
                    if (next > years[y-1]){
                        newIndex = y;
                    }
                    else{
                        years[y] = years[y-1];
                        newMovies[y] = newMovies[y-1];
                    }
                    y--;
                }
                years[newIndex] = next;
                newMovies[newIndex] = movies[i];
            }
            System.out.println("\n\nSorted by year from oldest to newest: \n");
        }
        if(upOrDown == 2){
            for ( int i = 0 ; i < movies.length ; i++ ){
                int next = movies[i].getYear();
                int newIndex = 0, y = i;
                while (y > 0 && newIndex == 0){
                    if(next < years[y-1]){
                        newIndex = y;
                    }
                    else{
                        years[y] = years[y-1];
                        newMovies[y] = newMovies[y-1];
                    }
                    y --;
                }
                years[newIndex] = next;
                newMovies[newIndex] = movies[i];
            }
            System.out.println("\n\nSorted by year from newest to oldest: \n");
        }
        for(Movie m: newMovies){
            System.out.println(m);
        }
    }
    
    public static void sortMovieStudio(Movie[] movies, int upOrDown){
        String[] studios = new String[movies.length];
        Movie[] newMovies = new Movie[movies.length];
        if(upOrDown == 1){
            for (int i = 0 ; i < movies.length ; i++){
                String next = movies[i].getStudio();
                int newIndex = 0, s = i;
                while (s > 0 && newIndex == 0){
                    if (next.compareTo(studios[s-1]) > 0 ){
                        newIndex = s;
                    }
                    else{
                        studios[s] = studios[s-1];
                        newMovies[s] = newMovies[s-1];
                    }
                    s--;
                }
                studios[newIndex] = next;
                newMovies[newIndex] = movies[i];
            }
            System.out.println("\n\n Sorted by studio from a-z: \n");
        }
        if(upOrDown == 2){
            for ( int i = 0 ; i < movies.length ; i++ ){
                String next = movies[i].getStudio();
                int newIndex = 0, s = i;
                while (s > 0 && newIndex == 0){
                    if(next.compareTo(studios[s - 1]) < 0 ){
                        newIndex = s;
                    }
                    else{
                        studios[s] = studios[s-1];
                        newMovies[s] = newMovies[s-1];
                    }
                    s--;
                }
                studios[newIndex] = next;
                newMovies[newIndex] = movies[i];
            }
            System.out.println("\n\nSorted by studio from z-a: \n");
        }
        for(Movie m: newMovies){
            System.out.println(m);
        }
    }
    
}
