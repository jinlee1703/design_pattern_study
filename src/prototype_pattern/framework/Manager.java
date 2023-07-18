package prototype_pattern.framework;

import java.util.HashMap;

// Manager 클래스 : Client 역할, 인스턴스 복사를 위한 클래스
public class Manager {
	// 복사할 인스턴스를 저장할 맵
	private HashMap showcase = new HashMap();

	/**
	 * register 메소드 : 복사할 인스턴스를 저장하는 메서드
	 * @param name 인스턴스의 이름
	 * @param proto 인스턴스
	 */
	public void register(String name, Product proto) {
		showcase.put(name, proto);    // 인스턴스 등록
	}

	/**
	 * create 메소드 : 저장된 인스턴스를 복사하여 반환하는 메서드
	 * @param protoname 복사할 인스턴스의 이름
	 * @return 복사된 인스턴스
	 */
	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);    // 저장된 인스턴스를 가져옴
		return p.createCopy();    // 복사된 인스턴스를 반환
	}
}
