public class CountTestApp {

	public static void main(String[] args) {

		System.out.println("Counting Cows...");
		System.out.println();
		System.out.println();
		Cow Stewe = new Cow();
		CountUntil.count(Stewe, 3);
		Stewe.resetCount();
		
		System.out.println();
		System.out.println();
		
		System.out.println("CountiCng Sheep...");
		System.out.println();
		System.out.println();
		Sheep ewe = new Sheep("Randy");
		CountUntil.count(ewe, 2);
		ewe.resetCount();
		
		System.out.println();
		System.out.println();
		
		Sheep sam = new Sheep();
		try {
			sam.cloneSheep(ewe, "Sam");
			sam.setName("Sam");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		CountUntil.count(sam, 3);
		
		System.out.println();
		System.out.println();
		
		CountUntil.count(ewe, 1);
		

	}

}