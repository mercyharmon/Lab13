public class Cow implements Countable {

	// Instance Variables
	int count;
	
	@Override
	public void incrementCount() {
		this.count++;
	}

	@Override
	public void resetCount() {
		this.count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return (count + " cow");
	}
	
	public String toString() {
		
		return (count + "cow");
	}

}