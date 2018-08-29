package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc disc) {
		this.cd = disc;
	}

	public void play() {
		cd.play();
	}
}
