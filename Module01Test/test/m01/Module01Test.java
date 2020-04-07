package m01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests the methods transform1 and transform2 
 * in Module01.
 * 
 * @author melissamoffitt
 *
 */

class Module01Test {


	//Tests for method transform1
	@Test
	void transform1_CapitilizesEachLetter() {
		assertEquals("H_A_P_P_Y", Module01.transform1("happy"));
	}
	@Test
	void transform1_ChangesOnlyFirstCSToCSIS() {
		assertEquals("C_S_I_S_-_C_S_1_4_1_0", Module01.transform1("CS-CS1410"));
	}
	@Test
	void transform1_StringsThatBeginWithCSISWillNotBeChanged() {
		assertEquals("C_S_I_S_-_1_4_1_0", Module01.transform1("CSIS-1410"));
	}
	@Test
	void transform1_AllCharactersAreSeparatedBy_() {
		assertEquals("H_A_P_P_Y", Module01.transform1("happy"));
	}
	@Test
	void transform1_SingleLettersWillOnlyReturnASingleLetter() {
		assertEquals("A", Module01.transform1("A"));
	}
	@Test
	void transform1_AnEmptyStringWillReturnEmpty() {
		assertEquals("", Module01.transform1(""));
	}
	
	//Tests for method transform2
	@Test
	void transform2_ReturnsStr1InReversedOrderIfStringsAreEqualLength() {
		assertEquals("yppah", Module01.transform2("happy", "today"));
	}
	@Test
	void transform2_ReturnsEmptyWhenEmpty() {
		assertEquals("", Module01.transform2("", ""));
	}
	@Test
	void transform2_ReturnsNumbersIfProvided() {
		assertEquals("7", Module01.transform2("7", "a"));
	}
	@Test
	void transform2_ReturnsLongerStringIfOneIsAtTheEndOfTheOther() {
		assertEquals("cat", Module01.transform2("cat", "at"));
	}
	@Test
	void transform2_ReturnsOtherStringIfOneIsEmpty() {
		assertEquals("Utah", Module01.transform2("", "Utah"));
	}
	@Test
	void transform2_ReturnsLongerStringDespiteCapitalization() {
		assertEquals("caT", Module01.transform2("caT", "at"));
	}
	@Test
	void transform2_ChecksLongerStringWithSingleEndingLetter() {
		assertEquals("hohoho", Module01.transform2("hohoho", "O"));
	}
	@Test
	void transform2_AssumesStrEndInEmpty() {
		assertEquals("dOnE", Module01.transform2("dOnE", ""));
	}
	@Test
	void transform2_ReturnsStr2IfTheyDoNotEndInShorterString() {
		assertEquals("A", Module01.transform2("hi", "A"));
	}

}
