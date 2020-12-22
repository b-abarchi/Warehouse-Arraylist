	package prob1;
	public class Item {
	protected String name;
	protected double weight;
	public Item(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public Item(String name) {
		this(name, 0.0);
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public double Cost() {
		double cost = 0;
		cost = weight * 2;
		return cost;
	}
	@Override
	public String toString() {
		String msg = "";
		return msg += String.format("name= %s, cost= $%.2f, weight= %.2f", getName(), Cost(), getWeight());
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Item){
			Item i = (Item)o;
			return (this.name.equals(i.name));
		}
		return false;
	}
	}
