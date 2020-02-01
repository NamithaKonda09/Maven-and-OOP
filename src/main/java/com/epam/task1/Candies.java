package com.epam.task1;

public class Candies {
	int cost;
	int weight;
	int sweetness;
	static Candies candy=new Candies();
	Candies Candy1()
	{
		candy.cost=130;
		candy.weight=90;
		candy.sweetness=30;
		return candy; 
	}
	Candies Candy2()
	{
		candy.cost=500;
		candy.weight=120;
		candy.sweetness=0;
		return candy; 
	}
	Candies Candy3()
	{
		candy.cost=10;
		candy.weight=5;
		candy.sweetness=30;
		return candy; 
	}
	Candies Candy4()
	{
		candy.cost=150;
		candy.weight=50;
		candy.sweetness=70;
		return candy; 
	}
}
