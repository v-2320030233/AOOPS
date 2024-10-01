public class VolumeControlDecorator extends MusicPlayerDecorator
{
    public VolumeControlDecorator(MusicPlayer decoratedPlayer)
    {
        super(decoratedPlayer);
    }
    @Override
    public void play()
    {
        super.play();
        setVolume();
    }
    private void setVolume()
    {
        System.out.println("Volume set to a comfortable level.");
    }
}
