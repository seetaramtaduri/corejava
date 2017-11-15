package unittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test() {
		assertEquals(100,Calculation.findMax(new int[]{100,30,50,45}));
		assertEquals(45,Calculation.findMax(new int[]{0,30,0,45}));
	}

}
