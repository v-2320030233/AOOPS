public class LocalMusicAdapter implements MusicSource
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