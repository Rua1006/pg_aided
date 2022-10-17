package bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay{
	private Random random = new Random();
	
	public RandomCountDisplay(DisplayImp1 imp1){
		super(imp1);
	}
	
	public void randomDisplay(int times){
		multiDisplay(random.nextInt(times));
	}
}