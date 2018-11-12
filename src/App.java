import java.awt.Color;

public class App {

	public static void main(String[] args) {
		
	CarStore car = new CarStoreEU();
	car.orderCar("Sedan", "black");
	CarStore carUK = new CarStoreUK();
	carUK.orderCar("SUVUK", "red");
		
	}

}
