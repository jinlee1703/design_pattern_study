package bridge_pattern;

// CountDisplay 클래스 : '기능의 클래스 계층'에 속하는 클래스, Display 클래스에 기능을 추가한 클래스
public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	// CountDisplay 클래스에서 추가된 기능, Display 클래스에서 상속받응ㄴ open, print, close 메서드를 사용하여 multiDisplay라는 새로운 메서드를 구현
	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++)
			print();
		close();
	}
}
