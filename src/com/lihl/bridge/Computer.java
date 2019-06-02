package com.lihl.bridge;

public class Computer {
	
	protected Brand brand;
	
	public Computer() {
	}

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}

}


class Desktop extends Computer {
	
	public Desktop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("Desktop.sale()");
	}

}

class Laptop extends Computer {
	
	public Laptop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("Laptop.sale()");
	}
}


