package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();
		
		for(int i=1;i<=10;i++) {
			Member mem = new Member(i,"park"+i,"whdab"+i+i,"박"+i,0);
			memList.add(mem);
			
		}		
			Member mem2 = new Member(11,"kim","zxcv123","박은성",0);
					
			memList.add(mem2);
		
		for(int i=0;i<memList.size();i++) {
			Member m= memList.get(i);
			System.out.println(m.toString());
		}
		for(Member m : memList) {
			System.out.println(m.toString());//List순회
		}
		
		memList.remove(3);
		Member tmp1 = new Member(11,"park","whdab","은성",0);
		System.out.println(tmp1.getId()+"의 존재유무 : "+memList.contains(tmp1));
		for(int i=0;i<memList.size();i++) {
			Member m= memList.get(i);
			System.out.println(m.toString());
		}
		
		if(memList2.isEmpty()) {
			System.out.println("비어 있는 리스트입니다");
		}else {
			System.out.println("내용이 있는 리스트입니다");
		}
		List<String>names =new ArrayList<>();
		names.add("이민구");
		names.add("김영환");
		names.add("이수정");
		names.add("이시현");
		names.add("이시연");
		names.add("홍민석");
		names.add("박범재");
		names.set(2, "박범수");
		
		if(names.contains("홍민석")) {
			System.out.println("홍민석의 데이터가 존재합니다.");
		}else {
			System.out.println("홍민석의 데이터가 존재하지 않습니다.");
			names.add("홍민석");
		}
		for(String s : names) {
			System.out.println(s);
		}
		names.clear();
		if(names.isEmpty()) { // if(names.isEmpty()) 중요하니 기억해두자
			System.out.println("리스트가 비어 있습니다");
		}else {
			for(String s: names) {
				System.out.println(s);
			}
		}
		
	} 	
		//add , remove , contains , isEmpty , size , get 이것들도 코딩할때마다 거의사용되니
		//기억해두자
}
