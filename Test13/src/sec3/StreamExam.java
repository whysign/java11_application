package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

//Stream : 연속된 복합체로 이루어진 데이터 
//stream 방식이란? 연속된 복합체인 컬렉션 프레임워를 훨씬 간결하고,효과적으로 처리하기
//위한 람다식 방식의 처리
//배열형은 별도의 stream을 생성하지않고,Arrays 클래스를 활용
//Arrays.stream(연속된 복합체).메소드();
public class StreamExam {
	public static void main(String[] args) {
		int[] arr = {92,89,64,94,78}; //배열선언		
		Arrays.stream(arr).forEach(n ->System.out.println(n));	
		int sum =Arrays.stream(arr).sum();	
		OptionalDouble avg =Arrays.stream(arr).average();		
		OptionalInt max = Arrays.stream(arr).max();		
		OptionalInt min = Arrays.stream(arr).min();		
		int cnt = (int)Arrays.stream(arr).count();
		System.out.println("arr의 개수 : "+cnt);
		System.out.println("arr의 총점 : "+sum);
		System.out.println("arr의평균  : "+avg);
		System.out.println("arr의 최고점수 :"+max);
		System.out.println("arr의 최저점수 :"+min);
	}
}
