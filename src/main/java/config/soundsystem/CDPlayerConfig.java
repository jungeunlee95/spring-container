package config.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.CompactDisc;
import com.cafe24.springcontainer.soundsystem.HighSchoolRapper3Final;



// basePackageClasses에 지정한 클래스가 속한 패키지를 Base Package로 사용한다 
//@ComponentScan(basePackageClasses=Index.class)

@Configuration
@ComponentScan(basePackages= {"com.cafe24.springcontainer.soundsystem", 
							  "com.cafe24.springcontainer.videosystem"})
//@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem")
public class CDPlayerConfig {
	
	// HighSchoolRapper3Final Component
//	@Bean
//	public CompactDisc highSchooleRapper3Final() {
//		return new HighSchoolRapper3Final();
//	}
	

}
 