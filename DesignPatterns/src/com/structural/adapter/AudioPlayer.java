package com.structural.adapter;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	
	@Override
	public void playMedia(String type) {
		
		if(type.equalsIgnoreCase("mp3"))
			System.out.println("Playing MP3 media");
		else if(type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc"))
		{
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.playMedia(type);
		}
		
	}

}
