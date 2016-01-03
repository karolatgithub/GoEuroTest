/**
 * 
 */
package pl.noriSoftware.goEuro.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import pl.noriSoftware.goEuro.ICity2CSV;
import pl.noriSoftware.goEuro.dto.City;
import au.com.bytecode.opencsv.CSVWriter;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/**
 * @author karol
 *
 */
public class City2CSV implements ICity2CSV {
	final protected Logger logger = LoggerFactory.getLogger(getClass());
	private final RestTemplate restTemplate = new RestTemplate();

	private String url;

	public void setUrl(String a) {
		url = a;
	}

	public void run(final String cityName) throws IOException {
		final City[] cities = restTemplate.getForObject(url + cityName,
				City[].class);
		if (logger.isDebugEnabled()) {
			for (City city : cities) {
				logger.debug("city:{}", city.toString());
			}
		}
		final File file = new File(cityName + ".csv");
		final CSVWriter writer = new CSVWriter(new FileWriter(file));
		for (City city : cities) {
			writer.writeNext(city.toStrings());
		}
		writer.close();
	}

	@SuppressWarnings("unused")
	private List<HttpMessageConverter<?>> getMessageConverters() {
		final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter
				.getObjectMapper()
				.setPropertyNamingStrategy(
						PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(converter);
		return converters;
	}
}
