
public class CarStoreEU extends CarStore {

	Car car;

	@Override
	public Car createCar(String type, String color) {
		if (type.equals("SUV")) {
			car = new SUVCarEU();
		} else if (type.equals("Sedan")) {
			car = new SedanCarEU();
		} else if (type.equals("Cabriolet")) {
			car = new CabrioletCarEU();
		} else if (type.equals("Hatchback")) {
			car = new HatchbackCarEU();
		} else {

			System.out.println("Not possible to manufacture!!!");
			car = null;
		}

		return car;

	}

}
