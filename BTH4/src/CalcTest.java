import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
	private Calc calc;
	
	@Before
	public void setUp(){
		calc=new Calc();
	}
	
	@After
	public void tearDown(){
		calc=null;
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDiv(){
		int expected=calc.min(2,0);
	}
	
	@Test
	public void testAdd(){
		Calc calc=new Calc();
		int num1=2;
		int num2=3;
		int expected=5;
		assertEquals(expected,calc.add(num1, num2));
	}
	@Ignore("Not ready to test")
	@Test
	public void testMin(){
		Calc calc=new Calc();
		int num1=2;
		int num2=3;
		int expected=2;
		assertEquals(expected,calc.min(num1, num2));
	}
}
