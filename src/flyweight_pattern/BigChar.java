package flyweight_pattern;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * BigChar: '큰 문자'를 나타내는 클래스
 */
public class BigChar {
	// 문자의 이름
	private char charName;
	// 큰 문자를 표현하는 문자열 ('#' '.' '\n'으로 이루어진 열)
	private String fontData;

	// 생성자
	public BigChar(char charName) {
		this.charName = charName;
		try {
			// 파일로부터 큰 문자의 내용을 읽는다.
			String fileName = "src/flyweight_pattern/big/big" + charName + ".txt";
			StringBuilder sb = new StringBuilder();
			for (String line : Files.readAllLines(Path.of(fileName))) {
				// 파일에서 읽은 내용을 fontData에 저장한다.
				sb.append(line).append("\n");
			}
			this.fontData = sb.toString();
		} catch (Exception e) {
			this.fontData = charName + "?";
		}
	}

	// 큰 문자를 출력
	public void print() {
		System.out.print(fontData);
	}
}
