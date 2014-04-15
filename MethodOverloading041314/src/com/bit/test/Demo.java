package com.bit.test;

public class Demo {

	public static void main(String[] args)
	{
	Car x=new Car();
		x.move(5);
		Bmw x1=new Bmw();
		x1.move(3.0);
		Car x2=new Bmw();
			x2.move(7);
			DemoStringPlay x3=new DemoStringPlay();
			System.out.println(x3.play1());
			x3.play();
			
			System.out.println(x3.play3());

	}

}
