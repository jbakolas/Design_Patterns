package Adapter_Structural_MusicPlayer;

/**
 * Created by bakgi on 3/22/2016.
 */
public class AdapterClient {
    public static void main(String args[]){

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","IRON MAIDEN - THE NUMBER OF THE BEAST.mp3");
        audioPlayer.play("vlc","TRENTEMOLLER - MOAN.vlc");
        audioPlayer.play("Mp3","ARCHIVE - FOOL.mp3");
        audioPlayer.play("MP4","IGGY POP - I WANNA BE YOUR DOG.mp4");
        audioPlayer.play("AAC","MEGADETH - HANGAR 18.aac");
    }
}
