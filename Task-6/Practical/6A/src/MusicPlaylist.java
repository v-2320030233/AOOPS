import java.util.LinkedList;
public class MusicPlaylist
{
    private LinkedList<String> playlist;
    public MusicPlaylist()
    {
        playlist = new LinkedList<>();
    }
    public void addSong(String song)
    {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }
    public void removeSong(String song)
    {
        if (playlist.remove(song))
        {
            System.out.println("Song removed: " + song);
        }
        else
        {
            System.out.println("Song not found: " + song);
        }
    }
    public void moveSong(int currentIndex, int newIndex)
    {
        if (currentIndex >= 0 && currentIndex < playlist.size() && newIndex >= 0 && newIndex < playlist.size())
        {
            String song = playlist.remove(currentIndex);
            playlist.add(newIndex, song);
            System.out.println("Moved song: " + song + " to position " + (newIndex + 1));
        }
        else
        {
            System.out.println("Invalid indices.");
        }
    }
    public void displayPlaylist()
    {
        System.out.println("Playlist:");
        for (int i = 0; i < playlist.size(); i++)
        {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }
    public static void main(String[] args)
    {
        MusicPlaylist musicPlaylist = new MusicPlaylist();
        musicPlaylist.addSong("Song A");
        musicPlaylist.addSong("Song B");
        musicPlaylist.addSong("Song C");
        musicPlaylist.displayPlaylist();
        musicPlaylist.removeSong("Song B");
        musicPlaylist.displayPlaylist();
        musicPlaylist.moveSong(0, 1);
        musicPlaylist.displayPlaylist();
    }
}
