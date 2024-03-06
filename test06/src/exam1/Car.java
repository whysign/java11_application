package exam1;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();	
	public abstract void turnoff();

	class car{
		public void start() {
			System.out.println("car");
		}
	}
	class Sonata extends car{
		public void start() {
			System.out.println("Sonata");
		}
		
	}
	class Avante extends car{
		public void start() {
			System.out.println("Abante");
		}
	}
	class Grander extends car{
		public void start() {
			System.out.println("Grander");
		}
	}
	class Genesis extends car{
		public void start() {
			System.out.println("Genesis");
		}
	}
	
	
}