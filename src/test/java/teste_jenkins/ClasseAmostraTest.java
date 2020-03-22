package teste_jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import teste_jenkins.ClasseAmostra;

public class ClasseAmostraTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSquare() {
		ClasseAmostra test=new ClasseAmostra();
		int output=test.square(5);
		assertEquals(25, output);
	}
	
	@Test
	public void testSum() {
		ClasseAmostra test=new ClasseAmostra();
		int output=test.sum(5);
		assertEquals(10, output);
	}
}
