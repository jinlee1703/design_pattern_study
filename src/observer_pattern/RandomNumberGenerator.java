package observer_pattern;

import java.util.Random;

// 난수를 생성하는 클래스(NumberGenerator를 상속)
public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();   // 난수생성기
	private int number;                     // 현재의 난수

	/**
	 * 생성한 난수를 취득하는 메서드
	 * @return
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * 난수를 생성하고 Observer들에게 통지하는 메서드
	 */
	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}
}
