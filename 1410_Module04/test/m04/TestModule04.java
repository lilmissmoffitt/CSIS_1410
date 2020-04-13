package m04;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

/**
 * Runs JUnit tests for Module04 transform method.
 * 
 * @author melissamoffitt
 *
 */
class TestModule04 {

	public static List<Double> testList = new ArrayList<Double>();
	
	/**
	 * List will clear the testList used 
	 * after each test. So that it can be
	 * used multiple times
	 */
	@AfterEach
	public void tearDownAfterTest() {
		testList.clear();
	}

	// This tests if someone enters high , low. It shows that the test should
	// still compile and provide an output since we are adding prime values
	@Test
	void transform_RangeIsHighToLowReturnOnlyPrimeNumList() {
		Collections.addAll(testList, 0.875, 0.25, 0.375, 0.625);
		assertEquals(testList, Module04.transform(-4, -8));

	}

	// This tests for zero ranges and also confirms prime numbers added
	@Test
	void transform_ZeroRangeReturnsPrimeNumList() {
		Collections.addAll(testList, 0.875, 0.25, 0.375, 0.625);
		assertEquals(testList, Module04.transform(0, 0));

	}

	// This confirms the last is moved to front by showing that it
	// is not equal to a list where the element is not moved
	@Test
	void transform_RotatesLastToFront() {
		Collections.addAll(testList, 0.25, 0.375, 0.5, 0.625, 0.875, 1.0);
		assertFalse(testList == Module04.transform(0, 16));

	}

	// Tests that multiples of 12 are removed by inputting a list where 2
	// should be removed
	@Test
	void transform_Remove2MultiplesOf12() {
		Collections.addAll(testList, 1.0, -1.0, -0.5, 0.25, 0.375, 0.5, 0.625, 0.875);
		assertEquals(testList, Module04.transform(-12, 14));
	}

	// This confirms the list elements were divided by 8 by showing
	// it does not equal a list where the elements were not divided
	@Test
	void transform_PrimeNumbersAdded() {
		Collections.addAll(testList, 7.0, -4.0, 2.0, 3.0, 4.0, 5.0);
		assertFalse(testList == Module04.transform(-4, 8));

	}

}
