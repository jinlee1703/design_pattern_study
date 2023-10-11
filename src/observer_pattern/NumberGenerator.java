package observer_pattern;

import java.util.ArrayList;
import java.util.List;

// 수를 생성하는 객체를 나타내기 위한 추상 클래스
public abstract class NumberGenerator {
	// Observer들을 저장
	private List<Observer> observers = new ArrayList<>();

	// Observer를 추가
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// Observer를 삭제
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * Observer들에게 통지
	 */
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}

	// 수를 얻음
	public abstract int getNumber();

	// 수를 생성
	public abstract void execute();
}
