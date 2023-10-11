package observer_pattern;

// 간이 그래프로 수를 표시하는 클래스(Observer 인터페이스 구현)
public class GraphObserver implements Observer {
	@Override
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver: ");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
