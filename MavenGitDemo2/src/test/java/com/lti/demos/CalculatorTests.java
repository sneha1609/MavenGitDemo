package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	calculator c=new calculator();
	
	@Test
	public void testCalcSayHello() {
		String msg =c.sayhello();
		Assertions.assertEquals("hello world",msg);
	}
	@Test
	
	public void testsubno() {
		int result= c.subno(23,8);
		Assertions.assertEquals(15,result,"check");
		
	}
@Test
	
	public void testaddno() {
		int result= c.addno(23,8);
		Assertions.assertEquals(15,result,"check");
		
	}
	@Disabled
	@Test
	public void testassertnulls() {
		String s1=null;
		String s2="Sneha";
		Assertions.assertNull(s1);
	}
	public void testArrays() {
		ArrayList<Integer> mylist=new ArrayList<>();
		Assertions.assertEquals(0, mylist.size());
	}
}
