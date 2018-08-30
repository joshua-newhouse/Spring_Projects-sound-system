package com.soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.contrib.java.lang.system.SystemOutRule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Rule
	public final SystemOutRule LOG =
		new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer cdPlayer;

	@Autowired
	private CompactDisc cd;

	@Test
	public void attributesShouldNotBeNull() {
		assertNotNull(cd);
		assertNotNull(cdPlayer);
	}

	@Test
	public void testPlay() {
		cdPlayer.play();

		String expectedOutput = "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles.\n";

		assertTrue(expectedOutput.equals(LOG.getLog()));
	}
}
