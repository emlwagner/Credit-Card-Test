package creditCardTest;

import static org.junit.Assert.*;
import creditCard.cardNumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCreditCard {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsValidTrue() {
		String number = "1234567812345670";
		assertTrue(cardNumber.isValid(number));
	}
	
	@Test
	public void testIsValidNotTrue() {
		String number = "1234567812345677";
		assertFalse(cardNumber.isValid(number));
	}

}
