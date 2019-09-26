package com.cg.lab2;

public abstract class Item {
	
	private int idNumber;
	private String title;
	private int copies;
	
	public Item(int id,String title,int copies){
		this.idNumber=id;
		this.title=title;
		this.copies=copies;
		System.out.println("Parametrized Constructor in Item class");
	}
	
	public Item() {
		this(0,"0",0);
		System.out.println("Default Constructor in Item class");
	}
	
	public int getId() {
		return idNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getCopies() {
		return copies;
	}

	@Override
	public String toString() {
		return "Item [identificationNumber=" + idNumber + ", title=" + title + ", copies=" + copies + "]";
	}
	
	public abstract void print();
	public abstract void checkIn();
	public abstract void checkOut();
	
	
	
	
}
