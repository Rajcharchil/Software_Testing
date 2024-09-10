package charchiltesing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumUnit {

	@Test
	void test() {
		DayTesting obj1 = new DayTesting();
		int output = obj1.square(4);
		assertEquals(16,output);

	}

}
