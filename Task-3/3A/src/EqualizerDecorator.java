public class EqualizerDecorator extends MusicPlayerDecorator
{
    public EqualizerDecorator(MusicPlayer decoratedPlayer)
    {
        super(decoratedPlayer);
    }
    @Override
    public void play()
    {
        super.play();
        setEqualizer();
    }
    private void setEqualizer()
    {
        System.out.println("Equalizer settings applied.");
    }
}
