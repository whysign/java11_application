package sec2;

public class Birds extends Animal{
	
	private int wings;
	private boolean fly;
	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public String toString() {
		return "Birds wings=[" + wings + "], name[" + super.getName() + "]";
	}
	
}
