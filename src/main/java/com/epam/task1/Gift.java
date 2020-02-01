package com.epam.task1;

public class Gift {
	Chocolates Chocolate_obj=new Chocolates();
    Candies Candy_obj=new Candies();
    Sweets Sweet_obj=new Sweets();
    int weight;
    int cost;
    int sweetness;
   float rank;
    Gift(Chocolates Chocolate_obj,Candies Candy_obj,Sweets Sweet_obj)
    {
    	weight=Chocolate_obj.weight+Candy_obj.weight+Sweet_obj.weight;
    	cost=Chocolate_obj.cost+Candy_obj.cost+Sweet_obj.cost;
    	sweetness=Chocolate_obj.sweetness+Candy_obj.sweetness+Sweet_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    Gift(Chocolates Chocolate_obj,Candies Candy_obj)
    {
    	weight=Chocolate_obj.weight+Candy_obj.weight;
    	cost=Chocolate_obj.cost+Candy_obj.cost;
    	sweetness=Chocolate_obj.sweetness+Candy_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    Gift(Chocolates Chocolate_obj,Sweets Sweet_obj)
    {
    	weight=Chocolate_obj.weight+Sweet_obj.weight;
    	cost=Chocolate_obj.cost+Sweet_obj.cost;
    	sweetness=Chocolate_obj.sweetness+Sweet_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    Gift(Candies Candy_obj,Sweets Sweet_obj)
    {
    	weight=Candy_obj.weight+Sweet_obj.weight;
    	cost=Candy_obj.cost+Sweet_obj.cost;
    	sweetness=Candy_obj.sweetness+Sweet_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    Gift(Candies Candy_obj)
    {
    	weight=Candy_obj.weight;
    	cost=Candy_obj.cost;
    	sweetness=Candy_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    Gift(Sweets Sweet_obj)
    {
    	weight=Sweet_obj.weight;
    	cost=Sweet_obj.cost;
    	sweetness=Sweet_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    Gift(Chocolates Chocolate_obj)
    {
    	weight=Chocolate_obj.weight;
    	cost=Chocolate_obj.cost;
    	sweetness=Chocolate_obj.sweetness;
    	rank=(weight/cost)+sweetness;
    	
    }
    

}
