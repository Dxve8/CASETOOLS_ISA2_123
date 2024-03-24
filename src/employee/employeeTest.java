package employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class employeeTest {
	static employee ob;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		new employee("kimberly","CA");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ob.calculate(50000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		float tes=ob.CA;
		assertEquals(15,tes);
	}

}
