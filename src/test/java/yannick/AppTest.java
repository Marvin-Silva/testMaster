package yannick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void name() {
		assertEquals("Hello World", Series1.helloWorld(null), "null name");
		assertEquals("Hello World", Series1.helloWorld(""), "blank name");
		assertEquals("Hello Manu", Series1.helloWorld("Manu"), "Manu name");
	}
