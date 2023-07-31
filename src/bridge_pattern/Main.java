package bridge_pattern;

public class Main {
	public static void main(String[] args) {
		// Display 인스턴스 - StringDisplayImpl 인스턴스를 구현 객체로 가짐
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));

		// CountDisplay 인스턴스 - StringDisplayImpl 인스턴스를 구현 객체로 가짐
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, world."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, universe."));

		// Display 인스턴스의 display 메서드 호출 가능
		d1.display();
		d2.display();
		d3.display();   // CountDisplay 인스턴스의 multiDisplay 메서드 호출 불가능

		// CountDisplay 인스턴스의 multiDisplay 메서드 호출 가능
		d3.multiDisplay(5);
	}
}
