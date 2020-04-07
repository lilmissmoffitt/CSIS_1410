package labInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Tests Class Plane's methods to ensure the output is correct
 * 
 * @author melissamoffitt
 *
 */
class PlaneTest {
	private static ByteArrayOutputStream message;
	private static PrintStream consoleOutput;
	private Plane plane = new Plane(4, "Boing 747");

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		consoleOutput = System.out;

		message = new ByteArrayOutputStream();
		PrintStream newOutput = new PrintStream(message);
		System.setOut(newOutput);

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// set System.out back to console output
		System.setOut(consoleOutput);
	}

	@Test
	void toString_verifyPrintedMessage() {

		String expected = "Boing 747 with 4 engines";
		String actual = plane.toString();
		assertEquals(expected, actual);

	}

	@Test
	void launch_verifyPrintedMessage() {
		plane.launch();
		String expected = "Rolling until take-off" + System.lineSeparator();
		String actual = message.toString();
		assertEquals(expected, actual);

		message.reset();
	}

	@Test
	void land_verifyPrintedMessage() {
		plane.land();
		String expected = "Rolling to a stop" + System.lineSeparator();
		String actual = message.toString();
		assertEquals(expected, actual);

		message.reset();
	}

}
