package lab1;

import java.time.*;
import java.util.Objects;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private String genre;
    private LocalDate releaseDate;
    
    public Song()
    {
        
    }
    
    public Song(String title, String artist, String genre, LocalDate releaseDate)
    {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }
    
    public Song(String title, String artist, String genre)
    {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        releaseDate = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.title);
        hash = 97 * hash + Objects.hashCode(this.artist);
        hash = 97 * hash + Objects.hashCode(this.releaseDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        return true;
    }

    /**
     * Compares Songs for natural ordering based on release date. Newer songs come last.
     * @param t The song to compare
     * @return The sorting position for this song
     */
    @Override
    public int compareTo(Song t) {
        final int EQUAL = 0;
        final int BEFORE = -1;
        final int AFTER = 1;
        if(this.equals(t))
        {
            return EQUAL;
        }
        if(this.releaseDate.isBefore(t.releaseDate))
        {
            return BEFORE;
        }
        if(this.releaseDate.isAfter(t.releaseDate))
        {
            return AFTER;
        }
        return EQUAL;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", genre=" + genre + ", releaseDate=" + releaseDate + '}';
    }
    
    
}
