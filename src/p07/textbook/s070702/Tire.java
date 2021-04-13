package p07.textbook.s070702;

public class Tire {
	public int maxRotation;
	public int accumulatedRitation;
	public String location;
	
	public Tire(String location, int maxRocation) {
		this.location = location;
		this.maxRotation = maxRocation;
	}
	
	public boolean roll() {
		++accumulatedRitation;
		if(accumulatedRitation < maxRotation) {
			System.out.println(location + "tire 수명 : " + (maxRotation-accumulatedRitation) + "회");
		return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
		
	}
}
