import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    String name, artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        try {
            this.songs.add(new Song(title, duration));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Song findSong(String title) {
        for (Song song : this.songs) {
            if (song.title.equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}
