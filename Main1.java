 interface Playable{
    public void play();
    public void pause();


}
class MusicPlayer implements Playable{
    @Override 
    public void play(){
        System.out.println("Music is Playing..");

    }

    @Override 
    public void pause(){
        System.out.println("Music is paused..");
    }
}


public class Main1 {
    public static void main(String[] args){
        MusicPlayer mPlayer = new MusicPlayer();
        mPlayer.play();
        mPlayer.pause();
    }
    
}
