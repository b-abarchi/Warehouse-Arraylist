package prob1;

public class ItemTest {

	public static void main(String[] args) {
		testConstructor();
		testItemCost();
		testToString();
		testEquals_ReturnsTrue();
		testEquals_ReturnsFalse();
	}
	
	/**
	 * Verify that the name & weight are initialized with the constructor.
	 */
	public static void testConstructor() {
		System.out.println("-->testConstructor"); 
		Item i = new Item("Crackers", 2.25);
		System.out.print("expected: Crackers, 2.25\nActual:"); 
		System.out.print(i.getName() + ", "+ i.getWeight()+ "\n\n"); 
	}

	/**
	 * Verify that the cost method works correctly.
	 */
	public static void testItemCost() {
		System.out.println("-->testItemCost"); 
		Item i = new Item("Crackers", 2.25);
		System.out.print("expected cost: $4.5 \nActual:"); 
		System.out.print("$" + i.Cost()+ "\n\n"); 
	}

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		Item i = new Item("Crackers", 2.25);
		System.out.println(i);
	}
	//add two items with the same name, tests method should return true
	public static void testEquals_ReturnsTrue() {
		System.out.println("-->testEquals_ReturnsTrue"); 
		String name = "t";
		Item i = new Item("Crackers", 2.25);
		Item t = new Item("Crackers", 2.00);
		boolean a = i.equals(t);
		String expected = "true";
		String msg = "2 items, testEquals_ReturnsTrue(" + name + "): expected=" + expected +", actual=";
		System.out.println(msg+ "\n" + a + "\n\n");
	}
	//add two items with different names, test method should return false
	public static void testEquals_ReturnsFalse() {
		System.out.println("-->testEquals_ReturnsTrue"); 
		String name = "t";
		Item i = new Item("Crackers", 2.25);
		Item t = new Item("Pizza", 2.00);
		boolean a = i.equals(t);
		String expected = "false";
		String msg = "2 items, testEquals_ReturnsFalse(" + name + "): expected=" + expected +", actual=";
		System.out.println(msg+ "\n" + a + "\n\n");
	}
}
