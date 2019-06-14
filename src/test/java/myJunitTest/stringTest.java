package myJunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringTest {

	/*
	 * case 1:input - "a"
	 * case 2:input - "b"
	 * case 3:input - ""
	 * case 4:input - "aA"
	 * case 5:input - "bb"
	 * case 6:input - "Aabcd"
	 * case 7:input - "qwertyasd"
	 */
	@Test
	public void test1() {
		StringManipulate sM=new StringManipulate();
		assertEquals("",sM.man("a"));
	}
	
	@Test
	public void test2() {
		StringManipulate sM=new StringManipulate();
		assertEquals("b",sM.man("b"));
	}
	
	@Test
	public void test3() {
		StringManipulate sM=new StringManipulate();
		assertEquals("",sM.man(""));
	}
	
	@Test
	public void test4() {
		StringManipulate sM=new StringManipulate();
		assertEquals("",sM.man("aA"));
	}
	
	@Test
	public void tes5t() {
		StringManipulate sM=new StringManipulate();
		assertEquals("bb",sM.man("bb"));
	}
	
	@Test
	public void test6() {
		StringManipulate sM=new StringManipulate();
		assertEquals("bcd",sM.man("Aabcd"));
	}
	
	@Test
	public void test7() {
		StringManipulate sM=new StringManipulate();
		assertEquals("qwertyasd",sM.man("qwertyasd"));
	}
}
