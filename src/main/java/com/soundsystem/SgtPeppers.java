package com.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	private static final String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private static final String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist + '.');
	}
}
