package kh.lclass;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		String[] strArr = new String[3]; //배열 크기가 3이므로 값은 0 1 2 까지만 가능
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = new String("mango");
		//strArr을 복사할 strCopyArr 생성
		System.out.println(strArr[1]);
		
		String[] strCopyArr = new String[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			strCopyArr[i] = strArr[i];
		}
		strArr[2] = "orange";
		strCopyArr[1] = "딸기";
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " : " + strCopyArr[i]);
		}
		System.out.println("=======================");
		
		int a = 10;
		//a
		int[] arrA = new int[3];
		arrA[2] = 20;
		int[] arrB = arrA.clone();
		System.out.println(arrB.length);
		System.out.println(arrB[2]);
		
		System.out.println("==========Arrays.copyOf==========");
		String[] strCopyArr2 = Arrays.copyOf(strArr, 5); // exception이 일어나지 않도록 해줌 방은 5개, 개수는 3개 나머지 2=> null 
		for(int i = 0; i < strCopyArr2.length; i++) {
			System.out.println(strCopyArr2[i]);
		}
		System.out.println("=====system======");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strArr, 1, strCopyArr3, 0, 2);
		// strArr방의 두번째 값을 strCopyArr3방 첫번째자리로 2개 복사해달라
		
		for(int i = 0; i < strCopyArr3.length; i++) {
			System.out.println(strCopyArr3[i]);
		}
		
		String[] strArr2 = {"apple","banana",new String("mango")};
		String[] strArr3 = {new String("apple"), new String("banana"), new String("mango")};
		String[] strArr4 = new String[] {"apple", "banana", new String("mango")};
		String[] strArr5 = new String[] {new String("apple"), new String("banana"), new String("mango")};
		
		System.out.println("strArr의 1번째 과일은 " + strArr[0]);
		System.out.println("strArr의 2번째 과일은 " + strArr[1]);
		System.out.println("strArr의 3번째 과일은 " + strArr[2]);
		System.out.println("strArr의 3번째 과일은 " + strArr[strArr.length-1]);
		
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
//		for(int i = 0; i <= strArr.length-1; i++) {
		for(int i = 0; i < strArr.length; i++) {
			System.out.println("strArr의 " + i + "번째 과일은 " + strArr[i]);
			System.out.printf("strArr의 %d번째 과일은 %s\n", i, strArr[i]);
		}
		
		
		//오류발생 IndexOutOfBoundsException
		//System.out.println(strArr[3]);
				
		int[] intArr = new int[3];
		System.out.println(intArr[2]);
		
		int[] intArr2 = new int[] {1,2,3}; // 초기화 -> 방 개수 정해줄 필요 없이 초기값 나열만 하면 됨
		int[] intArr3 = {1,2,3};
		
		//Student[] studentArr = new
		
		
				
	}

}
