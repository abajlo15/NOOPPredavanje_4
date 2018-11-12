
public class HatchbackCarEU extends Car {

	public HatchbackCarEU() {

	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Hatchback!!!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order details: a Hatchback was ordered";
	}

}
