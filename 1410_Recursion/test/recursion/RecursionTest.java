package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * JUnit Tests to test sumOfDigits, countSmiles, and toUpper
 * in the Recursion class.
 * 
 * @author Melissa Moffitt
 *
 */

class RecursionTest {
//Tests for sumOfDigits Method
	@Test
	void sumOfDigits_AddsTheAbsoluteSumOfTheDigits() {
		assertEquals(7, Recursion.sumOfDigits(-34));
	}
	@Test
	void sumOfDigits_SumsNumbersOver1000() {
		assertEquals(12, Recursion.sumOfDigits(1038));
	}
	@Test
	void sumOfDigits_SumsPositiveNumbersUnder1000() {
		assertEquals(6, Recursion.sumOfDigits(123));
	}
	@Test
	void sumOfDigits_SumOfSingleDigit() {
		assertEquals(2, Recursion.sumOfDigits(2));
	}
	@Test 
	void sumOfDigits_SumOfDoubleDigits() {
		assertEquals(3, Recursion.sumOfDigits(12));
	}
	@Test
	void sumOfDigits_IfDigitIs0() {
		assertEquals(0, Recursion.sumOfDigits(0));
	}
	@Test
	void sumOfDigits_SumOf6Digits() {
		assertEquals(21, Recursion.sumOfDigits(123456));
	}
	@Test
	void sumOfDigits_ThatContainMulitple0s() {
		assertEquals(2, Recursion.sumOfDigits(1000010));
	}
	
//Tests for countSmiles method
	@Test
	void countSmiles_NoColonsOrParenthesis() {
		assertEquals(0, 
				Recursion.countSmiles("p.dkd., 9ujk..".toCharArray(), 0));
	}
	@Test
	void countSmiles_InputNull() {
		assertThrows(NullPointerException.class,() -> {Recursion.countSmiles(null, 0);});
	}
	@Test
	void countSmiles_AtTheBeginningAndEndOfTheArray() {
		assertEquals(2, 
				Recursion.countSmiles(":)Life is good :)".toCharArray()
						, 0));
	}
	@Test
	void countSmiles_AllInARow() {
		assertEquals(3, 
				Recursion.countSmiles("Happy Day :):):)!".toCharArray(), 0));
	}
	@Test
	void countSmiles_WithFrownyFaces() {
		assertEquals(0,
				Recursion.countSmiles(":(:(:(:(:(".toCharArray(), 0));
	}
	@Test
	void countSmiles_WhiteSpaceorCharsBetweenColonsAndParenthesis() {
		assertEquals(0,
				Recursion.countSmiles("a:b(c): )e ".toCharArray(), 0));
	}
	@Test
	void countSmiles_IndexStartingAfter0() {
		assertEquals(2,
				Recursion.countSmiles(":):):)".toCharArray(), 2));
	}
	@Test
	void countSmiles_DoubleColonsAndParenthesis() {
		assertEquals(3,
				Recursion.countSmiles("::)):))::)".toCharArray(), 0));
	}
	
//Test for toUpper method	
	@Test
	void toUpper_AllCharactersAreUpperCase() {
		assertEquals("H E L L O !", Recursion.toUpper("hello!"));
	}
	@Test
	void toUpper_DoubleSpacedBetweenWords() {
		assertEquals("H I T H E R E !", Recursion.toUpper("Hi  there!"));
	}
	@Test
	void toUpper_WhenBlank() {
		assertEquals("", Recursion.toUpper(""));
	}
	@Test
	void toUpper_WithLettersAndNumbers() {
		assertEquals("H E L L O 4 3 7 7 0", Recursion.toUpper("hello43770"));
	}
	@Test
	void toUpper_EndingInWhiteSpace(){
		assertEquals("H E L L O", Recursion.toUpper("hello   "));
	}
	@Test
	void toUpper_BeginningWithWhiteSpace() {
		assertEquals("H E L L O", Recursion.toUpper("     hello"));
	}
	@Test
	void toUpper_AllNumbers() {
		assertEquals("1 2 3 4 5 6 7 8 9", Recursion.toUpper("123456789"));
	}
	@Test
	void toUpper_WhenNull() {
		assertEquals(null, Recursion.toUpper(null));
	}
}
