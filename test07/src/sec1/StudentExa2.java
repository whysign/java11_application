package sec1;
public class StudentExa2 {
//2차원 배열 (5x4)
	public static void main(String[] args) {
		int s[][] = {{1,90,90,90},{2,80,70,60},{3,54,44,87},{7,9,7,4},{7,48,87,98}};
		for(int i=0;i<5.length;i++) {
			int tot=0;
			double avg=0.0f;
			String hak ="F";
			for(int j=1;j<s[i].length;j++) {
				tot+=s[i][j];
			}
		avg= tot/ 3.0f;
		if(avg>=90) {				
				hak ="A";
	   }
		else if(avg>=80){
			hak ="B";
		}
		else if(avg>=70) {
			hak ="C";
		}
		else if(avg>=60) {
			hak ="D";
		}
		else  {
			hak="F";
		}
		System.out.printf("%d\t%d\t%d\t");
	}
	

  }
}