
import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

import com.curso.v0.Modem;
import static com.curso.v0.Modem.priceIsInRange1;
import static com.curso.v0.Modem.priceIsInRange2;

public class TestOptional {

	// 2. Creating Optional Objects

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
		Optional<String> empty = Optional.empty();
		assertFalse(empty.isPresent());
	}

	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
		String name = "baeldung";
		Optional<String> opt = Optional.of(name);
		assertTrue(opt.isPresent());
	}

	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
		String name = null;
		Optional.of(name);
	}

	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
		String name = "baeldung";
		Optional<String> opt = Optional.ofNullable(name);
		assertTrue(opt.isPresent());
	}

	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		assertFalse(opt.isPresent());
	}

	// 3. Checking Value Presence: isPresent() and isEmpty()

	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("Baeldung");
		assertTrue(opt.isPresent());

		opt = Optional.ofNullable(null);
		assertFalse(opt.isPresent());
	}

	@Test
	public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
		Optional<String> opt = Optional.of("Baeldung");
		assertFalse(opt.isEmpty());

		opt = Optional.ofNullable(null);
		assertTrue(opt.isEmpty());
	}

	// 4. Conditional Action With ifPresent()

	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		// opt.ifPresent(name -> System.out.println(name.length()));
	}

	// 5. Default Value With orElse()

	@Test
	public void whenOrElseWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		assertEquals("john", name);
	}

	// 6. Default Value With orElseGet()
	@Test
	public void whenOrElseGetWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
		assertEquals("john", name);
	}

	public String getMyDefault() {
		System.out.println("Getting Default Value");
		return "Default Value";
	}

	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
		String text = null;

		String defaultText = Optional.ofNullable(text)
				// .orElseGet(this::getMyDefault);
				.orElseGet(() -> {
					System.out.println("Paso por el Supplier");
					return this.getMyDefault();
				});
		assertEquals("Default Value", defaultText);

		defaultText = Optional.ofNullable(text).orElse(getMyDefault()); // SI SE EJECUTO
		assertEquals("Default Value", defaultText);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseThrow(
				// () -> new IllegalArgumentException() );
				IllegalArgumentException::new);
	}

	@Test(expected = NoSuchElementException.class)
	public void whenNoArgOrElseThrowWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseThrow();
	}

	// 9. Returning Value With get()

	@Test
	public void givenOptional_whenGetsValue_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		String name = opt.get();
		assertEquals("baeldung", name);
	}

	@Test(expected = NoSuchElementException.class)
	public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
		Optional<String> opt = Optional.ofNullable(null);
		String name = opt.get();
	}

	// 10. Conditional Return With filter()

	@Test
	public void whenOptionalFilterWorks_thenCorrect() {
		Integer year = 2016;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
		assertTrue(is2016);
		boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
		assertFalse(is2017);
	}
	
	@Test
	public void whenFiltersWithoutOptional_thenCorrect() {
	    assertTrue(priceIsInRange1(new Modem(10.0)));
	    assertFalse(priceIsInRange1(new Modem(9.9)));
	    assertFalse(priceIsInRange1(new Modem(null)));
	    assertFalse(priceIsInRange1(new Modem(15.5)));
	    assertFalse(priceIsInRange1(null));
	}
	
	@Test
	public void whenFiltersWithOptional_thenCorrect() {
	    assertTrue(priceIsInRange2(new Modem(10.0)));
	    assertFalse(priceIsInRange2(new Modem(9.9)));
	    assertFalse(priceIsInRange2(new Modem(null)));
	    assertFalse(priceIsInRange2(new Modem(15.5)));
	    assertFalse(priceIsInRange2(null));
	}

}
