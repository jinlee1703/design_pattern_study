package observer_pattern;

// 관찰자를 나타내기 위한 인터페이스
public interface Observer {
	public abstract void update(NumberGenerator generator);
}
