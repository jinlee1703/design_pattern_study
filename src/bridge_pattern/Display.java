package bridge_pattern;

// Display 클래스 : '기능의 클래스 계층' 최상위에 있는 클래스
public class Display {
	// impl 필드 : Display 클래스의 '구현'을 나타내는 인스턴스, **두 클래스 계층의 다리 역할을 함**
	private DisplayImpl impl;

	// 생성자 : 구현을 나타내는 인스턴스를 인수로 받음
	public Display(DisplayImpl impl) {
		// 인수로 받은 인스턴스를 필드에 대입, 이후 처리에 사용됨
		this.impl = impl;
	}

	// open, print, close 메소드 : Display 클래스에서 제공하는 인터페이스(API)
	// 이 메소드들은 모두 DisplayImpl 클래스의 메소드를 호출함으로써, Display의 인터페이스가 DisplayImpl의 인터페이스로 변환

	// 표시의 전처리
	public void open() {
		impl.rawOpen();
	}

	// 표시 그 자체
	public void print() {
		impl.rawPrint();
	}

	// 표시의 후처리
	public void close() {
		impl.rawClose();
	}

	// display 메서드 : '표시한다'라는 처리를 실현
	public final void display() {
		open();
		print();
		close();
	}
}
