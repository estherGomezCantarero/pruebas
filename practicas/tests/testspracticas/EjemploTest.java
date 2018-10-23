package testspracticas;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class EjemploTest {

	@Test
	public void test1()
	{
		
		int x = 2 , y = 5;
		assertTrue(x+y ==7);
	}
	
	@Test
	public void test2()
	{
		
		int x = 2 , y = 5;
		assertTrue(x-y ==7);
	}
}
