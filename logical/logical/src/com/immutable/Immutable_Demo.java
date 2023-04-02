package com.immutable;

final public class Immutable_Demo {

	private final int id;
	private final String name;
	private final int price;
	
	
	


	public Immutable_Demo(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Immutable_Demo modify(int id,String name,int price) {
		if (this.id==id && this.name==name && this.price==price) {
			return this;
		} else {
return new Immutable_Demo(id, name, price);
		}
		
	}


	@Override
	public String toString() {
		return "Immutable_Demo [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}


