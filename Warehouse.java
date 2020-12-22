package prob1;

import java.util.ArrayList;


	public class Warehouse{
		private ArrayList<Item> item = new ArrayList<>();
		private	ArrayList<RefrigeratedItem> refrigeratedItem = new ArrayList<>();
		public ArrayList<Item> getItem() {
			return item;
		}
		public int getNumItems() {
			return item.size();
		}
		public Warehouse() {}
		//add item
	public boolean addItem(Item i) { 
			if(item.contains(i)) {
			return false;
			}
			item.add(i);
			return true;
	}
	//get item using index
	public Item getItem(int loc) {
		if(loc > 0 && loc <= item.size()) {
			return item.get(loc);
		}
		return null;}
	////get item using name
	public Item getItem(String name) {
		Item dItem = new Item(name);
		int pos = item.indexOf(dItem);
		if(pos>=0) {
			return item.get(pos);
		}
		return null;}
	//// get the temperature avg
	public double getAverageTemp() {
		double avg = 0;
		double total = 0;
			for(Item i : item) {
				if(i instanceof RefrigeratedItem) {
					refrigeratedItem.add((RefrigeratedItem)i);
					total += ((RefrigeratedItem)i).getTemp();
					avg = total / getNumRefrigeratedItems();}
		}
		return avg;
		
	}
	public int getNumRefrigeratedItems() {
		return refrigeratedItem.size();
	}
	public ArrayList<RefrigeratedItem> getRefrigeratedItems() {
		for(Item i : item) {
			if(i instanceof RefrigeratedItem) {
				refrigeratedItem.add((RefrigeratedItem)i);
			}
		}
		return refrigeratedItem;
	}
	public double getTotalCost() {
		double totalCost = 0;
		for(Item i : item) {
				totalCost += i.Cost(); 
			}
		return totalCost;
		
	}
	
	public double getTotalCostRefrigerated() {
		double totalCost = 0;
	for(Item i : item) {
		if(i instanceof RefrigeratedItem) {
			totalCost += ((RefrigeratedItem)i).Cost(); 
	}
		}
	return totalCost;
	
	}
	
	public Item removeItem(int loc) {
		if(loc > 0 && loc <= item.size()) {
			Item returnedItem = item.get(loc);
			item.remove(loc);
			return returnedItem;
		}
		return null;
		}
	public Item removeItem(String name) {
		Item dItem = new Item(name);
		int pos = item.indexOf(dItem);
		Item returnedItem = item.get(pos);
		if(pos>=0) {
			item.remove(pos);
			return returnedItem ;}
		return null;
		}
	
	
	public ArrayList<Item> getItemsWithName(String partialName){
		ArrayList<Item> itemMatches = new ArrayList<>();
		int len = partialName.length();
		for(Item i : item) {
			if(i.getName().substring(0, len).equals(partialName)) {
				itemMatches.add(i);
			}
		}
		return itemMatches;
	}
	public boolean hasItem(String name) {
		for(Item i : item) {
			if(i.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		String msg = "";
		for(Item i : item) {
			msg += i.toString() + "\n";
		
		}
		return msg;}
	
	
		


}
