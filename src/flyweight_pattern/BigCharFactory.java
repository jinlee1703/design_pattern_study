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

	// BigChar의 인스턴스 생성(공유): synchronized 키워드를 사용하여 스레드 동기화를 통해, 메서드를 실행하는 동안 다른 스레드는 해당 메서드에 접근할 수 없도록 함으로써
	//                          여러 스레드가 동시에 이 메서드를 호출해도 BigChar 객체가 중복 생성되지 않고, 풀에서 이미 생성된 객체를 반환하도록 보장할 수 있다.
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
