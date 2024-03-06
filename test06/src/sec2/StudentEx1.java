package sec2;


public class StudentEx1 {

	public static void main(String[] args) {
		Student s1 = new Student("박은성",1,100000);
		Student s2 = new Student("이수훈",2,200000);
		Student s3 = new Student("홍민석",3,300000);
		
		
		Bus bus1 = new Bus(36);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		
		//이수훈 학생이 버스(36번을)를 두 번 이용하고,지하철을 2호선을 세 번 이용했을경우
		//이수훈 학생이 정보와 버스 36번 정보와 지하철 2호선의 정보를 출력해라.
		Subway sub1= new Subway(2);
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub1);
		s2.takeSubway(sub1);
		s2.takeSubway(sub1);
		s2.print();
		sub1.show();
		bus1.show();
	}

}
