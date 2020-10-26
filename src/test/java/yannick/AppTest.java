package yannick;

import org.junit.jupiter.api.Test;

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