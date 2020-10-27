package com.vikas.currencyconversionservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CurrencyConversionServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	//my first test written
	@Test
	void multiply() {
		assertEquals(16, 4*4);
	}
	@ParameterizedTest
	@ValueSource(strings = {"one", "one"})
	void check(String val) {
		assertTrue("one".equals(val));
	}
}
