package LLD.MusicApp;

import java.util.*;

public class MusicApp {
    public static void main(String[] args) {
        //
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Shape of You", "Ed Sheeran"));
        songs.add(new Song("Blinding Lights", "The Weeknd"));
        songs.add(new Song("Levitating", "Dua Lipa"));
        songs.add(new Song("Believer", "Imagine Dragons"));
        songs.add(new Song("Peaches", "Justin Bieber"));

        // Create a playlist
        PlayList playlist = new PlayList(101, songs);

        // Show the playlist
        playlist.showPlaylist();

        // Play songs randomly
        System.out.println("\nShuffling and playing the playlist:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Playing: " + playlist.playNext());
        }
        // Playing again after all songs are played (reshuffled)
        System.out.println("\nPlaying after reshuffle:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Playing: " + playlist.playNext());
        }
    }
}
