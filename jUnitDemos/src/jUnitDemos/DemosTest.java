package jUnitDemos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class DemosTest {

	@Test
	@DisplayName("Length Basic")
	void length_basic() {
		int actualLength = "ABCDC".length();
		int expectedLength = 5;
		assertEquals(actualLength, expectedLength);
	}
	
	@Test
	void length_greater_than_zero() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("AB".length() > 0);
		assertTrue("DEF".length() > 0);
	}
	
	@ParameterizedTest
	@DisplayName("Varios")
	@ValueSource(strings = { "ABCD", "ABC", "AZx", "DEF" })
	void length_greater_than_zero(String str) {
		assertTrue(str.length() > 2);
	}
	
	@ParameterizedTest(name = "{0} a Mayúsculas es {1}")
	@CsvSource(value = {    "abcd, ABCD", 
							"abc, ABC", 
							"'',''", 
							"abcdef, ABCDEF" })
	void uppercase(String word, String capitalizedWord) {
		assertEquals(word.toUpperCase(), capitalizedWord );
	}
	
	@ParameterizedTest(name = "{0} tamaño es {1}")
	@CsvSource(value = { "abcd, 4", "abc, 3", "'',0", "abcdefg, 7" })
	void length(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
	}
	
	@Test
	@DisplayName("When length is null, throw an exception")
	void length_exception() {
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());
	}

}
