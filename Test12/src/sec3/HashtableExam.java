package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExam {

	public static void main(String[] args) {
		Hashtable<String,Integer>hash =new Hashtable<>();
		hash.put("서울", 1);
		hash.put("부산", 2);
		hash.put("인천", 3);
		hash.put("대구", 4);
		hash.put("대전", 5);
		hash.put("광주", 6);
		hash.put("울산", 7);
		
		//Hash table의 요소의 수를출력
		System.out.println("hash 앤트리 수"+hash.size());
		//Hash table의 키가 "광주"인 요소가 존재하는지 비교
		if(hash.containsKey("광주")) {
			System.out.println("현재 키가 존재");
		}else {
			System.out.println("현재 키가 존재x");
		}
		//Hash table의 키만 Set으로 저장한 후 출력
		Set<String> keySet = hash.keySet();
		System.out.println("Hash의 키" +keySet);
		//Hash tabledptj 키가 "대구"인요소 제거
		hash.remove(4);
		//Hash table의 순회하여 모든 엔트리 키와 값을 출력
		for(String i : hash.keySet()) {
			System.out.println(i+" : "+hash.get(i));
		}
	}

}
