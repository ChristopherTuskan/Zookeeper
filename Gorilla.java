package animals;

public class Gorilla extends Mammal{
	
	public Gorilla() {}
	
	public void throwThings() {
		this.addEnergy(-5);
		System.out.println("The Gorilla is throwing things!");
	}
	
	public void getBananas() {
		this.addEnergy(10);
		System.out.println("The Gorilla is eating bananas!");
	}
	
	public void climb() {
		this.addEnergy(-10);
		System.out.println("The Gorilla is climbing!");
	}
}
