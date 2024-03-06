package sec1;

public class StudentExam1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		Student su4 = new Student();
		su2 =su1 ; //얕은 복제			
		Student su3 = (Student) su1.clone();	
		System.out.println(su1.getClass().toString());//해당 인스턴스의 클래스 이름 출력
		System.out.println(su1 instanceof Student);//su1 인스턴스가 Student 클래스로 부터 속하는가. instanceof <= 는 연산자다 
		System.out.println(su1.toString()); //su1.toString() 은 현재 인스턴스에 대한 stack 에 있는 heep의 위치를 16진수로 출력 
 		System.out.println(su1.equals(su2));// 두 객체(인스턴스)가 같은지 비교
		System.out.println(su1.hashCode()); // hashCode 출력 (주소)
		System.out.println(su3.equals(su1));//su3과 su1의 주소가 서로 달라 false 로 출력
		//su3와 s1 의 주소가 서로달라 false 로 출력 
		//system.out.println(su3.equals(su1));
		//Student 클래스에 equals를 모든 멤버 필드에 대하여 비교하는 오버라이딩을 해주면,값비교가가능
	}

}
