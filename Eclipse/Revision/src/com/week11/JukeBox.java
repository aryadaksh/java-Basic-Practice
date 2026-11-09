package com.week11;

import java.util.Collections;
import java.util.List;

public class JukeBox {

	public static void main(String[] args)
	{
		new JukeBox().go();
	}
	
	public void go()
	{
//		List<String> songList = MockSongs.getSongStrings();
//		System.out.println(songList);
//		System.out.println();
//		Collections.sort(songList);
//		System.out.println(songList);
		
		List<SongV2> songList = MockSong.getSongV2();
		System.out.println(songList);
		System.out.println();
		Collections.sort(songList);
		System.out.println(songList);
		
	}
}
