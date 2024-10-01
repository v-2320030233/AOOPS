public class BasicMusicPlayer extends MusicPlayer
{
    public BasicMusicPlayer(MusicSource musicSource)
    {
        super(musicSource);
    }
    @Override
    public void play()
    {
        System.out.println("Basic music player starting playback.");
        musicSource.play();
    }
    @Override
    public void stop()
    {
        System.out.println("Basic music player stopping playback.");
        musicSource.stop();
    }
}