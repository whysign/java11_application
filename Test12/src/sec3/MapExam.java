package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapExam {

	public static void main(String[] args) {
		//Map은 List처럼 index가 존재하는것이 아니라 키가 존재한다
		//순서 유지가 되지않는다.
		Map<String , Integer> map1 =new HashMap <>();
		Map<String , String> map2 =new Hashtable <>();
		Map<Integer , String> map3 =new TreeMap <>();
		Properties map4 = new Properties();
		
		
		map1.put("park", 100); //put 은 추가
		map1.put("kim", 80);
		map1.put("kang", 70);
		map1.put("kwon", 80);
		map1.put("lee", 70);
		System.out.println(map1);
		System.out.println("park : "+map1.get("park"));//개별 요소 접근시 인덱스가 아니라 키로 해야한다.
		//keys : kim, lee,park,kang,kwon
		//앱 순회 1 : Iterator(분리자)에 의한 접근
		Iterator<String> keys =map1.keySet().iterator(); //맵의 키모음(keySet)이 하나의 요소로 가져옴
		while(keys.hasNext()) {
			String key =keys.next();
			System.out.println(key +"m"+map1.get(key));
		}
		
		//맵 순회 2 : entrySet(키와 값의 쌍 => entry)에 의한 접근   !중요!
		for(Map.Entry<String, Integer> en : map1.entrySet()) {
			String key = en.getKey();
			Integer value =en.getValue();
			System.out.println(key +" : "+value);
		}
		//맵순회 3 :keyset에의한접근
		System.out.println("keyset에 의한순회");
		for(String key:map1.keySet()) {
			System.out.println(key+" : "+map1.get(key));
		}
		System.out.println();
		
					
		if(map1.containsKey("kang")) {//특정 키의 존재유무
			System.out.println("kang : " +map1.get("kang"));
		}else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다.");
		}
		if(map1.containsValue(100)) {
			System.out.println("100 만점자가 존재함");
		}else {
			System.out.println("100 만점자가 존재하지않음");
		}
		map2.put("김", "1코스"); //키는 중복될 수 없음
		map2.put("이", "2코스");
		map2.put("박", "3코스");
		map2.put("김", "2코스");	
		map2.put("최", "1코스");
		map2.put("이", "3코스");
		System.out.println(map2);
		map2.remove("김");
		System.out.println("*****편집 후 *****");
		System.out.println(map2);
		map2.clear();
		System.out.println("****** 비우기 후 *****");
		System.out.println(map2);
		
		//배열의 값을 TreeMap에 대입
		String[] names = {"q","w","e","r","t","y","a","v","b","d"};
		for(int i=0 ;i<=9;i++) {
			map3.put(i,names[i]);
		}
		System.out.println("인원수 : " +map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(i);
			System.out.println(key+ " : " +value);
		}
		System.out.println();
		
		//Properties의 키(필드이름) 값은 모두 문자열로 취급된다.
		map4.setProperty("name", "박은성");
		map4.setProperty("age", "25");
		map4.setProperty("height", "180.4");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "70");
		map4.setProperty("mat", "100");
		System.out.println("이름 : " +map4.getProperty("name"));
	}

}
