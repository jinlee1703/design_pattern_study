package chain_of_responsibility;

// 발생한 트러블을 나타내는 클래스, 트러블 번호(number)를 가짐
public class Trouble {
	private int number; // 트러블 번호

	// 트러블 생성
	public Trouble(int number) {
		this.number = number;
	}

	// 트러블 번호를 얻음
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[Trouble " + number + "]";
	}
}
