
public class Bag {
	String brand;
	String colour;
	int priceRinggit;
	double volumeLiters;
	
	public void setBrand(String bagBrand) {
		this.brand = bagBrand;
	}
	
	public void setColour(String bagColour) {
		this.colour = bagColour;
	}
	
	public void setPriceRinggit(int price) {
		this.priceRinggit = price;
	}
	
	public void setVolumeLiters(double vol) {
		this.volumeLiters = vol;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Integer getPrice() {
		return this.priceRinggit;
	}
	
	public double getVolume() {
		return this.volumeLiters;
	}
	
	public Integer changePrice(int newPrice) {
		return newPrice;
	}
	
	
}
