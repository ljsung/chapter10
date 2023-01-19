package com.greedy.section04.wrapper;

public class Application {

	public static void main(String[] args) {


		/*wrapper 클래스
		 * 상황에 따라 기본 타임의 데이터를 인스턴스와 해야 하는 경우들이 발생한다.
		 * 이 떄 기본 타임의 데이터를 먼저 인스턴스 변환 후 사용해야 하는데
		 * 8가지 기본자료형의 해당하는 데이터를 인스턴스화 할 수 있도록 클래스의 집합을 wrapper class라고 한다.*/
		/*박싱(Boxing)과 언박싱(UnBoxing)
		 * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며
		 * 래퍼클래스 타입의 인스턴스를 기본 타임으로 변환하는 것을 언박싱(UnBoxing)이라고 한다.*/
		int inValue =20;
		Integer boxingNumber1 = new Integer(inValue); //인스턴스화 -박싱(Boxing)
		Integer boxingNumber2 = Integer.valueOf(inValue);	//static 메소드 이용
		int unBoxingNumber1 = boxingNumber1.intValue(); //언박싱(UnBoxing)
		/*오토박싱(AutoBoxing)과 오토언박싱(AutoUnBoxing)
		 * JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.*/
		Integer boxingNumber3 = inValue; //오토 박싱
		int unBoxingNumber2 = boxingNumber3; //오토 언박싱
		/* Wapper 클래스 자료형 값 비교*/
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		Integer integerNum5 = Integer.valueOf(20);
		Integer integerNum6 = Integer.valueOf(20);
		System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
		System.out.println("int와 Integer 비교 : " + (inum == integerNum3));
		System.out.println("Integer와 Integer 비교 :" + (integerNum1 ==integerNum2));
		System.out.println("Integer와 Integer 비교 :" + (integerNum1 ==integerNum3));
		System.out.println("Integer와 Integer 비교 :" + (integerNum5 ==integerNum6));
		System.out.println("Integer와 Integer 비교 :" + (integerNum4 ==integerNum5));
		System.out.println("Integer와 Integer 비교 :" + (integerNum1 ==integerNum5));
		System.out.println("equals() :" + (integerNum1.equals(integerNum1)));
		System.out.println("equals() :" + (integerNum1.equals(integerNum3)));
		System.out.println("equals() :" + (integerNum1.equals(integerNum5)));
	}
}