package trainingday7OBJECTSwithCONDITIONS;

public class UseObjCon1fridge {
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
		
		
		if (fridge.price>fridge1.price&&fridge.price>fridge2.price) {
			System.out.println(+fridge.price+" fridge price is higher");
		}
		else if (fridge1.price>fridge.price&&fridge1.price>fridge2.price) {
			System.out.println(+fridge1.price+" fridge1 price is higher");
		}
		else {
			System.out.println(+fridge2.price+" fridge2 price is higher");
		}
		
		
		
	}

}
