package linkedList;

public class Laptop {
	
private String brand;
private int price;
private String color;
private String os;
private int RAM;
public Laptop(String brand, int price, String color, String os, int rAM) {
	
	this.brand = brand;
	this.price = price;
	this.color = color;
	this.os = os;
	RAM = rAM;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public int getRAM() {
	return RAM;
}
public void setRAM(int rAM) {
	RAM = rAM;
}

public String toString() {
	return "Laptop brand=" + brand + ", price=" + price + ", color=" + color + ", os=" + os + ", RAM=" + RAM;
}




}
