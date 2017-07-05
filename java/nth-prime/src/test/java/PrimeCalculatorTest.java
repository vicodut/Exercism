import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PrimeCalculatorTest {
    private PrimeCalculator primeCalculator;

    @Before
    public void setup() {
        primeCalculator = new PrimeCalculator();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testFirstPrime() {
        assertThat(primeCalculator.nth(1), is(2));
    }

    @Test
    public void testSecondPrime() {
        assertThat(primeCalculator.nth(2), is(3));
    }

    @Test
    public void testSixthPrime() {
        assertThat(primeCalculator.nth(6), is(13));
    }

    @Test
    public void testBigPrime() {
        assertThat(primeCalculator.nth(10001), is(104743));
    }

    @Test
    public void testUndefinedPrime() {
        thrown.expect(IllegalArgumentException.class);
        primeCalculator.nth(0);
    }

}
