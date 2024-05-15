package Test;

import programa.Piano;
import teclas.ElementoVisualTester;

public class test1 {

    @Test
    public void test1() {
        Piano piano = new Piano(36, 72);
        assertNotNull(piano);
        assertEquals(36, piano.getTeclaInicial());
        assertEquals(72, piano.getTeclaFinal());
        ElementoVisualTester tester = new ElementoVisualTester(piano);
        assertTrue(tester.hacerPrueba());

    }
}
