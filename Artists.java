package spotify;
import java.util.*;

public class Artists {
	HashSet<String> AlbumName = new HashSet<>();
	Artists(){
		AlbumName.add("Harry Styles");
		AlbumName.add("Sia");
		AlbumName.add("Chainsmokers");
		AlbumName.add("Ariana Grande");
		AlbumName.add("Taylor Swift");
	}
	void diplayAlbums() {
		int i=0;
		System.out.println("AlbumName");
		for (String string : AlbumName) {
			i++;
			System.out.format("%s.%s",i,string+"\n");
		}
	}
}
