package bkacad.player;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class AdapterPlayer implements IPlayer {
	private Player player;
	@Override
    public void play(String path) throws Exception {
    	 System.out.println("Play music from " + path);
    	 try {
    	        FileInputStream fis = new FileInputStream(path);
    	        BufferedInputStream bis = new BufferedInputStream(fis);
    	        player = new Player(bis);
    	    } catch (Exception e) {
    	        System.out.println(e.getMessage());
    	    }

    	    try {
    	        player.play();
    	    } catch (JavaLayerException e) {
    	        System.out.println(e.getMessage());
    	    }   
	}
    @Override
    public void stop() throws Exception {
//    	if(player != null) player.close();    	
    	player.close();
    }
}
