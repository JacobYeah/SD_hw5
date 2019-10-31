package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class MytestClass {

	 @BeforeClass
	  public static void testSetup() {
	  }

	  @AfterClass
	  public static void testCleanup() {
	  }

	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    test tester = new test();
	    tester.multiply(1000, 5);
	  }

	  @Test
	  public void testMultiply() {
	    test tester = new test();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }
	} 

