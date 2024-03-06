package Exam;

public class Exam2 {

	public static void main(String[] args) {
		char[] arr = {'M','e','r','r','y',' ','C','h','r','i','s','t','m','a','s'};
		char[] obj = new char[arr.length];
		//System.arraycopy(arr, 0, obj, 0, arr.length);
		//대문자 A:65 , 소문자 a:97
		for(int i=0;i<arr.length;i++) {
			int a= arr[i];
			if(a>=96) {
				obj[i] = (char) (a-32);
				
			}else {
				obj[i] = arr[i];
			}
			System.out.print(obj[i]);
			
		}
		
		
	}

}
