package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "박은성";
		String name2 = new String("박은성");
		Integer su1 =1004;
		String su2 = "1004";
		//String su3 = new String(su1); 이렇게하면 오류다 해결법
		String su3 =String.valueOf(su1); //문자열로 변경 중요!!
		System.out.println("su1 equals su2 : "+su1.equals(su3));
		System.out.println("su1 equals su2 : "+su2.equals(su3)); // 문자열비교 중요!!
		
		
		String str = "박은성/홍민석/이수훈/이시현/김영인/안호진";
		String[] names = new String[6];
		names =str.split("/");
		for(String s:names) {
			System.out.println(s);
		}
		String str2 = String.join("/", names); //중요!!  문자열 합치기
		System.out.println(str2);
		String data = " ivE\'s beaUty grOup\nnewJeans is girlGroup Top";
		
		//10번째 문자 (인덱스가7인 문자)
		char ten  =data.charAt(0);
		System.out.println("10번쨰 문자 (인덱스가 9인 문자) : "+ten);
		String trimData =data.trim(); // 앞뒤의 공백을 제거하여 tirmData에 저장
		System.out.println("앞뒤 공백을 제거 : " +trimData.length()+"글자,"+trimData);
		int size = data.trim().length(); //글자수를 size 에저장
		System.out.println("앞 뒤 공백을 제거한 글자수"+size);
		int n = data.indexOf('n'); //n의 글자 위치(인덱스)를 n 에저장
		System.out.println("n의 글자 위치를 n에 저장"+n);
		String ip = data.toUpperCase();//모두 대문자로 변환하여 up에 저장
		System.out.println("모두대문자로변경 up저장");
		String down = data.toLowerCase(); //모두 소문자로 변환하여 down에 저장
		System.out.println("모두소문자로변경 down저장");
		String sub1 =data.substring(20,28); //공백을 제거하고, 모두 대문자로 변경하여 20번째 글자부터 27번째만 추출
		System.out.println("공백을제거하고 20번째 부터 27번쨰만 추출항 sub1에 저장"+sub1);
		String sub2 =data.replace("newJeans", "Kepler"); //newJeans의 단어를 kepler로 변경하여 sub2에 저장 
		System.out.println("newjeans의 단어를 kepler로 변경하여 sub2 에저장"+sub2);
		byte[] girl = data.trim().getBytes(); //문자열을 girl 문자배열로 변환하여 저장
		System.out.println("글자 수 : " +girl.length);
		for(byte b:girl) {
			char k =(char) b;
			System.out.println(b);
		}
		String girlgroup =data.substring(data.lastIndexOf('g'),data.lastIndexOf('g')+9); // girl의 g의 마지막
		girlgroup =girlgroup + " " +sub1;
		System.out.println("girlgroup : "+girlgroup);
		//문자(byte)배열을 문자열(String)으로 변환 출력
		String str4 = new String(girl) ;
		System.out.println(str4);
	}

}
