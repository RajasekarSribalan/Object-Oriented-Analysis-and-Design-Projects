package udemy.oopsDesign.basics.abstractclass;

public abstract class Animal {

	String name;
	int height;
	int weightinLbs;

	public Animal(String name, int height, int weightinLbs) {
		super();
		this.name = name;
		this.height = height;
		this.weightinLbs = weightinLbs;
	}

	public void walk() {
		System.out.println("Walking .....");
	}

	public void eat() {
		System.out.println("eating .....");
	}
	
	public abstract void move();
}
