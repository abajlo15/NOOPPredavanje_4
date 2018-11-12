
public class CabrioletCarEU extends Car {
	
	public CabrioletCarEU() {
		
	}
	
	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Cabrio!!!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order details: a Cabrio was ordered";
	}

}
