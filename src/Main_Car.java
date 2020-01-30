
public class Main_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car basic_model=new Car("Alto","R8",300,4,20);
Car basic_model2=new Car("Alto","A3",360,6,50);
VideoPlayerCar model3=new VideoPlayerCar("Altox","A4",360,8,50);
ACandVideoplayercar model4=new ACandVideoplayercar("Altoy","A5",360,10,50);
Car car;
System.out.println("Car:Basic_Model1");
System.out.println();

basic_model.startcar();
basic_model.accelerate(20);
System.out.println("Speed after accelaration :"+basic_model.accelerate(20));
basic_model.gear(4);
System.out.println("On gear:"+basic_model.gear(3));
basic_model.applybreak();
System.out.println("Is Running?:"+basic_model.applybreak());
System.out.println();

System.out.println("Car:Basic_Model2");
System.out.println();

basic_model2.startcar();
basic_model2.accelerate(20);
System.out.println("Speed after accelaration :"+basic_model2.accelerate(20+17));
System.out.println("On gear:"+basic_model2.gear(4));
basic_model2.applybreak();
System.out.println("Is Running?:"+basic_model2.applybreak());
System.out.println();
System.out.println("Car:Model3");
System.out.println();

model3.startcar();
model3.accelerate(15);
System.out.println("Speed after accelaration :"+model3.accelerate(40));
System.out.println("On gear:"+model3.gear(4));
model3.applybreak();
System.out.println("Is Running?:"+model3.applybreak());
model3.openvideoplayer();
model3.play();
model3.fastforward(10);
model3.increasevolume(6);

System.out.println();
System.out.println("Car:Model4");
System.out.println();

model4.startcar();
model4.accelerate(15);
System.out.println("Speed after accelaration :"+model4.accelerate(20+17));
System.out.println("On gear:"+model4.gear(4));
model4.applybreak();
System.out.println("Is Running?:"+model4.applybreak());
model4.openvideoplayer();
model4.onAC(3);
//dynamic Polymorphism
car=new VideoPlayerCar("Altoz","A6",180,6,90);
car.startcar();


car=new ACandVideoplayercar("Altoz","A6",180,6,90);
car.startcar();
	}

}
