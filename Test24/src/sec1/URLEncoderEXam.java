package sec1;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderEXam {
	public URLEncoderEXam() {
		String msg = "abc������def1234����";
		String enc_data;
		try {
			enc_data =URLEncoder.encode(msg,"UTF-8");
			System.out.println("���ڵ� : "+enc_data);
			
			String dec_data =URLDecoder.decode(enc_data,"UTF-8");
			System.out.println("���ڵ�: "+dec_data);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) { new URLEncoderEXam();}
		
	}


