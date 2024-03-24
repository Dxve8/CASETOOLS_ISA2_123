package dog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class dogTest {
   static dog a;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 a=new dog("mike","Bull dog");
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
		String t1=a.name;
		String t2=a.breed;
		assertEquals("mike",t1);
		assertEquals("Bull dog",t2);
	}

}
