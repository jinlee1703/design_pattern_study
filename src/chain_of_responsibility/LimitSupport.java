package chain_of_responsibility;

// 트러블을 해결하는 구현 클래스(특정 번호 미만의 트러블만 처리)
public class LimitSupport extends Support {
	private int limit; // 이 번호 미만이면 해결할 수 있음

	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		} else {
			return false;
		}
	}
}
