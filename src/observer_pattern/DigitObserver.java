package observer_pattern;

// 숫자로 수를 표시하는 클래스(Observer 인터페이스 구현)
public class DigitObserver implements Observer {
	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver: " + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
