package sec1;
//Enum : ���������� ����̳� �ν��Ͻ� �� �����Ҽ��Ѿ��� => public ,static,final
// ������ ���� �ǹ̸� ��Ȯ�ϰ� �ؾ� �ϰų� �����Ͻÿ� ������ Ÿ�� �� ��ȿ�� üũ�� �Ϸ��� �Ұ�� Ȱ�� �⺻�� �������̾߱�
enum Week1 {
	sun ,mon,tue,wed,thu,fri,sat
}
//valueOf(String str) -���ڿ� str�� ��ġ�ϴ� ���Ű��� ��ȯ
//values ():��������ü�� �迭�ι�ȯ
//ordinal() : ���� �� ������ ��ȯ
enum Week2{
	sun("��"),mon("��"), tue("ȭ"),wed("��"),thu("��"),fri("��"),sat("��");
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
