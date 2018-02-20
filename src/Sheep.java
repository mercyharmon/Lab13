public class Sheep implements Countable, Cloneable {

	// Instance Variables
	int count;
	String name;

	public Sheep() {

	}

	public Sheep(String name) {
		this.name = name;
	}

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
		return this.count;
	}

	@Override
	public String getCountString() {
		return (this.count + " " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public Sheep cloneSheep(Sheep s, String name) throws CloneNotSupportedException {
		Sheep newSheep;
			newSheep = (Sheep) s.clone();
			newSheep.setName(name);
		
		return newSheep;
	}

}