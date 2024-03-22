package creational.singleton;

public class Singleton {
	private static Singleton instance;
	private int msg;
	private Singleton(int msg) {
		this.msg= msg;
	}
	public static Singleton getInstance(int msg) {
		if(instance==null) {
			instance = new Singleton(msg);
		}
		return instance;
	}
	public void print() {
		System.out.println(msg);
	}
}
