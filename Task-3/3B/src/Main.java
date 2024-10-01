public class Main
{
    public static void main(String[] args)
    {
        LocalMusicSystem localMusicSystem = new LocalMusicSystem();
        MusicSource localMusic = new LocalMusicAdapter(localMusicSystem);
        MusicPlayer localMusicPlayer = new BasicMusicPlayer(localMusic);
        MusicPlayer localMusicWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localMusicPlayer));
        System.out.println("Playing local music:");
        localMusicWithFeatures.play();
        localMusicWithFeatures.stop();
        System.out.println();
        OnlineStreamingService onlineStreamingService = new OnlineStreamingService();
        MusicSource onlineMusic = new OnlineStreamingAdapter(onlineStreamingService);
        MusicPlayer onlineMusicPlayer = new BasicMusicPlayer(onlineMusic);
        MusicPlayer onlineMusicWithEqualizer = new EqualizerDecorator(onlineMusicPlayer);
        System.out.println("Streaming online music:");
        onlineMusicWithEqualizer.play();
        onlineMusicWithEqualizer.stop();
        System.out.println();
        RadioStation radioStation = new RadioStation();
        MusicSource radioMusic = new RadioStationAdapter(radioStation);
        MusicPlayer radioMusicPlayer = new BasicMusicPlayer(radioMusic);
        MusicPlayer radioMusicWithVolumeControl = new VolumeControlDecorator(radioMusicPlayer);
        System.out.println("Playing radio station:");
        radioMusicWithVolumeControl.play();
        radioMusicWithVolumeControl.stop();
    }
}
