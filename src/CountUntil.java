public class CountUntil {

	public static void count(Countable c, int maxCount) {
		for (int i = maxCount; i > 0; i--) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
	}
	
}