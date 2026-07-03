/**
 * Inteface
 */
public interface Inteface {

    

    public void play();

    public static void main(String[] args){
        MusiPlayte mPlayte = new MusiPlayte();
        mPlayte.play();
    }
}

class MusiPlayte implements Inteface{
    @Override
    public void play(){
        System.out.println("Playing music");
    }
}
