package looko.tool;

import java.util.Comparator;

import looko.model.OwnedGame;

public class PlaytimeComparator implements Comparator<OwnedGame> {

	@Override
	public int compare(OwnedGame o1, OwnedGame o2) {
		if(o1.getPlaytimeForever() < o2.getPlaytimeForever())
			return 1;
		else
			return -1;
	}

}
