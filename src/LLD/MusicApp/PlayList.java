package LLD.MusicApp;

import lombok.*;

import java.util.*;

@Getter
public class PlayList {
    private int id;
    private List<Song> songs;
    private List<Song> shuffledSongs;
    private int currentIndex;
    public PlayList(int id, List<Song> songs) {
        this.id = id;
        this.songs = songs;
        shufflePlaylist();
    }
    public void addSongs(Song song) {
        songs.add(song);
    }
    private void shufflePlaylist() {
        shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs, new Random());
        currentIndex = 0;
    }
    public Song playNext() {
        if (currentIndex >= shuffledSongs.size()) {
            System.out.println("All songs have been played. Resetting playlist.");
            shufflePlaylist();
        }
        return shuffledSongs.get(currentIndex++);
    }

    public void resetPlaylist() {
        shufflePlaylist();
    }
    public void showPlaylist() {
        for (Song song : songs) {
            System.out.println("Song name : " + song.getSongName() + " Singer name : " + song.getSingerName());
        }
    }
}
