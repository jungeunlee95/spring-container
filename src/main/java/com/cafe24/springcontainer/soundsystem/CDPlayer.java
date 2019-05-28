package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	// 와이어링01
//	@Autowired
	private CompactDisc cd;
	
	public CDPlayer() {
	}
	
	// 와이어링02
//	@Autowired // 생성자 주입
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	// 와이어링03
	@Autowired
	public void setCompactDisc(@Qualifier("HighSchoolRapper3Final")CompactDisc cd) {
		this.cd = cd;
	}

	
	// 와이어링04
    @Autowired
	public void insertCompactDisc(@Qualifier("HighSchoolRapper2Final")CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() { 
		cd.play();
	}

}
