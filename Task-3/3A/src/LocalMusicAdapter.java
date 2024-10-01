public class LocalMusicAdapter implements MusicPlayer
{
    private LocalMusicSystem localMusicSystem;
    public LocalMusicAdapter(LocalMusicSystem localMusicSystem)
    {
        this.localMusicSystem = localMusicSystem;
    }
    @Override
    public void play()
    {
        localMusicSystem.startPlaying();
    }
    @Override
    public void stop()
    {
        localMusicSystem.stopPlaying();
    }
}
