package addmun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class addnumsTest {

	static addnums obj;
    static addnums obj1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new addnums(5,6);
		obj1= new addnums(2,5);
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
		int tes1=obj.sum;
		assertEquals(11,tes1);
	
	}
	
	@Test
	void test2() {
		int tes2=obj1.sum;
		assertEquals(7,tes2);
	}


}
