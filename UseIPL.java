package trainingday7OBJECTSwithCONDITIONS;

public class UseIPL {
	public static void main(String[] args) {
		IPL ipl = new IPL();
		ipl.teamName = "Chennai Super Kings";
		ipl.cupsWon = 4;
		ipl.isFavorite = true;
		ipl.rating = 4.5f;
		
		IPL ipl1 = new IPL();
		ipl1.teamName = "Mumbai Indians";
		ipl1.cupsWon = 5;
		ipl1.isFavorite = true;
		ipl1.rating = 4.2f;
		
		IPL ipl2 = new IPL();
		ipl2.teamName = "Royal Challengers Bangalore";
		ipl2.cupsWon = 0;
		ipl2.isFavorite = true;
		ipl2.rating = 4.0f;
		
		int  len = ipl.teamName.length();
		int len1 = ipl1.teamName.length();
		int len2 = ipl2.teamName.length();
		
		//if (len>len1&&len>len2) {
		if (ipl.cupsWon>ipl1.cupsWon&&ipl.cupsWon>ipl2.cupsWon) { 
			System.out.println("Chennai Super Kings champion");
		}
		//else if (len1>len&&len1>len2) {
		else if (ipl1.cupsWon>ipl.cupsWon&&ipl1.cupsWon>ipl2.cupsWon) {
			System.out.println("Mumbai Indians is max champion");
		}
		else {
			System.out.println("Royal Challengers is max champion");
			
		}
		
		
	}

}
