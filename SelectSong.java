package spotify;
import java.util.*;
public class SelectSong extends Operation {
	SelectSong(){}
	AllSongs song = new AllSongs();
	String getSongId(Scanner sc) {
		System.out.println("Enter the song Id : ");
		int id = Integer.parseInt(sc.next());
		return song.getSongName(id);
	}
	void playSong(String songName) {
		System.out.println(songName+" is Playing");
	}
	void pauseSong(String songName) {
		System.out.println(songName+" is Paused");
	}
	
}

//void Play(String SongName) {
//	System.out.println("The Song "+SongName+" is Playing....");
//}
//void Pause(String SongName) {
//	System.out.println("The Song "+SongName+" is Paused");
//}
