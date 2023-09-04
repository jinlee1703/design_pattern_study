package composite_pattern;

import java.util.ArrayList;
import java.util.List;

// 디렉터리를 표현하는 클래스(Entry 클래스의 하위 클래스)
public class Directory extends Entry {
	private String name;    // 디렉터리명
	private List<Entry> directory = new ArrayList<>();    // 디렉터리 엔트리를 보관하기 위한 필드(디렉터리 크기를 동적 계산)

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	// 디렉터리 엔트리의 크기를 동적으로 얻기 위한 메서드
	// Composite 패턴의 특징: Directory던 File이던 getSize 메서드를 호출하면 크기를 얻을 수 있음 => '그릇과 내용물을 동일시한다'
	@Override
	public int getSize() {
		int size = 0;
		// directory 필드에 보관된 디렉터리 엔트리 요소를 하나씩 꺼내, 크기를 더해 반환
		for (Entry entry : directory) {
			size += entry.getSize();
		}
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		for (Entry entry : directory) {
			entry.printList(prefix + "/" + name);
		}
	}

	// 디렉터리 엔트리를 디렉터리에 추가
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}
}
