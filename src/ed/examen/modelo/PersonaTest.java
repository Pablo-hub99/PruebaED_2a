package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {
	Persona persona = new Persona("16637685Z", "Pablo", "Saenz");

	@Test
	public void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDni() {
		assertEquals("16637685Z", persona.getDni());
	}

	@Test
	public void testSetDni() throws Exception {
		persona.setDni("15189446z");
		assertEquals("11", persona.getDni());

		}
	

	@Test
	public void testGetNombre() {
		assertEquals("Pablo", persona.getDni());
	}

	@Test
	public void testSetNombre() {
		persona.setNombre("Laura");
		assertEquals("Laura", persona.getNombre());
	}
	

	@Test
	public void testGetApellido1() {
		assertEquals("Saenz", persona.getDni());
	}

	@Test
	public void testSetApellido1() {
		persona.setApellido1("Jimenez");
		assertEquals("Jimenez", persona.getApellido1());
	}

}
