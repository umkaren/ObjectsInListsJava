public class TvShow {
    private String name;
    private int episodes;
    private String genre;
    //constructors
    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }
    public TvShow(String name, String genre) {
        this.name = name;
        this.episodes = 24;
        this.genre = genre;
    }
    public TvShow(int episodes, String genre) {
        this.name = "Clifford";
        this.episodes = episodes;
        this.genre = genre;
    }
    public TvShow(String name) {
        this.name = name;
        this.episodes = 100;
        this.genre = "animation";
    }

    //getters
    public String getName() {
        return this.name;
    }
    public int getEpisodes() {
        return this.episodes;
    }
    public String getGenre() {
        return this.genre;
    }

    public String toString() {
        return ("The name of the show is " + getName() + " with " + getEpisodes() + " episodes. The genre is " + getGenre());
    }
}
