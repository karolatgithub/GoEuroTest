/**
 * 
 */
package pl.noriSoftware.goEuro;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author karol
 *
 */
public class GoEuroTest {

	private static final Class<GoEuroTest> thisClass = GoEuroTest.class;
	final static protected Logger logger = LoggerFactory.getLogger(thisClass.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			RuntimeException ex =new RuntimeException("Expected city name parameter to run for example: java -jar GoEuroTest.jar \"New York\"");
			logger.error("error", ex);
			throw ex;
		}
		@SuppressWarnings("resource")
		final ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "pl/noriSoftware/goEuro/spring-context.xml" });
		final ICity2CSV city2CSV = (ICity2CSV) context
				.getBean("springBean.City2CSV");
		try {
			city2CSV.run(args[0]);
		} catch (IOException ex) {
			logger.error("error", ex);
			ex.printStackTrace();
		}
	}

}
