package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {
	Curso curso = new Curso();

	@Test
	public void testEliminarAlumno() {
		Curso.aniadirAlumno("Pedro");
		
		int i = Curso.Alumno.size();
		Boolean eliminado = Curso.eliminarAlumno("Pedro");
		int j = Curso.Alumno.size();
		assertEquals(i-1, j);	
		assertTrue(eliminado);
	}

	@Test
	public void testAniadirAlumno() {
		int i = Curso.Alumno.size();
		Curso.aniadirAlumno("Pedro");
		int j = Curso.Alumno.size();
		
		assertEquals(i+1,j);
	
	}

	@Test
	public void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
