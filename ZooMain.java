package animals;

public class ZooMain {

	public static void main(String[] args) {
		
		Gorilla nate = new Gorilla();
		
		nate.throwThings();
		nate.throwThings();
		nate.throwThings();
		
		nate.getBananas();
		nate.getBananas();
		
		nate.climb();
		
		nate.displayEnergy();
		
		System.out.print('\n');
		
		Bat zephyr = new Bat();
		
		zephyr.attackTown();
		zephyr.attackTown();
		zephyr.attackTown();
		
		zephyr.eatHumans();
		zephyr.eatHumans();
		
		zephyr.fly();
		zephyr.fly();
		
		zephyr.displayEnergy();
		
	}

}
