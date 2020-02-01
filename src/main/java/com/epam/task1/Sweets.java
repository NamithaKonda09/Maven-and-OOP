package com.epam.task1;

public class Sweets {

	int cost;
	int weight;
	int sweetness;
	static Sweets obj=new Sweets();
	Sweets Sweet1()
	{
		obj.cost=30;
		obj.weight=20;
		obj.sweetness=30;
		return obj;
	}
	Sweets Sweet2()
	{
		obj.cost=50;
		obj.weight=20;
		obj.sweetness=60;
		return obj;
	}
	Sweets Sweet3()
	{
		obj.cost=130;
		obj.weight=80;
		obj.sweetness=30;
		return obj;
	}
	Sweets Sweet4()
	{
		obj.cost=300;
		obj.weight=20;
		obj.sweetness=90;
		return obj;
	}
}
