package sec2;

public class StringBuilderExam {

	public static void main(String[] args) {
		String str =new String("java programmer");
		str += "junier Level";
		str += "Develope";
		System.out.println(str);
		
		StringBuilder sb =new StringBuilder();
		sb.append("java");
		sb.append(11);
		sb.append("programmer");
		sb.insert(6,"web"); //중간에 끼워넣기
		sb.insert(0,"KH");
		System.out.println(sb);
		
	}

}
