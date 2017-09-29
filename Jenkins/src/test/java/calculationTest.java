import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculationTest {
	
	int x,y;
	calculation obj;

	@Before
	public void setUp() throws Exception {
		
		x=8;
		y=4;		
		obj= new calculation();
		
	}

	@After
	public void tearDown() throws Exception {
		
		x=0;
		y=0;		
		obj=null;
	}

	@Test
	public void testSubstract() {
		
		assertEquals(4,obj.substract(x, y));
		
	}
	@Test
	public void testmultiply() {
		
		assertEquals(32,obj.multiply(x, y));
		
	}

	@Test
	public void testaddition() {
		
		assertEquals(12,obj.addition(x, y));
		
	}
}
