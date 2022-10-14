import java.util.ArrayList;
import java.util.List;

public class DVD
{
    private ArrayList<Movie> movies=new ArrayList<Movie>();
    public DVD(){}
    public ArrayList<Movie> getMovies()
    {
        return movies;
    }
    public void setMovies(ArrayList<Movie> movies)
    {
        this.movies = movies;
    }

    public String toString()
    {
        String moviestr="";
        for(Movie movie:movies)
        {
            moviestr += movie.getName()+"\n";
        }
        return moviestr;
    }
}