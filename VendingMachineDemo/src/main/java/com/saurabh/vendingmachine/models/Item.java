package com.saurabh.vendingmachine.models;

public enum Item {
	CHOCOLATES("Chocolates", 25), CANDY("Candy", 30), COLDDRINK("ColdDrink", 45);
	
	 private String name;
	    private int price;
	   
	    private Item(String name, int price){
	        this.name = name;
	        this.price = price;
	    }
	   
	    public String getName(){
	        return name;
	    }
	   
	    public long getPrice(){
	        return price;
	    }

}
