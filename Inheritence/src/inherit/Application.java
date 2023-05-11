package inherit;

public class Application {
	public static void main(String[] args) {
		Factary factary1=new Factary();
		Car car1=new Car();
		factary1.design();
		factary1.build();
		car1.design();
		car1.build();
		car1.brand();
	}

}
