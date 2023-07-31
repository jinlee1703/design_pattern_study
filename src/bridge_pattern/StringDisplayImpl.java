package bridge_pattern;

// StringDisplayImpl 클래스 : '구현의 클래스 계층'에 속하는 클래스, DisplayImpl 클래스의 하위 클래스
// rawOpen, rawPrint, rawClose 메서드를 구현함으로써 문자열을 표시
public class StringDisplayImpl extends DisplayImpl {
	private String string;
	private int width;

	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++)
			System.out.print("-");
		System.out.println("+");
	}
}
