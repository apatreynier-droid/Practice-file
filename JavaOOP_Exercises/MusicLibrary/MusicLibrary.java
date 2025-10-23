package MusicLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<String> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public List<String> getSongs() {
        return songs;
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public String playRandomSong() {
        if (songs.isEmpty()) {
            return "No songs available";
        }
        Random rand = new Random();
        return songs.get(rand.nextInt(songs.size()));
    }
}

