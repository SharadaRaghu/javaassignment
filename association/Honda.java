package com.association;

public class Honda extends Car{
	
	public void HondaStartEngine()
	{
		CarEngine hondaEngine = new CarEngine();
		hondaEngine.engineStarts();
		
	}
	public void HondaMusicPlayer()
	{
     MusicPlayer hondaPlayer = new MusicPlayer();
     hondaPlayer.carMusicPlayer();
}
}
