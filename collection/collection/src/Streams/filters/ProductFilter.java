package Streams.filters;

import java.util.ArrayList;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}
}

public class ProductFilter {

	public static void main(String[] args) {
		ArrayList<Product> l = new ArrayList<Product>();
		l.add(new Product(1, "hp", 25000));
		l.add(new Product(2, "Dell", 30000));
		l.add(new Product(3, "Lenovo", 28000));
		l.add(new Product(4, "sony", 23000));
		l.add(new Product(5, "Apple", 90000));

		l.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));
	}

}
