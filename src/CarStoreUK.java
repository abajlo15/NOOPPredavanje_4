
public class CarStoreUK extends CarStore {
	Car car;
	@Override
	public Car createCar(String type, String color) {
		
		if (type.equals("SUVUK")) {
			car = new SUVCarUK();
		} else if (type.equals("SedanUK")) {
			car = new SedanCarUK();
		} else if (type.equals("CabrioletUK")) {
			car = new CabrioletCarUK();
		} else if (type.equals("HatchbackUK")) {
			car = new HatchbackCarUK();
		} else {

			System.out.println("Not possible to manufacture!!!");
			car = null;
		}

		return car;

	}

}
