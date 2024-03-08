package sec1;
//Enum : 열거형으로 상속이나 인스턴스 를 생성할수ㅡ없음 => public ,static,final
// 데이터 값의 의미를 명확하게 해야 하거나 컴파일시에 데이터 타입 및 유효성 체크를 하려고 할경우 활용 기본이 상수라는이야기
enum Week1 {
	sun ,mon,tue,wed,thu,fri,sat
}
//valueOf(String str) -문자열 str과 일치하는 열거값을 반환
//values ():열거형전체를 배열로반환
//ordinal() : 열거 형 순서를 반환
enum Week2{
	sun("일"),mon("월"), tue("화"),wed("수"),thu("목"),fri("금"),sat("토");
	private String day;
	Week2(String day){
		this.day =day;
	}
	String getDay() {
		return day;
	}
}
public class EnumExam1 {

	public static void main(String[] args) {
		String s ="mon";					
	}
}
