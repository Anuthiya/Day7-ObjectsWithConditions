package trainingday7OBJECTSwithCONDITIONS;

public class UsePen {
	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.brand = "Renolds";
		pen.price = 20;
		pen.colour = "Black";
		pen.tax = 2;
		pen.netPrice = pen.price+pen.netPrice;
		
		
		Pen pen1 = new Pen();
		pen1.brand = "Parker";
		pen1.price = 51;
		pen1.colour = "Pink";
		pen1.tax = 5;
		pen1.netPrice = pen.price+pen.netPrice;
		int total = pen.netPrice+pen1.price;
		
	    int len = pen.colour.length();
	    int len1 = pen1.colour.length();
		
		//String a = pen.brand+pen1.brand;
		//char b = a.charAt(a.length()/2);
		//if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
		//if (total%2==0) {
		if (len>len1) {
			System.out.println("pen length is higher");
		}
		else {
			System.out.println("pen1 length is higher");
		}
		}
		
	}


