package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction k=new jUnitFunction();
		String result=k.addString("aryan ","Gupta");
		assertEquals ("aryan Gupta",result);
	}

}
