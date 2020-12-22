package prob1;

public class RefrigeratedItemTest {

	public static void main(String[] args) {
		testConstructorMain();
     	testConstructorAcceptsItem();   
		testItemCost();
     	testToString();
     	testEquals_ReturnsTrue();
     	testEquals_ReturnsFalse();
	}
	
	/**
	 * Verify that the name, weight, & temp are initialized with the main constructor.
	 */
	public static void testConstructorMain() {
		System.out.println("-->testConstructorMain"); 
		RefrigeratedItem r = new RefrigeratedItem("Pizza", 2.56, 40.00); 
		System.out.print("expected: Pizza, 2.56, 40.0\nActual:"); 
		System.out.print(r.getName()+ ", "+ r.getWeight()+ ", " + r.getTemp() + "\n\n");	}

	/**
	 * Verify that the name, weight, & temp are initialized with the second constructor.
	 */
	public static void testConstructorAcceptsItem() {
		System.out.println("-->testConstructorAcceptsItem"); 
		Item i = new Item("Pizza", 2.56);
		RefrigeratedItem r = new RefrigeratedItem(i, 40.00); 
		System.out.print("expected: Pizza, 2.56, 40.0\nActual:"); 
		System.out.print(r.getName() + ", "+ r.getWeight()+ ", "+ r.getTemp() +"\n\n");	
	}

	/**
	 * Verify that the cost method works correctly.
	 */
	public static void testItemCost() {
		System.out.println("-->testItemCost"); 
		Item i = new Item("turkey", 3.0);
		RefrigeratedItem r = new RefrigeratedItem(i, 10.00); 
		System.out.print("expected cost: 15.0 \nActual cost:"); 
		System.out.print(r.Cost() +"\n\n");	 
	}

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		Item i = new Item("Ice Cream", 1.00);
		RefrigeratedItem r = new RefrigeratedItem(i, 20.00); 
		System.out.println(r);
		
	}
	//add two refrigerated items with the same name, tests method should return true
		public static void testEquals_ReturnsTrue() {
			System.out.println("-->testEquals_ReturnsTrue"); 
			String name = "t";
			RefrigeratedItem i = new RefrigeratedItem("Crackers", 2.25, 10.00);
			RefrigeratedItem t = new RefrigeratedItem("Crackers", 2.25, 10.00);
			boolean a = i.equals(t);
			String expected = "true";
			String msg = "2 Refrigerated Items, testEquals_ReturnsTrue(" + name + "): expected=" + expected +", actual=";
			System.out.println(msg+ "\n" + a + "\n\n");
		}
		//add two items with different names, test method should return false
		//will be testing by passing and item and the temp
		public static void testEquals_ReturnsFalse() {
			System.out.println("-->testEquals_ReturnsTrue"); 
			String name = "t";
			Item i = new Item("Crackers", 2.25);
			Item f = new Item("Pizza", 2.00);
			RefrigeratedItem t = new RefrigeratedItem(f, 10.00);
			boolean a = i.equals(t);
			String expected = "false";
			String msg = "2 Refrigerated Items, testEquals_ReturnsFalse(" + name + "): expected=" + expected +", actual=";
			System.out.println(msg+ "\n" + a + "\n\n");
		}
}
