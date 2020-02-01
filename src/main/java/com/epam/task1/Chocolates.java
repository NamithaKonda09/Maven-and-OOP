package com.epam.task1;

public class Chocolates {
	int cost;
	int weight;
	int sweetness;
	static Chocolates obj=new Chocolates();
	Chocolates choc1()
	{
		obj.cost=100;
		obj.weight=20;
		obj.sweetness=10;
		return obj;
	}
	Chocolates choc2()
	{
		obj.cost=150;
		obj.weight=120;
		obj.sweetness=40;
		return obj;
	}
	Chocolates choc3()
	{
		obj.cost=180;
		obj.weight=60;
		obj.sweetness=50;
		return obj;
	}
	Chocolates choc4()
	{
		obj.cost=300;
		obj.weight=200;
		obj.sweetness=90;
		return obj;
	}

}
