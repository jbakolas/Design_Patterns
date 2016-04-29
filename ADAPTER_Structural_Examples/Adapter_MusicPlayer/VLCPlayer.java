package Adapter_Structural_MusicPlayer;

/**
 * Created by bakgi on 3/21/2016.
 */
//Create concrete class VLCPlayer implementing the AdvancedmediaPlayer interface
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName){
        System.out.println("Plays VLC files. Name :"+fileName);
    }
    @Override
    public void playMP4(String filename){
        //do nothing
    }
}
