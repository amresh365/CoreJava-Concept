package pacpolymo;

public class App {

	public static void main(String[] args) {
		Vechicle vechicle1= new Vechicle(); // here we create a instance of a vechile class;
		Car car = new Car();
	Vechicle vechicle2=car;	
	((Car) vechicle2).design();
	  car.ride();
	  Createdesign(car);
	  
	}
public static void Createdesign(Vechicle vechicle) {
	((Car) vechicle).design();
	 
	 
}
}
