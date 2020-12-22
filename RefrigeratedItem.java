package prob1;

public class RefrigeratedItem extends Item{
private double temp;

public RefrigeratedItem(String name, double weight, double temp) {
	super(name, weight);
	this.temp = temp;
}
public RefrigeratedItem(Item i, double temp) {
	this(i.getName(), i.getWeight(), temp);
	
}
public double getTemp() {
	return temp;
	
}

public double Cost() {
	double cost = 0;
	cost = ((2 * weight) + (100 - temp) * 0.1);
	return cost;
	
}
@Override
public String toString() {
	String msg = "";
	return msg += String.format("name= %s, cost= $%.2f, weight= %.2f, temp= %.2f degrees", getName(), Cost(), getWeight(), getTemp());
}
}
