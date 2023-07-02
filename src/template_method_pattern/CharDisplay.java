package template_method_pattern;

public class CharDisplay extends AbstractDisplay {
	private char ch;        // 표시하기 위한 문자를 저장하는 필드

	// 생성자에서 인수로 전달된 문자 ch를 필드에 저장
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	// open 메서드 : 시작 문자열 "<<"를 표시
	@Override
	public void open() {
		System.out.print("<<");
	}

	// print 메서드 : 필드에 저장해 둔 문자를 1회 표시
	@Override
	public void print() {
		System.out.print(ch);
	}

	// close 메서드 : 종료 문자열 ">>"를 표시
	@Override
	public void close() {
		System.out.println(">>");
	}
}
