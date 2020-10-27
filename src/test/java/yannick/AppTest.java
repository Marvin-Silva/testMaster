package yannick;

import org.junit.jupiter.api.Test;

import yannick.java.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     * 
     * @return
     */
    @Test


    public void name() {
		assertEquals("Hello World", App.name(null), "null name");
		assertEquals("Hello World", App.name(""), "blank name");
		assertEquals("Hello Manu", App.name("Manu"), "Manu name");
	}


    /*
     * void testApp() { assertEquals(1, 1);
     */
    public void name() {
        assertEquals("Hello Yas", App.name("Yaz"),"Hello Yaz");

        /*void hello() {
		assertEquals("Hello World", Series1.helloWorld(null), "null name");*/



    }
    

}


>>>>>>> yaz
