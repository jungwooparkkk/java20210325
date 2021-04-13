package p07.textbook.s070702;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRitation;
		if(accumulatedRitation < maxRotation) {
			System.out.println(location + "hankookTire 수명 :" + (maxRotation - accumulatedRitation) + "회");
		return true;
		}else {
			System.out.println("***" + location + "hankookTire 펑크 ***");
			return false;
		}
	}
}
