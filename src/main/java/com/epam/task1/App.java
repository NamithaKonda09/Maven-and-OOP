package com.epam.task1;
import java.util.Arrays;



public class App 
{
	static float[] res=new float[5];
	static int[] gift_id=new int[5];
	
	public static void sortgifts(Gift[] gifts)
	{
		for(int i=0;i<gifts.length;i++)
		{
			res[i]=gifts[i].rank;
			gift_id[i]=i+1;
		}
		int n = gifts.length; 
		
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (res[j] < res[j+1]) 
                { 
                     
                    float temp = res[j]; 
                    res[j] = res[j+1]; 
                    res[j+1] = temp;
                    int t=gift_id[j];
                    gift_id[j] = gift_id[j+1]; 
                    gift_id[j+1] = t;
                    
                } 
        
		
	
	}
	
    public static void main( String[] args )
    {
      
      Chocolates Chocolate_obj=new Chocolates();
     Candies Candy_obj=new Candies();
     Sweets Sweet_obj=new Sweets();
     Gift[] gifts=new Gift[5];
     gifts[0]=new Gift(Chocolate_obj.choc2(),Sweet_obj.Sweet1());
     gifts[1]=new Gift(Chocolate_obj.choc3(),Candy_obj.Candy2());
     gifts[2]=new Gift(Chocolate_obj.choc1(),Candy_obj.Candy1(),Sweet_obj.Sweet4());
     gifts[3]=new Gift(Chocolate_obj.choc2(),Candy_obj.Candy4(),Sweet_obj.Sweet3());
     gifts[4]=new Gift(Sweet_obj.Sweet2());
    	 
     sortgifts(gifts);
     System.out.println("Hierarchy of Children's gifts:(based of weight, cost and sweetness)");
      for(int i=0;i<5;i++)
      {
    	  System.out.println("Gift "+gift_id[i]+" "+res[i]);
      }

      
      
    }
}
