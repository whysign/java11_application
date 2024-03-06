package sec2;

public class Arraycopy2 {

	public static void main(String[] args) {
		int[] arr1 = {80,70,65,90,85,95,60};
		int[] arr2 = {5,3,8,7,6,4,2};
		int[] arr3 = {3,8,4,7,6,7,8};
		int[] arr4 = {3,8,4,7,6,7,8};
		System.out.println("arr1"+arr1);
		System.out.println("arr2"+arr2);
		System.out.println("arr3"+arr3);
		arr2=arr1;
		for(int i=0;i<arr1.length;i++) { // 1대1전달 => 깊은 복제 얕은 복제처럼 복제를하되 아예 다른구성으로 바뀌는것
			arr3[i] = arr1[i];			
		}
		//System.arraycopy(원본,원본시작위치,복사배열,복사본의시작위치,개수);
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		arr1[2] =75;
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("");
		
	}

}
