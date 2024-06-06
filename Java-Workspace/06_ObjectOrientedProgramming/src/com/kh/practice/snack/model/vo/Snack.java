package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numof;
	private int price;
	
public Snack() {
	
	
}

public Snack(String kind, String name, String flavor, int numof, int price) {
	this.kind = kind;
	this.name = name;
	this.flavor =flavor;
	this.numof = numof;
	this.price = price;
	
	
}

public void setKind(String kind) {
	this.kind = kind;
	
}
public void setName(String name) {
	this.name = name;
	
}
public void setFlavor(String flavor) {
	this.flavor = flavor;
	
}

public void setNumof(int numof) {
	this.numof = numof;
	
}
public void setPrice(int price) {
	this.price = price;
	
}


public String getkind() {
	return kind;
	
}

public String getName() {
	return name;
}
public String getFlavor() {
	return flavor;
}

public int getNumOf() {
	return numof;
}

public int getPrice() {
	return price;
}

//빵(케이크-블루베리) 1개 15000원
public String information() {
 return kind+"("+name+" - "+flavor+") "+numof+"개"+price+"원";
}







}

