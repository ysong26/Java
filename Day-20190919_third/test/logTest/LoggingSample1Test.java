package logTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoggingSample1Test {

	@Test
	public void testInitLogging() {
		LoggingSample1 sample=new LoggingSample1();
		sample.initLogging();
	}

}
