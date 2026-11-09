package com.week11;

import java.util.List;
import java.util.ArrayList;

public class MockSong {
	
	public static List<SongV2> getSongV2(){
		
		List<SongV2> songs = new ArrayList<>();
		
		songs.add(new SongV2("somersalut","zero 7",147));
		songs.add(new SongV2("cassidy","grateful dead",158));
		songs.add(new SongV2("$10", "hitchhiker",140));
		songs.add(new SongV2("havana", "cabello",105));
		songs.add(new SongV2("Cassidy","greatful dead",158));
		songs.add(new SongV2("50 ways","simon", 102));
		
		return songs;
		
	}

}
