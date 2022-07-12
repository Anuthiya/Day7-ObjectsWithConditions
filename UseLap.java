package trainingday7OBJECTSwithCONDITIONS;

public class UseLap {
	public static void main(String[] args) {
		Lap lap = new Lap();
		lap.lapName = "hp";
		lap.price = 40000;
		lap.rating = 4.5f;
		lap.tax = 1000;
		lap.netPrice = lap.price+lap.tax;
		lap.disAmount = 10000;
		
		Lap lap1 = new Lap();
		lap1.lapName = "Dell";
		lap1.price = 50000;
		lap1.rating = 4.5f;
		lap1.tax = 2000;
		lap1.netPrice = lap.price+lap.tax;
		lap1.disAmount = 10000;
		
		if (lap.price>lap1.price) {
			System.out.println(lap.netPrice-lap.disAmount);
		}
		else if (lap1.price>lap.price) {
			System.out.print(lap1.price-lap.disAmount);
		}
		else {
			System.out.println("not yet");
		
		}
	}

}
