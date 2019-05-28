package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.mixing.VideoSystemConfig;

/*
 * 명시적(Explicit) Configuration - Java Mixing Config Test
 * Java Config <----- (JavaConfig1,JavaConfig2, JavaConfig3) 
 * 			   @Import
 * 자바 컨피그에 자바 컨피그를 줌
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=VideoSystemConfig.class)
public class DVDPlayerMixingConfigTest02 {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testDVDNull() {
		assertNotNull(player);
	}
}
