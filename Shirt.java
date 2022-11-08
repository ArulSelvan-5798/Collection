package collection;

public class Shirt {
	private String brand;
	private int price;
	private boolean isChecked;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsChecked(boolean isChecked) {
		this.isChecked=isChecked;
	}
	public boolean getIsChecked() {
		return isChecked;
	}
	Shirt(String brand,int price,boolean isChecked){
		this.brand=brand;
		this.price=price;
		this.isChecked=isChecked;
	}
	public String toString() {
		return brand+" "+price+" "+isChecked;
	}

}
