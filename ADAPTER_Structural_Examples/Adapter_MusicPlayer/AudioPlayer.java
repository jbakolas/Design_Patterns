package Adapter_Structural_MusicPlayer;

/**
 * Created by bakgi on 3/21/2016.
 */
//Create concrete class AudioPlayer implementing the MediaPlayer interface
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType,String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Plays MP3 files. Name :"+fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Not supported type of file");
        }

    }
}
