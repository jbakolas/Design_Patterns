package Adapter_Structural_MusicPlayer;

/**
 * Created by bakgi on 3/21/2016.
 */
//Create concrete class MedaiAdapter implementing the Mediaplayer interface
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VLCPlayer();
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new MP4Player();
    }

    @Override
    public void play(String audioType,String fieName){
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVLC(fieName);
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMP4(fieName);
    }
}
