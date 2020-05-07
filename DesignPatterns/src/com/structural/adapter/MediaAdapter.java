package com.structural.adapter;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String type) {
		
		if(type.equalsIgnoreCase("mp4"))
			advancedMediaPlayer = new Mp4Player();
		else if(type.equalsIgnoreCase("vlc"))
			advancedMediaPlayer = new VlcPlayer();
		
	}

	@Override
	public void playMedia(String type) {
		if(type.equalsIgnoreCase("mp4"))
			advancedMediaPlayer.playMp4();
		else if(type.equalsIgnoreCase("vlc"))
			advancedMediaPlayer.playVlc();
		
		
	}
	
	

}
