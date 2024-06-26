package sec3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream 방식 활용
//Stream.메소드();
public class StreamExam2 {
	public static void main(String[] args) {
		List<String> lst =new ArrayList<>();
		
		lst.add("q");
		lst.add("w");
		lst.add("e");
		lst.add("r");
		lst.add("a");
		lst.add("d");
		
		//ArrayList의 Stream화
		Stream<String> stream = lst.stream();
		System.out.println("정렬 전");
		stream.forEach(s -> System.out.println(s)); //람다식 표기법
		System.out.println("정렬 후");
		lst.stream().sorted().forEach(s-> System.out.println(s));
		//요소의 수 계산하여 출력
		int cnt =(int) lst.stream().count();
		System.out.println("인원수 : "+cnt);				
	}
}