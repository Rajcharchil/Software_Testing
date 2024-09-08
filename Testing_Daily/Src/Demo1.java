package charchiltesing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1 {

	@Test
	void test() {
//		fail("Not yet implemented");
		DayTesting cal = new DayTesting ();
		assertNotEquals(5, cal.add(2,3));
		assertEquals(-5, cal.add(-2,-3));
		assertEquals(1, cal.add(-2,3));
		assertEquals(0, cal.add(0,0));
		
	}

}
