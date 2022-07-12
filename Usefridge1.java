package trainingday7OBJECTSwithCONDITIONS;

public class Usefridge1 {
	public static void main(String[] args) {
		ObjCon1fridge fridge = new ObjCon1fridge();
		fridge.brand = "onida";
		fridge.price = 10000;
		fridge.colour = "blue";
		fridge.tax = 2000;
		fridge.netPrice = fridge.price+fridge.tax;
		
		ObjCon1fridge fridge1 = new ObjCon1fridge();
		fridge1.brand = "LG";
		fridge1.price = 20000;
		fridge1.colour = "white";
		fridge1.tax = 4000;
		fridge1.netPrice = fridge.price+fridge.tax;
		
		ObjCon1fridge fridge2 = new ObjCon1fridge();
		fridge2.brand = "Samsung";
		fridge2.price = 30000;
		fridge2.colour = "Red";
		fridge2.tax = 5000;
		fridge2.netPrice = fridge.price+fridge.tax;
		
		
		if (fridge1.brand.contains("a")||fridge1.brand.contains("e")||fridge1.brand.contains("i")||fridge1.brand.contains("o")||fridge1.brand.contains("u")) {
			System.out.println("contains vowels");
		}
		else {
			System.out.println("doesnot contains vowels");
		}
		
		
		
	}

}



