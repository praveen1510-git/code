package arrayList;

public class Phone {
	private String brand;
	private String color;
	private int price;
	private float rating;
	private int editionYear;
	public Phone(String brand, String color, int price, float rating, int editionYear) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.rating = rating;
		this.editionYear = editionYear;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getEditionYear() {
		return editionYear;
	}
	public void setEditionYear(int editionYear) {
		this.editionYear = editionYear;
	}
	
	public String toString() {
		return "Phone brand=" + brand + ", color=" + color + ", price=" + price + ", rating=" + rating
				+ ", editionYear=" + editionYear ;
	}
	
	
	

}
