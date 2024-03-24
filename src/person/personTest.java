package person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class personTest {
	static person ob;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ob = new person(30,"Asher");
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
		int t1=ob.age;
		String t2=ob.name;
		assertEquals(30,t1);
		assertEquals("Asher",t2);
	}

}
