package org.kh.app2;

public class Man {

	int age;
	String name;
	String mar;
	int pis;
	@Override
	public String toString() {
		return "Man [age=" + age + ", name=" + name + ", mar=" + mar + ", pis=" + pis + "]";
	}
	public Man(int age, String name, String mar, int pis) {
		super();
		this.age = age;
		this.name = name;
		this.mar = mar;
		this.pis = pis;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public int getPis() {
		return pis;
	}
	public void setPis(int pis) {
		this.pis = pis;
	}
	
	
}
