package yannick;

import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import yannick.java.App;

=======
>>>>>>> 7d7094c434ddd142962498e3f580c84f52fc5e88
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
<<<<<<< HEAD


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
=======
>>>>>>> 7d7094c434ddd142962498e3f580c84f52fc5e88



    public void nameYannick() {
    assertEquals("Hello Yannick", App.nameYannick("Yannick"), "yannick name");
	  }

    public void nameAurele() {
      assertEquals("Hello Aurèle3000", App.nameAurele("Aurèle3000"), "Aurèlename");
    }

    public void nameYaz() {
      assertEquals("Hello Yaz", App.nameYaz("Yaz"),"Hello Yaz");
    }

    public void nameMarvin() {
      assertEquals("Hello Marvin", App.nameMarvin("Marvin"),"Marvin name");;
    }

    public void nameDonnat() {
      assertEquals("Hello Donnat", App.nameDonnat("Donnat"),"Donnat name");;
    }
  }