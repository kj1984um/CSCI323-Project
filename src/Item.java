

import java.text.NumberFormat;

public class Item {

	private String itemName, description, category;
	private int itemID;
	private double itemPrice;
	private String itemComment = "";
	private NumberFormat formatMoney = NumberFormat.getCurrencyInstance();
	private int orderMenuItemID; //This is used to get the actual item on the actual order (as opposed to just the item) for changes, i.e. deletion
	
//	public Item(String name,int num, double price){
//		setItemName(name);
//		setitemID(num);
//		setItemPrice(price);
//		
//	}
	
	public Item(String name,String description, String category, int num, double price){
		setItemName(name);
		setitemID(num);
		setItemPrice(price);
		setDescription(description);
		setCategory(category);
		
	}
	/**
	 * Overloaded constructor for DB to create items
	 * 
	 * @param name
	 * @param description
	 * @param category
	 * @param num
	 * @param price
	 * @param comment
	 * @param orderMenuItemID
	 */
	public Item(String name,String description, String category, int num, double price, String comment, int orderMenuItemID){
		setItemName(name);
		setitemID(num);
		setItemPrice(price);
		setDescription(description);
		setCategory(category);
		this.orderMenuItemID = orderMenuItemID;
		itemComment = comment;
	}
	
	public Item(String name,String description, String category, int num, double price, String comment){
		setItemName(name);
		setitemID(num);
		setItemPrice(price);
		setDescription(description);
		setCategory(category);
		setItemComment(comment);
		
	}
	
	public Item(){}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * Return orderMenuitemID
	 * @return
	 */
	public int getOrderMenuItemID(){
		return orderMenuItemID;
	}
	 
	public String toStringFull() {
		return  itemName + ", item number: " + itemID
				+ ", item price: " + formatMoney.format(itemPrice);
	}
	
	public String toString() {
		return itemName;
	}

	//Getter and Setters
	
	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getitemID() {
		return itemID;
	}


	public void setitemID(int itemID) {
		this.itemID = itemID;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItemComment() {
		return itemComment;
	}

	public void setItemComment(String itemComment) {
		this.itemComment = itemComment;
	}

	
}
