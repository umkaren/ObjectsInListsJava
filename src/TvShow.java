public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }
    public String getName() {
        return this.name;
    }
    public int getEpisodes() {
        return this.episodes;
    }
    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return ("The name of the show is " + getName() + " with " + getEpisodes() + " episodes. The genre is " + getGenre());
    }
}
