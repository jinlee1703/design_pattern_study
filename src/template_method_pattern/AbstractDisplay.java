package template_method_pattern;

public abstract class AbstractDisplay {
	// 하위 클래스에 구현을 맡기는 추상 메서드 : open, print, close
	public abstract void open();
	public abstract  void print();
	public abstract void close();

	// 추상 메서드 AbstractDisplay에서 구현하는 메서드 : display
	public final void display() {
		open();
		for(int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
