package animals;

public abstract class Mammal {
	private int energy = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energy);
		return energy;
	}
	
	public void addEnergy(int change) {
		energy += change;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int newEnergyLevel) {
		energy = newEnergyLevel;
	}
}
