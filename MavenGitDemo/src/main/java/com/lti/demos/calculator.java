package com.lti.demos;

public class calculator {
	public String sayhello()
	{
		return "hello world";
	}
	public int addno(int x,int y)
	{
		int result= x+y;
		return result;
	}
	public int subno(int x,int y)
	{
		int result= x-y;
		return result;
	}
	public void searchemp(int empid)
	{
		if(empid==0) {
			throw new ArithmeticException(" u entered zero");
			
		}
		else {
			System.out.println("do something");
		}
	}
}
