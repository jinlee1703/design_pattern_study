package prototype_pattern;

import prototype_pattern.framework.Product;

// UnderlinePen 클래스 : concretePrototype 역할, Cloneable 인터페이스 상속을 통해 복사 가능한 인터페이스임을 명시
public class UnderlinePen implements Product {
	private char ulchar;    // 문자열을 꾸미기 위한 문자

	/**
	 * 생성자
	 * @param ulchar 문자열을 꾸미기 위한 문자
	 */
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	/**
	 * use 메소드 : ulchar를 이용하여 문자열을 꾸며서 출력하는 메서드, 여기서는 문자열의 하단에 ulchar를 출력하여 꾸미는 것으로 구현
	 * @param s 사용할 문자열
	 */
	@Override
	public void use(String s) {
		int ulen = s.length();
		System.out.println(s);
		for (int i = 0; i < ulen; i++) {
			System.out.print(ulchar);
		}
		System.out.println();
	}

	/**
	 * createCopy 메소드 : 자기 자신을 복제하는 메서드
	 * @return 복사된 인스턴스
	 */
	@Override
	public Product createCopy() {
		Product p = null;

		// Cloneable 인터페이스를 구현한 클래스에서만 clone 메소드를 사용할 수 있으므로 예외처리를 해줘야 함
		try {
			p = (Product)clone();    // clone 메소드를 이용하여 복사, clone 메소드는 Cloneable 인터페이스를 구현한 클래스에서만 사용 가능
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
