package com.soundsystem;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
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
