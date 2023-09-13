package chain_of_responsibility;

// 트러블을 해결하는 구현 클래스(항상 '처리하지 않음')
public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false; // 항상 '처리하지 않음'
	}
}
