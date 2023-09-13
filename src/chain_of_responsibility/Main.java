package chain_of_responsibility;

// Support의 연쇄를 만들어 트러블을 일으키는 동작 테스트용 클래스
public class Main {
	public static void main(String[] args) {
		Support alice = new NoSupport("Alice"); // 아무도 처리하지 않음
		Support bob = new LimitSupport("Bob", 100); // 100 미만만 처리
		Support charlie = new SpecialSupport("Charlie", 429); // 429만 처리
		Support diana = new LimitSupport("Diana", 200); // 200 미만만 처리
		Support elmo = new OddSupport("Elmo"); // 홀수만 처리
		Support fred = new LimitSupport("Fred", 300); // 300 미만만 처리

		// 사슬의 형성
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

		// 다양한 트러블 발생
		for (int i = 0; i < 500; i += 33) {
			alice.support(new Trouble(i));
		}
	}
}
