package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterTest {

	@ParameterizedTest
	@ValueSource(ints= {8,10,30,15,20})
	public void testIntanypar(int arg) {
		System.out.println(" arg :"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	@DisplayName(" should pass test cases if ")
	@ParameterizedTest
	@ValueSource(strings= {"hello world"})
	public void testParams(String msg)
	{
		Assertions.assertNotNull(msg);
	}
	@Test
 public void testLambdalist() {
	 Integer[] intAry= {10,20,5,25};
	 List<Integer> intList=Arrays.asList(intAry);
	 Assertions.assertAll(
			 ()-> assertEquals(10,intList.get(0)),
			 ()-> assertEquals(20,intList.get(1)),
			 ()-> assertEquals(5,intList.get(2)),
			 ()-> assertEquals(25,intList.get(3))
 );
	 }
}
