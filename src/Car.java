//ENCAPSULATION

public class Car {
  private String acrissCode;
  private String bodyType;
  private int fuelcapacity;
  private String fuelType;
  private int fuelefficiency;
  private int noofgears;
  private int maxspeed;
  private int wheelbase;
  private String brand;
  private String modelname;
  private int speed=0;
  private int changedgear=0;
  public boolean running=false;
  Car(String brand,String modelname,int maxspeed,int noofgears,int wheelbase)
  {
	this.brand=brand;
	this.modelname=modelname;
	this.maxspeed=maxspeed;
	this.noofgears=noofgears;
	this.wheelbase=wheelbase;
  }
  public void startcar()
  {
	  running=true;
	  changedgear=1;
  }
  public double accelerate(int k)
  {
	   speed=speed+k;
	  return speed;
	  
  }
  public int speed()
  {
	  return speed;
  }
  public boolean applybreak()
  {
	  speed=0;
	  return !running;
  }
  public int gear(int gear)
  {
	  changedgear=gear;
	  return changedgear;
  }
  

}
