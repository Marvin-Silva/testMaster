package yannick;

import org.junit.jupiter.api.Test;

import yannick.Java.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
<<<<<<< HEAD


    public void name() {
		assertEquals("Hello World", App.name(null), "null name");
		assertEquals("Hello World", App.name(""), "blank name");
		assertEquals("Hello Manu", App.name("Manu"), "Manu name");
	}
=======
    
    public void name() {
        assertEquals("Hello Aurèle3000", App.name("Aurèle3000"), "Aurèlename");
    }
>>>>>>> aurele
}