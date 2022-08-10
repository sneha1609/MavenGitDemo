package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestbeforeAfter {
	calculator c=new calculator();
	int sum;
   @BeforeEach
   public void teststartup() {
	   sum=0;
	   System.out.println(" sum is zero"+sum);
   }
   @BeforeAll
   public static void teststartDbConn() {
	   System.out.println("db connection is up only one");
   }
	@Test
	public void testsubno() {
		System.out.println("test case 1");
		int result= c.subno(23,8);
		Assertions.assertEquals(15,result,"check");
		
	}
    @Test
    public void testaddno() {
    	System.out.println("test case 2");
	int result= c.addno(23,8);
	Assertions.assertEquals(31,result,"check");
	
}
    @AfterEach
    public void testshutdown() {
    	System.out.println("some object null");
    }
    

}
