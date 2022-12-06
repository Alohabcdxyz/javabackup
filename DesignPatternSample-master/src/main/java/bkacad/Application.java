package bkacad;

import bkacad.player.DefaultPlayer;
import bkacad.utils.MediaFiles;
import bkacad.player.IPlayer;
import bkacad.player.AdapterPlayer;

import java.io.File;
import java.util.Scanner;

public final class Application {
    private static Application app = null;

    // Constructor
    private Application() {}

    public static Application getInstance() {
        if (app == null) {
            app = new Application();
        }
        return app;
    }

    private IPlayer player, defaultPlayer, adapterPlayer;
    Scanner in = new Scanner(System.in);

    public void start() throws Exception {
        File[] files = MediaFiles.getMedia();

        while (true) {
            // ---MENU--- //
            System.out.println("Select the media file you want to play?");
            for (int i = 0; i < files.length; i++) {
                System.out.println((i + 1) + ". " + files[i].getName());
            }
            System.out.println("0. Exit");
            System.out.print("Enter your file you want to play: ");
            // ---MENU--- //
            int option = Integer.valueOf(in.nextLine());
//            System.out.println("1. Start");
//            System.out.println("2. Stop");
            // Play media
            if (option > files.length || option < 0) {
                System.out.println("Nothing to show");
                continue;
            } else if (option == 0) {
                System.out.println("Thank you and see you again");
                break;
            } 
            int choice = Integer.parseInt(in.nextLine());
            do {
            	showMenu();
            	switch(choice) {
            		case 1:
            			String path = files[option - 1].getAbsolutePath();
            			this.play(path);
            			break;
            		case 2: 
            			stop();
            			break;
            		default:
            			System.out.println("Choose again!");
            			break;
            	}
            }while(false);   
        }
        in.close();
    }

    public void play(String filePath) throws Exception {
        if (filePath.endsWith("aac")) {
            if (defaultPlayer == null) {
                defaultPlayer = new DefaultPlayer();
            }
            player = defaultPlayer;
           
        } else if (filePath.endsWith("mp3")) {
//          
       	 if (adapterPlayer == null) {
    		 adapterPlayer = new AdapterPlayer();
         }
         player = adapterPlayer;
        }
        player.play(filePath);
    }
    
    public void stop() throws Exception {    	
//    	if(player !=null)
//    	      player.stop(); 	
			stop();
    }
    
    public void showMenu() {
         System.out.println("1. Start");
         System.out.println("2. Stop");
    }

}
