package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingBatTest {
	
	
	@Test
	void wordEnds_ReturnsCharBeforeAndAfterString_c13i() {
		String expected = "c13i";
		String actual = CodingBat.wordEnds("abcXY123XYijk", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharAfterAndBeforeWord_13() {
		String expected = "13";
		String actual = CodingBat.wordEnds("XY123XY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharTwiceThatIsInTheMiddle_11() {
		String expected = "11";
		String actual = CodingBat.wordEnds("XY1XY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsBeforeAndAfterWhenOnlyTheWord() {
		String expected = "XY";
		String actual = CodingBat.wordEnds("XYXY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsNothingWhenNoOtherChars() {
		String expected = "";
		String actual = CodingBat.wordEnds("XY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsNothingWhenTheWordCannotBeFound() {
		String expected = "";
		String actual = CodingBat.wordEnds("Hi", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharsWhenThereAreMultipleOccurrencesOfWord() {
		String expected = "cxziij";
		String actual = CodingBat.wordEnds("abc1xyz1i1j", "1");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharsWithMultipleOccurrencesEndingInWord() {
		String expected = "cxz";
		String actual = CodingBat.wordEnds("abc1xyz1", "1");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharsWhenWordHasMultipleOccurrencesAndEndsInWordTwice() {
		String expected = "cxz11";
		String actual = CodingBat.wordEnds("abc1xyz11", "1");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharsWhenCharsAreAtEndAndBeginningOfWord() {
		String expected = "11";
		String actual = CodingBat.wordEnds("abc1xyz1abc", "abc");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsCharsBeforeAndAfterWithSingleLetterWord() {
		String expected = "acac";
		String actual = CodingBat.wordEnds("abc1xyz1abc", "b");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_ReturnsAllDigitsWhenRotatingBetweenWordPhraseAndNumber() {
		String expected = "1111";
		String actual = CodingBat.wordEnds("abc1abc1abc", "abc");
		assertEquals(expected, actual);
	}
	@Test
	void wordEnds_OtherTests() {
		String expected = "";
		String actual = CodingBat.wordEnds("", "");
		assertEquals(expected, actual);
	}


}
