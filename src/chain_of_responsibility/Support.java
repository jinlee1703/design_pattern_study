package chain_of_responsibility;

// 트러블을 해결하는 추상 클래스
public abstract class Support {
	private String name; // 트러블 해결자의 이름
	private Support next; // 떠넘기는 곳

	// 트러블 해결자의 생성
	public Support(String name) {
		this.name = name;
	}

	// 떠넘기는 곳을 설정
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	// 트러블 해결의 수순
	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	// 트러블 해결자의 문자열 표현
	@Override
	public String toString() {
		return "[" + name + "]";
	}

	// 해결용 메소드
	protected abstract boolean resolve(Trouble trouble);

	// 해결했음
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	// 해결되지 않았음
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
