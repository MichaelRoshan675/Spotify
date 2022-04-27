package spotify;
import java.util.*;

public class Choice {
	int choice;
	Scanner sc = new Scanner(System.in);
	int getIdChoice() {
		return Integer.parseInt(sc.next());
	}
	String getNameChoice() {
		return sc.nextLine();
	}
	String getSongChoice() {
		return sc.nextLine();
	}
}
