package com.internousdev.ecsite.dto;

public class MasterItemDetailsDTO {
	public int id;
    public String itemName;
	public String itemPrice;
	public String itemStock;
	public String insert_date;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
	    this.itemPrice=itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
		this.itemStock=itemStock;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}

}
