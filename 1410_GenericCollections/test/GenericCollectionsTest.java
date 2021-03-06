import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import collections.GenericCollections;

class GenericCollectionsTest {

	public static List<Character> list = new ArrayList<>();
	public static List<String> strList = new ArrayList<>();
	public static List<Integer> intList = new ArrayList<>();
	public static List<Integer> intList2 = new ArrayList<>();

	@AfterEach
	public void tearDownAfterTest() {
		list.clear();
		strList.clear();
		intList.clear();
		intList2.clear();
	}

	@Test
	void lettersAndNumbers_IsListEmpty() {
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_IsListNull() {
		list.add(null);
		assertEquals(null, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_NumbersAreFormatted() {
		Collections.addAll(list, '1', '2', '3');
		Collections.addAll(strList, "N(1)", "N(2)", "N(3)");
		Collections.reverse(strList);
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_LowercaseLettersAreFormatted() {
		;
		Collections.addAll(list, 'a', 'b', 'c');
		Collections.addAll(strList, "L(a)", "L(b)", "L(c)");
		Collections.reverse(strList);
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_UppercaseLettersAreFormatted() {
		Collections.addAll(list, 'A', 'B', 'C');
		Collections.addAll(strList, "U(a)", "U(b)", "U(c)");
		Collections.reverse(strList);
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_DoesNotAcceptCharactersThatAreNotNumbersOrLetters() {
		Collections.addAll(list, 'A', '*', '$', 'c');
		Collections.addAll(strList, "U(a)", "L(c)");
		Collections.reverse(strList);
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_AcceptsMixedUpperLowerAndNumbers() {
		Collections.addAll(list, 'A', '*', '$', 'c', '4', 'B', 'z', '/', '3');
		Collections.addAll(strList, "U(a)", "L(c)", "N(4)", "U(b)", "L(z)", "N(3)");
		Collections.reverse(strList);
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	@Test
	void lettersAndNumbers_ListIsInReverseOrder() {
		Collections.addAll(list, 'A', '*', '$', 'c', '4', 'B', 'z', '/', '3');
		Collections.addAll(strList, "N(3)", "L(z)", "U(b)", "N(4)", "L(c)", "U(a)");
		assertEquals(strList, GenericCollections.lettersAndNumbers(list));
	}

	// tests for modify
	@Test
	void modify_ThrowsNullPointerException() {
		intList.add(null);
		assertThrows(NullPointerException.class, () -> GenericCollections.modify(intList));
	}

	@Test
	void modify_CountsUniqueNumbers() {
		Collections.addAll(intList, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);
		assertEquals(7, GenericCollections.modify(intList));
	}

	@Test
	void modify_MultiplesOf3AreRemoved() {
		;
		Collections.addAll(intList, 3, 3, 6, 9, 12, 18, 24);
		assertEquals(7, GenericCollections.modify(intList));
	}

	@Test
	void modify_RemovesNegativeMultiplesOf3() {
		;
		Collections.addAll(intList, -3, 3, 6, -9, 12, -18, 24);
		assertEquals(7, GenericCollections.modify(intList));
	}

	@Test
	void modify_StartingWithAnEmptyListReturnsDefaultValues() {
		assertEquals(7, GenericCollections.modify(intList));
	}

	@Test
	void modify_ListIsInAcendingOrderCount() {
		Collections.addAll(intList, 1, 2, 3, 4, 5, 6, 7);
		assertEquals(10, GenericCollections.modify(intList));
	}

	@Test
	void modify_IncludesNull() {
		Collections.addAll(intList, 1, 2, 3, 4, 5, 6, 7, null);
		assertThrows(NullPointerException.class, () -> GenericCollections.modify(intList));
	}

	// tests for removeEveryNthElement
	@Test
	void removeEveryNthElement_IfNull() {
		List<?> nthList = new ArrayList<String>();
		nthList.add(null);
		assertThrows(NullPointerException.class, () -> GenericCollections.removeEveryNthElement(nthList, 3));
	}

	@Test
	void removeEveryNthElement_IfZero() {
		List<?> nthList = new ArrayList<String>();
		assertThrows(IllegalArgumentException.class, () -> GenericCollections.removeEveryNthElement(nthList, 0));
	}

	@Test
	void removeEveryNthElement_IfNegative() {
		List<?> nthList = new ArrayList<String>();
		assertThrows(IllegalArgumentException.class, () -> GenericCollections.removeEveryNthElement(nthList, -4));
	}

	@Test
	void removeEveryNthElement_IfEmpty() {
		List<?> nthList = new ArrayList<String>();
		nthList.clear();
		List<?> nthList2 = new ArrayList<String>();
		GenericCollections.removeEveryNthElement(nthList, 1);
		assertEquals(nthList2, nthList);
	}

	@Test
	void removeEveryNthElement_WillNotRemoveIfNIsBiggerThanTheList() {
		List<?> nthList = new ArrayList<String>();
		nthList.clear();
		List<?> nthList2 = new ArrayList<String>();
		GenericCollections.removeEveryNthElement(nthList, 5);
		assertEquals(nthList2, nthList);
	}

	@Test
	void removeEveryNthElement_WillNotRemoveIfNIsBiggerThanTheListWithElements() {
		List<Object> nthList = Arrays.<Object>asList("one", 2, 3.14, 4);
		List<Object> nthList2 = Arrays.<Object>asList("one", 2, 3.14, 4);
		GenericCollections.removeEveryNthElement(nthList, 7);
		assertEquals(nthList2, nthList);
	}

	@Test
	void removeEveryNthElement_RemovesAllElementsIfNIsOne() {
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> ls = new ArrayList<Integer>();
		Collections.addAll(li, 1, 2, 3, 4);
		GenericCollections.removeEveryNthElement(li, 1);
		assertEquals(ls, li);
	}

	@Test
	void removeEveryNthElement_RemovesTheNthElement() {
		List<Integer> la = new ArrayList<Integer>();
		List<Integer> lb = new ArrayList<Integer>();
		Collections.addAll(la, 1, 2, 3, 4);
		Collections.addAll(lb, 1, 2, 3);
		GenericCollections.removeEveryNthElement(la, 4);
		assertEquals(lb, la);
	}

	@Test
	void removeEveryNthElement_RemovesTheNthElementMultipleTimes() {
		List<Integer> lc = new ArrayList<Integer>();
		List<Integer> ld = new ArrayList<Integer>();
		Collections.addAll(lc, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		Collections.addAll(ld, 1, 2, 4, 5, 7, 8);
		GenericCollections.removeEveryNthElement(lc, 3);
		assertEquals(ld, lc);
	}
}
