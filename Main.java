
public class Main {
	public static void main(String[] args) {
		Bag bag1 = new Bag();
		bag1.setBrand("Polo");
		bag1.setColour("Red");
		bag1.setPriceRinggit(70);
		bag1.setVolumeLiters(25.5);
		System.out.println("---Bag 1---");
		System.out.printf("%-10s: %s%n", "Brand", bag1.getBrand());
		System.out.printf("%-10s: %s%n", "Colour", bag1.getColour());
		System.out.printf("%-10s: RM%d%n", "Price", bag1.getPrice());
		System.out.printf("%-10s: %.2fL%n", "Volume", bag1.getVolume());
		System.out.println("---SPECIAL DISCOUNT---");
		System.out.printf("%-10s: RM%d%n", "New price", bag1.changePrice(55));
				
		System.out.println("\n\n---Bag 2---");
		Bag bag2 = new Bag();
		bag2.setBrand("Adidas");
		bag2.setColour("Black");
		bag2.setPriceRinggit(99);
		bag2.setVolumeLiters(28.5);
		
		System.out.printf("%-10s: %s%n", "Brand", bag2.getBrand());
		System.out.printf("%-10s: %s%n", "Colour", bag2.getColour());
		System.out.printf("%-10s: RM%d%n", "Price", bag2.getPrice());
		System.out.printf("%-10s: %.2fL%n", "Volume", bag2.getVolume());
		System.out.println("---SPECIAL DISCOUNT---");
		System.out.printf("%-10s: RM%d", "New price", bag2.changePrice(75));

		
		
	}
}
