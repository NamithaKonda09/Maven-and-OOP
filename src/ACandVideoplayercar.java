//INHERITENCE
public class ACandVideoplayercar extends VideoPlayerCar {

	public ACandVideoplayercar(String brand,String modelname,int maxspeed,int noofgears,int wheelbase)
	{
		super( brand,modelname, maxspeed, noofgears, wheelbase);
	}
	public void startcar()
	  {
		  System.out.println("started car , ac and videoplayer");
	  }
	public void  onAC(int speed)
	{
		System.out.println("AC is on with speed "+speed);
	}
}
