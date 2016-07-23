import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	private CalcuPost calcu;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testCalcular() throws Exception{
		assertEquals(15,calcu.Calcular("12+4*3+")); //calcular correctamente
	}
	
	public void testLeerArchivo() throws Exception{
		assertEquals("abcd",calcu.LeerArchivo("prueba.txt")); //Leer correctamente 
	}

}
