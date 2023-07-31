package bridge_pattern;

// DisplayImpl 클래스 : '구현의 클래스 계층'의 최상위에 있는 클래스, 추상클래스, Display 클래스의 open, print, close 메서드에 대응하는 추상메서드를 선언
public abstract class DisplayImpl {

	public abstract void rawOpen();

	public abstract void rawPrint();

	public abstract void rawClose();
}
