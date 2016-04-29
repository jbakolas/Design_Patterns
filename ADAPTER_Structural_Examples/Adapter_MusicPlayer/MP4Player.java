package Adapter_Structural_MusicPlayer;

/**
 * Created by bakgi on 3/21/2016.
 */
//Create concrete class MP4Player implementing the AdvancedmediaPlayer interface
public class MP4Player implements AdvancedMediaPlayer{

    @Override
    public void playMP4(String fileName){
        System.out.println("Plays MP4 files. Name :"+fileName);
    }
    @Override
    public void playVLC(String fileName){
        //do nothing
    }
}
