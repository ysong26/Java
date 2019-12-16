package logTest;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggingSample1 {
	public void initLogging() {
		//주요 컴포넌트 생성
		Logger logger = Logger.getLogger(LoggingSample1.class);
		DailyRollingFileAppender appender=new DailyRollingFileAppender();
		PatternLayout layout=new PatternLayout();
		
		//Layout 객체 설정
		String layoutPattern="[%d{yyyy/MM/dd HH:mm:ss] %5p %c %M : %m%n";
		layout.setConversionPattern(layoutPattern);
		
		//appender 객체 설정
		String filePath="C:/DEV/logTest.log";
		String datePattern="'.'yyyy-MM-dd";
		appender.setName("TestAppender"); //??
		appender.setFile(filePath);
		appender.setDatePattern(datePattern);
		appender.setBufferSize(1024);
		appender.activateOptions();
		
		//logger 객체 설정
		logger.addAppender(appender);
		
		//테스트
		logger.debug("Log for debugging");
		logger.info("Log for information");
		logger.warn("Log for warn");
		logger.error("Log for error");
		logger.fatal("Log for fatal error");
	}
}
