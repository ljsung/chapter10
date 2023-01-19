package com.greedy.section03;

public class Application {

	public static void main(String[] args) {
		
		/* StraingBuilder와 StringBuffer
		 * Stringbuilder : 스레드 동기화 기능 제공하지 않음
		 * 				   스레드 동기화 처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
		 * StringBuffer  : 스레드 동기화 기능 제공함
		 * 				   성능면에서는 StringBuilder보다 느림
		 * */

		/* String과 StringBuilder
		 * String : 불변이라는 특성을 가지고 있다.
		 * 			문자열에 + 연산으로 합치기 하는 경우, 기존 인스턴스를 수정하지 않고 새로운 인스턴스를 생성한다.
		 * 			따라서 문자열 변경이 자주 일어나는 경우 성능면에서 좋지 않다.
		 * 			하지만 변하지 않는 문자열을 자주 읽어들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
		 * StringBuilder : 가변이라는 특성을 가지고 있다.
		 *				   문자열에 append() 메소드를 이용하여 합치기 하는 경우
		 *				   기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다. 
		 * */
		
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb : " + sb );
		
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
		sb.append("oracle");
		
		System.out.println("sb : " + sb);
		
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
	}

}
