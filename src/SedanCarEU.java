
public class SedanCarEU extends Car {

	public SedanCarEU() {

	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Sedan!!!");
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order details: a Sedan was ordered";
	}
}
