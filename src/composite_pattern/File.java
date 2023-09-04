package composite_pattern;

// 파일을 표현하는 클래스(Entry 클래스의 하위 클래스)
public class File extends Entry {
	private String name;    // 파일명
	private int size;       // 파일 크기

	// 생성자 - ex) new File("readme.txt", 1000);
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	// entry 클래스에서 정의한 printList 메서드를 구현
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}
}
