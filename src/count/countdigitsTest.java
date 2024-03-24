package count;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class countdigitsTest {
	static countdigits obj1;
	static countdigits obj2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
     
		obj1 = new countdigits(12345);
		obj2 = new countdigits(1232);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int tes=obj1.i;
		assertEquals(5,tes);
	}
	@Test
	void test2() {
		int tes=obj2.i;
		assertEquals(4,tes);
	}

}
