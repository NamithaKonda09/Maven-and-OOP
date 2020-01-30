//INHERITENCE
//STATIC POLYMORPHISM
interface remote{
	void openvideoplayer();
	void increasevolume(int val);
	void decreasevolume(int val);
	void increasevolume();
	void decreasevolume();
	void fastforward(int val);
	void play();
	void pause();
	void poweroff();
	
	
}
public class VideoPlayerCar extends Car implements remote {
	public VideoPlayerCar(String brand,String modelname,int maxspeed,int noofgears,int wheelbase)
	{
		super( brand,modelname, maxspeed, noofgears, wheelbase);
	}

	public void startcar()
	  {
		  System.out.println("started car and videoplayer");
	  }
	public void openvideoplayer()
	{
	System.out.println("Select Video to watch on Video player");	
	}
	public void pause()
	{
		System.out.println("paused");
	}
	public void play()
	{
		System.out.println("playing");
	}
	public void poweroff()
	{
		System.out.println("Shutting down");
	}
	public void increasevolume(int val)
	{
		System.out.println("volume is increased by "+val);
	}
	public void decreasevolume(int val)
	{
		System.out.println("volume is decreased by "+val);
	}
	public void increasevolume()
	{
		System.out.println("volume is increased by "+1);
	}
	public void decreasevolume()
	{
		System.out.println("volume is decreased by "+1);
	}
	public void fastforward(int val)
	{
		System.out.println("forwareded to "+val +" seconds.");
	}

}
