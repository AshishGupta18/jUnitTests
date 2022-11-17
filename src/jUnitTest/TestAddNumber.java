package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumber {
	@Test
	public void test() {
		jUnitFunction k=new jUnitFunction();
		int result=k.addNumbers(100,200);
		assertEquals (300,result);
	}
}