package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {
	public static void main(String[] args) {
		Pattern p =Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$"); //이메일패턴
		String[] email = {"ysys1017", "pes0722@naver.com", "rkd573@nate.com", "rkd573@daum.net"};	
		for (int i=0;i<email.length;i++) {
			Matcher m = p.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다");
				System.out.println(email[i]);
			}
		}
		Pattern p2 =Pattern.compile("010-\\d{3,4}-\\d{4}");
		String[] phone = {"010-5017-5606","010-1234-5678","02-1234-4571","032-7979-2424","010-234-4877","031-7878-2444"};
		for(int i=0; i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("휴대폰 형식이 맞습니다");
				System.out.println(phone[i]);
			}
		}
		Pattern p3 =Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		String[]jm = {"941207-2134567","010203-6789012","3812256-2234567","851019-234567","780528-2456123"};
		for(int i=0; i<jm.length;i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches()) {
				System.out.println("주민번호 형식이 맞습니다");
				System.out.println(jm[i]);
			}
		}
		Pattern p4 =Pattern.compile("\\-[1-7]\\d{4}\\d{2}");
		//우편번호패턴 100번대(1xx-yy)~700번대(7xx-yy)
		String[]post = {"123-123","212-34","816-24","5434-54","683-39"};
		for(int i=0; i<post.length;i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches()) {
				System.out.println("맞는 우편번호입니다");
				System.out.println(post[i]);
			}
		}
		Pattern p5 =Pattern.compile("(?=.*[a=z])(?=.*[A-z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");
		String[]pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432","KIM#1004"};
		for(int i=0; i<pw.length;i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("맞는 비밀번호입니다");
				System.out.println(pw[i]);
			}
		}
	}
}
