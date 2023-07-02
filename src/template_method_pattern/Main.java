package template_method_pattern;

public class Main {
	public static void main(String[] args) {
		// 'H'를 가진 CharDisplay 인스턴스를 1개 생성
		AbstractDisplay d1 = new CharDisplay('H');
		
		// "Hello, world."를 가진 StringDisplay 인스턴스를 1개 생성
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		
		// d1, d2 모두 AbstractDisplay의 하위 클래스의 인스턴스이므로 상속받은 display 메서드를 호출할 수 있음
		// 실제 동작은 CharDisplay나 StringDisplay에서 구현된 open, print, close 메서드에서 결정됨

		// d1.display() 실행
		System.out.println("[d1.display() 실행]");
		d1.display();
		
		// 구분자
		System.out.println();

		// d2.display() 실행
		System.out.println("[d2.display() 호출]");
		d2.display();
	}
}
