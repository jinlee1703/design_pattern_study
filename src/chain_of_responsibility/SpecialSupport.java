package chain_of_responsibility;

// 트러블을 해결하는 구현 클래스(특정 번호 트러블만 처리)
public class SpecialSupport extends Support {
	private int number; // 이 번호만 해결할 수 있음

	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == number) {
			return true;
		} else {
			return false;
		}
	}
}
