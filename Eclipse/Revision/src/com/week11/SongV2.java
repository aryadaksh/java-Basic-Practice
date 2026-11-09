package com.week11;

public class SongV2 {
	
	private String title;
	private String artist;
	private int bpm;
	
	public SongV2(String title,String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
		
	}
	
	public int getBPM() {
		return bpm;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getTitle() {
		return title;
		
	}
	
	

}
