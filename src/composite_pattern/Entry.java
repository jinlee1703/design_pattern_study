package composite_pattern;

// Fire과 Directory를 동일시하기 위한 추상 클래스
public abstract class Entry {
	// 이름을 얻기 위한 메서드
	public abstract String getName();

	// 크기를 얻기 위한 메서드
	public abstract int getSize();

	// 목록을 표시하기 위한 메서드
	public void printList() {
		printList("");
	}

	// prefix를 앞에 붙여서 목록을 표시하기 위한 메서드
	protected abstract void printList(String prefix);

	// 문자열을 표시하기 위한 메서드
	// Template Method 패턴 활용: 추상 메서드인 getName과 getSize를 사용함으로써 하위 클래스의 구현을 기대함
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
