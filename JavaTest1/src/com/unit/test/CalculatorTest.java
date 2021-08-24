package com.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testadd() {
		System.out.println("In add test case");
		assertEquals(4,Calculator.add(2, 3));
	}
	@Test
	void testsub() {
		System.out.println("In sub test case");
		assertEquals(1,Calculator.sub(3, 2));
	}
	@Test
	void testaddtraining() {
		System.out.println("In add training");
		assertEquals(1,Calculator.addtraining(111, "java"));
	}
	@Test
	void testupdatetraining() {
		System.out.println("In update training");
		String output=Calculator.updatetraining(111, "junit");
		System.out.println(output);
		assertEquals("java",output);
	}
	@Test
	void testremovetraining() {
		System.out.println("In remove training");
		Calculator.addtraining(112, "C");
		System.out.println(Calculator.fetchAll());
		int out=Calculator.removetraining(112);
		System.out.println(Calculator.fetchAll());
		assertEquals(1,out);
	}
	

}
