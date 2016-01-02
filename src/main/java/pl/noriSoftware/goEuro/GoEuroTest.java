/**
 * 
 */
package pl.noriSoftware.goEuro;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author karol
 *
 */
public class GoEuroTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			throw new RuntimeException("Expected city name parameter to run for example: java -jar GoEuroTest.jar \"New York\"");
		}
		@SuppressWarnings("resource")
		final ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "pl/noriSoftware/goEuro/spring-context.xml" });
		final ICity2CSV city2CSV = (ICity2CSV) context
				.getBean("springBean.City2CSV");
		try {
			city2CSV.run(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
