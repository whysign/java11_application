package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern : Æ¯Á¤ µ¥ÀÌÅÍ°¡  Çü½ÄÀÌ ¸Â´ÂÁö ºñ±³ÇÏ·Á°í ÇÒ °æ¿ì  Æ¯Á¤ µ¥ÀÌÅÍ Çü½ÄÀ» ÁöÁ¤ÇÏ´Â Å¬·¡½º
// Matcher : Æ¯Á¤ ÆĞÅÏÀÇ ÇüÅÂ°¡ ¸Â´ÂÁö ºñ±³ÇÏ´Â Å¬·¡½º 
// Á¤±Ô½Ä (Reg Expression) 
public class PatternExam1 {
	public static void main(String[] args) {
		String[] dt ={"bag","pes0722","9to6","8to5","single","mom","abc","¹ÚÀº¼º"};
		//Pattern p = Pattern.compile("[a-z]*");//¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ	
		//Pattern p = Pattern.compile("[0-9a-z]*"); //¼ıÀÚ¿Í ¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ 
		//Pattern p = Pattern.compile("[A-Za-z]*"); //¿µ¹®´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ 
		//Pattern p = Pattern.compile("s[A-Za-z]*"); //s·Î ½ÃÀÛÇÏ¸é¼­ ¿µ¹® ´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("[°¡-ÆR]*"); //ÇÑ±Û·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ,[°¡ -ÆR] ÀÌ±¹Á¦Ç¥ÁØ¾î´Ù
		//Pattern p = Pattern.compile("[e$]*"); // Æ¯Á¤ ¹®ÀÚ·Î ³¡³ª´Â °æ¿ì ¹®ÀÚµÚ¿¡ $ Àû´Â´Ù.
		//Pattern p = Pattern.compile("^b"); //Æ¯Á¤¹®ÀÚ·Î ½ÃÀÛÇÏ´Â °æ¿ì ¹®ÀÚ¾Õ¿¡ ^
		//Pattern p = Pattern.compile("^[0~9]*");// ¸ğµç°ªÀÌ ¼ıÀÚÀÎ µ¥ÀÌÅÍ
		Pattern p = Pattern.compile("[a-z]*");
 		for(int i=0;i<dt.length;i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("Çü½ÄÀÏÄ¡ :"+dt[i]);
			}
		}
	}
}
