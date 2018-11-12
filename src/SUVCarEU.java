
public class SUVCarEU extends Car {
	
	public SUVCarEU() {
		
	}
	
	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for SUV!!!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order details: a SUV was ordered";
	}

}
