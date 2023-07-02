package template_method_pattern;

public class StringDisplay extends AbstractDisplay {
	private String string;      // 표시하기 위한 문자열을 저장하는 필드
	private int width;          // 표시하기 위한 문자열의 길이

	// 생성자에서 인수로 전달된 문자열 string을 필드에 저장
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	// open 메서드 : 시작 문자열 "<<"를 표시
	@Override
	public void open() {
		printLine();
	}

	// print 메서드 : 필드에 저장해 둔 문자를 1회 표시
	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	// close 메서드 : 종료 문자열 ">>"를 표시
	@Override
	public void close() {
		printLine();
	}


	// open 메서드와 close 메서드에서 "+-----+" 문자열을 표시하기 위해 호출하는 메서드
	private void printLine() {
		System.out.print("+");
		for(int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
