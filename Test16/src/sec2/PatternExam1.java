package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern : Ư�� �����Ͱ�  ������ �´��� ���Ϸ��� �� ���  Ư�� ������ ������ �����ϴ� Ŭ����
// Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ���� 
// ���Խ� (Reg Expression) 
public class PatternExam1 {
	public static void main(String[] args) {
		String[] dt ={"bag","pes0722","9to6","8to5","single","mom","abc","������"};
		//Pattern p = Pattern.compile("[a-z]*");//���� �ҹ��ڷθ� ������ ������	
		//Pattern p = Pattern.compile("[0-9a-z]*"); //���ڿ� ���� �ҹ��ڷθ� ������ ������ 
		//Pattern p = Pattern.compile("[A-Za-z]*"); //�����빮�� �Ǵ� �ҹ��� �θ� ������ ������ 
		//Pattern p = Pattern.compile("s[A-Za-z]*"); //s�� �����ϸ鼭 ���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������
		//Pattern p = Pattern.compile("[��-�R]*"); //�ѱ۷θ� ������ ������,[�� -�R] �̱���ǥ�ؾ��
		//Pattern p = Pattern.compile("[e$]*"); // Ư�� ���ڷ� ������ ��� ���ڵڿ� $ ���´�.
		//Pattern p = Pattern.compile("^b"); //Ư�����ڷ� �����ϴ� ��� ���ھտ� ^
		//Pattern p = Pattern.compile("^[0~9]*");// ��簪�� ������ ������
		Pattern p = Pattern.compile("[a-z]*");
 		for(int i=0;i<dt.length;i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("������ġ :"+dt[i]);
			}
		}
	}
}
