package animals;

public class Bat extends Mammal{
	
	public Bat() {
		this.setEnergy(300);
	}
	
	public void fly() {
		this.addEnergy(-50);;
		System.out.println("Whssshhh");
	}
	
	public void eatHumans() {
		this.addEnergy(25);
		System.out.println("Chomp Chomp");
	}
	
	public void attackTown() {
		this.addEnergy(-100);
		System.out.println("Burn it to the ground");
	}

}
