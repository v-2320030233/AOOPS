public class Main
{
    public static void main(String[] args)
    {
        LocalMusicSystem localMusicSystem = new LocalMusicSystem();
        MusicPlayer localMusic = new LocalMusicAdapter(localMusicSystem);
        MusicPlayer localMusicWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localMusic));
        System.out.println("Playing local music:");
        localMusicWithFeatures.play();
        localMusicWithFeatures.stop();
        System.out.println();
        OnlineStreamingService onlineStreamingService = new OnlineStreamingService();
        MusicPlayer onlineMusic = new OnlineStreamingAdapter(onlineStreamingService);
        MusicPlayer onlineMusicWithEqualizer = new EqualizerDecorator(onlineMusic);
        System.out.println("Streaming online music:");
        onlineMusicWithEqualizer.play();
        onlineMusicWithEqualizer.stop();
        System.out.println();
        RadioStation radioStation = new RadioStation();
        MusicPlayer radioMusic = new RadioStationAdapter(radioStation);
        MusicPlayer radioMusicWithVolumeControl = new VolumeControlDecorator(radioMusic);
        System.out.println("Playing radio station:");
        radioMusicWithVolumeControl.play();
        radioMusicWithVolumeControl.stop();
    }
}
