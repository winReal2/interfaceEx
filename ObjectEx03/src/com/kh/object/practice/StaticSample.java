package com.kh.object.practice;

public class StaticSample {
	
	// 접근제한자가 private이므로 직접 접근이 불가
	// 이때, setter, getter메소드를 이용
	private static String value;

	//static 키워드를 붙여주면 생성자를 생성하지 않고 호출할 수 있음
	public static void toUpper() {
		// 모두 대문자로 변경 후 저장
		// 반환된 값을 value에 꼭! 넣어줌
		value = value.toUpperCase();
	}
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value값을 전달받은 문자로 변경하는 static 메소드
		// String 문자열을 char[]로 반환하면 한글자씩 배열의 방에 저장
		char[] charArr = value.toCharArray();
		// 배열이름[방번호] = 값;
		// 값을 배열의 방번호에 입력 => 덮어쓰기
		charArr[index] = c;
	
		//value에 담아줘야함
		value = String.valueOf(charArr);
//		System.out.println("char[] 출력=============");
//		for(char charValue: charArr) {
//			System.out.println(charValue);
//		}
	}
	public static int valueLength() {
		// str.length() : 문자열의 길이를 반환
		return value.length();
	}
	public static String valueConcat(String str) {
		// str.concat() : 문자열을 연결하여 반환
		// value = value.concat(str);
		return value.concat(str);
	}
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value = value;
	}
}
