package spotify;
import java.util.*;

public class Main {
	static String songname;
	static int val;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		AllSongs songs = new AllSongs();
		SelectSong song =  new SelectSong();
		Choice user_choice = new Choice();
		Artists artists= new Artists();
		while(true) {
			int choice;
			System.out.println("\n============================================================\n\nWelcome to Spotify\n\t1.view all songs\n\t2.view Artists\n\t3.Search\n\t4.Exit\n Enter your choice\n\n\n\n=============================================================");
			choice=Integer.parseInt(sc.next());
			switch(choice) {
			
				case 1 :  	songs.displaySongs();
							songname = song.getSongId(sc);
							song.playSong(songname);
							System.out.println("ENter 0 to Stop the song..");
							val = user_choice.getIdChoice();
							if(val==0) {
								song.pauseSong(songname);
								break;
							}
							
				case 2 :    artists.diplayAlbums();
							System.out.println("Enter the Artist Name : ");
							String val2 = user_choice.getNameChoice();
							songs.displayAlbumSongs(val2);
							songname = song.getSongId(sc);
							song.playSong(songname);
							System.out.println("ENter 0 to Stop the song..");
							val = user_choice.getIdChoice(); 
							if(val==0) {
								song.pauseSong(songname);
								break;
							}
							break;
							
				case 3 :   System.out.println("Enter the Song Name : ");
				           songname = user_choice.getSongChoice();
				           songs.getSearchedSongName(songname);
				           song.getSongId(sc);
				           song.playSong(songname);
				           System.out.println("ENter 0 to Stop the song..");
				           val = user_choice.getIdChoice(); 
						   if(val==0) {
								song.pauseSong(songname);
								break;
							}
				           break;
				           
				case 4 :  System.exit(0);
			}
		}
	}
}



