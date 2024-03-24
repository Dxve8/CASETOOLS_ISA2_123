package fibo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fiboTest {
	static fibo ob1;
	static fibo ob2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ob1 = new fibo(7);
		ob2 = new fibo(6);
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
		int tes=ob1.n3;
		assertEquals(8,tes);
	}
	
	@Test
	void test2() {
		int tes=ob2.n3;
		assertEquals(5,tes);
	}

}
