package cse360assign3;

/** Tests for mathematical operations and output
 *  @author Michael Saul
 *  @version Feb 22, 2016
 *  Pin Number# 804
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calculate = new Calculator();
		assertNotNull(calculate);
	}

	@Test
	public void testGetTotal() {
		Calculator calculate = new Calculator();
		assertEquals(0, calculate.getTotal());
		
		calculate.add(10);
		assertEquals(10, calculate.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calculate = new Calculator();
		
		calculate.add(10);
		assertEquals(10, calculate.getTotal());
		
		calculate.add(5);
		assertEquals(15, calculate.getTotal());
		
		calculate.add(-15);
		assertEquals(0, calculate.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calculate = new Calculator();
		
		calculate.add(15);
		assertEquals(15, calculate.getTotal());
		
		calculate.subtract(5);
		assertEquals(10, calculate.getTotal());
		
		calculate.subtract(10);
		assertEquals(0, calculate.getTotal());
		
		calculate.subtract(-5);
		assertEquals(5, calculate.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calculate = new Calculator();
		
		calculate.add(5);
		assertEquals(5, calculate.getTotal());
		
		calculate.multiply(3);
		assertEquals(15, calculate.getTotal());
		
		calculate.multiply(-2);
		assertEquals(-30, calculate.getTotal());
		
		calculate.multiply(0);
		assertEquals(0, calculate.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator calculate = new Calculator();
		
		calculate.add(15);
		assertEquals(15, calculate.getTotal());
		
		calculate.divide(3);
		assertEquals(5, calculate.getTotal());
		
		calculate.divide(-1);
		assertEquals(-5, calculate.getTotal());
		
		calculate.divide(0);
		assertEquals(0, calculate.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator calculate = new Calculator();
		assertEquals("", calculate.getHistory());
	}

}
