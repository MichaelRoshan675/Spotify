package spotify;
import java.util.*;

public class AllSongs implements Search{
	ArrayList<Songs> songslist = new ArrayList<>();
	Set<String> ArtistName = new HashSet<>();
	AllSongs(){
		songslist.add(new Songs(1,"WHat Makes You Beautiful", "Harry Styles", "Untold"));
		songslist.add(new Songs(2,"Love Me Like You Do", "Ellie Goudling", "Untold"));
		songslist.add(new Songs(3,"Unstoppable", "Sia", "This is Acting"));
		songslist.add(new Songs(4,"Falling", "Harry Styles", "Fine Fine"));
		songslist.add(new Songs(5,"Closer", "Chainsmokers", "Closer"));
		songslist.add(new Songs(6,"Dont let me DOwn", "Chainsmokers", "Closer"));
		songslist.add(new Songs(7,"Blank Space", "Taylor Swift", "1989"));
		songslist.add(new Songs(8,"Just Look Up", "Ariana Grande", "Don't Look Up"));
		
	}
	void displaySongs() {
		System.out.format("%-25s%25s%25s","Song Name","Artist Name","Production Company"+"\n");
		for (Songs songs : songslist) {
			System.out.format("%2s.%-25s%25s%25s",songs.id,songs.song_name,songs.Artist_name,songs.Production_company+"\n");  
		}
	}
	String getSongName(int id) 
	{
		String songname=" ";
		for (Songs string : songslist) {
			if(string.id == id) {
				songname = string.song_name;
			}
		}
		return songname;
	}
	void displayAlbumSongs(String albumName) {
		System.out.format("%-20s%-20s%10s","Song Name","Artist Name","Production Company"+"\n");
		for (Songs songs : songslist) {
			if(albumName.equals(songs.Artist_name))
			{			
			System.out.print(songs.id+".");
			System.out.format("%-20s%-20s%10s",songs.song_name,songs.Artist_name,songs.Production_company+"\n");
			}
		}
	}
	public void getSearchedSongName(String songname) {
		int check=0;
		System.out.format("%-20s%-20s%10s","Song Name","Artist Name","Production Company"+"\n");
		for(Songs songs : songslist) {
			if(songs.song_name.equals(songname)) {
				check=1;
				System.out.format("%s.%-20s%-20s%10s",songs.id,songs.song_name,songs.Artist_name,songs.Production_company+"\n");
			}
		}
		if(check==0) {
			System.out.println("Song Not Found");
		}
	}
}
