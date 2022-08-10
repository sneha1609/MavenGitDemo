package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	void testexception() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{Integer.parseInt("one");}
		);
	}
	@Test
	public void testmethodExp()
	{
		calculator c= new calculator();
		final Exception e=assertThrows(ArithmeticException.class,()->{c.searchemp(0);});
		Assertions.assertEquals("you entered zero", e.getMessage());
	}

}
