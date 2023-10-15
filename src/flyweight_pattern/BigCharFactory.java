package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * BigCharFactory: BigChar의 인스턴스를 공유해서 생성하는 클래스
 */
public class BigCharFactory {
	// 이미 만들어진 BigChar의 인스턴스를 관리
	private Map<String, BigChar> pool = new HashMap<>();

	// Singleton 패턴
	private static BigCharFactory singleton = new BigCharFactory();

	// 생성자
	private BigCharFactory() {
	}

	// 유일한 인스턴스를 얻는다.
	public static BigCharFactory getInstance() {
		return singleton;
	}

	// BigChar의 인스턴스 생성(공유)
	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = pool.get(String.valueOf(charName));
		if (bc == null) {
			// 여기서 BigChar의 인스턴스를 생성
			bc = new BigChar(charName);
			pool.put(String.valueOf(charName), bc);
		}
		return bc;
	}
}
