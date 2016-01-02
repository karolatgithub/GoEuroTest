package test;

import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.noriSoftware.goEuro.ICity2CSV;

public class GoEuropeTest extends TestCase {

	final protected Logger logger = LoggerFactory.getLogger(getClass());
	final ApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "pl/noriSoftware/goEuro/spring-context.xml" });
	private final ICity2CSV city2CSV = (ICity2CSV) context
			.getBean("springBean.City2CSV");

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@Test
	public void test_Cities() throws IOException {
		System.out.println("test_Cities");
		city2CSV.run("Mrągowo");
		city2CSV.run("Berlin");
		city2CSV.run("WARSZAWA");
		city2CSV.run("uNkNoW");
	}

}
