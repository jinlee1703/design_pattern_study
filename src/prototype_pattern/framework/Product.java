package prototype_pattern.framework;

// Product 인터페이스 : Prototype 역할, Cloneable 인터페이스 상속을 통해 복사 가능한 인터페이스임을 명시
public interface Product extends Cloneable {
	/**
	 * use 메소드 : 사용을 위한 메서드, 하위 클래스의 구현에 따라 다르게 작동
	 * @param s 사용할 문자열
	 */
	public abstract void use(String s);

	/**
	 * createCopy 메소드 : 인스턴스 복제를 위한 메서드
	 * @return 복사된 인스턴스
	 */
	public abstract Product createCopy();
}
