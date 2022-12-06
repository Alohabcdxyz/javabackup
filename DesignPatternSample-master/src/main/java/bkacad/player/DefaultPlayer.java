package bkacad.player;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class DefaultPlayer implements IPlayer {
	@Override
    public void play(String path) throws Exception {
        // Your code
		 System.out.println("Play music from " + path);
    	 FileInputStream file = new FileInputStream(path);
    	 Player player = new  Player(file);
         player.play();
         player.close();   
    }

    @Override
    public void stop() throws Exception {
        // Your code
    	stop();
    }
}
