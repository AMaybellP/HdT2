import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

//Test de la calculadora con distintos valores para determinar si devuelve lo esperado
public class CalculadoraTest {
	private CalcuPost calcu;
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Test del metodo calcular
	public void testCalcular() throws Exception{
		assertEquals(15,calcu.Calcular("12+4*3+")); //calcular correctamente
	}
	
	//Test del metodo de leer archivo txt
	public void testLeerArchivo() throws Exception{
		assertEquals("abcd",calcu.LeerArchivo("prueba.txt")); //Leer correctamente 
	}

}
