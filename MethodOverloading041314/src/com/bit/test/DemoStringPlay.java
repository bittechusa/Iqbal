package com.bit.test;

public class DemoStringPlay
{
	int a=8;
	String b="boy";
	String d=new String("Hello, Welcome to bittech");
	void play()
	{
		System.out.println(b.length());
		System.out.println(b.concat("  Girl"));
		String[] z=d.split(",");
		System.out.println(z[0]);
		System.out.println(z[1]);
	}
	
	boolean play1()
	{
		if(b.equals("boy"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	boolean play3()
	{
		if(d.contains("bittech"))
		{
			return true;
		}
		else
		{
			return false;
		
		}

    }
}
